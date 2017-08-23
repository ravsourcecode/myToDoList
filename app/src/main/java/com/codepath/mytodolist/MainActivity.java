package com.codepath.mytodolist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ArrayList<String> items;
    ArrayAdapter<String> itemsAdapter;
    ListView lvItems;
    private final int REQUEST_CODE = 1;
    int listViewPos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        items = new ArrayList<String>();
        readFile();

        lvItems =  (ListView) findViewById(R.id.lvItems);
        itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        lvItems.setAdapter(itemsAdapter);
        setupListViewListener();
        lvItems.setOnItemClickListener(this);
    }

    private void setupListViewListener() {
        lvItems.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(){

            @Override
            public boolean onItemLongClick (AdapterView adapterView, View view, int pos, long id){
                items.remove(pos);
                itemsAdapter.notifyDataSetChanged();
                writeFile();

                return true;
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {
                String output = data.getStringExtra("output");

                items.set(listViewPos, output);
                itemsAdapter.notifyDataSetChanged();
                writeFile();
            }

            if (resultCode == Activity.RESULT_CANCELED){
                //TODO for future
            }
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int pos, long id) {
        listViewPos = pos;
        Intent i = new Intent(MainActivity.this, EditActivity.class);
        i.putExtra("input", items.get(pos));
        startActivityForResult(i, REQUEST_CODE);
    }

    public void onAddItem(View v){
        String str;

        EditText editText = (EditText) findViewById(R.id.eNewItem);
        str = editText.getText().toString();
        if (!str.isEmpty()){
            items.add(str);
            editText.setText("");
            writeFile();
        }
    }

    public void readFile(){
        File dir = getFilesDir();
        File textFile = new File(dir, "todo.txt");

        try{
            items = new ArrayList<String>(FileUtils.readLines(textFile)) ;
        }catch(IOException e){
            items = new ArrayList<String>();
        }

    }

    public void writeFile(){
        File dir = getFilesDir();
        File textFile = new File(dir, "todo.txt");

        try {
            FileUtils.writeLines(textFile, items);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
