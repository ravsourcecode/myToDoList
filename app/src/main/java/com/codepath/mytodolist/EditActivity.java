package com.codepath.mytodolist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditActivity extends AppCompatActivity {
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        editText2 = (EditText) findViewById(R.id.editText2);

        editText2.setText(getIntent().getStringExtra("input"));

        editText2.setSelection(editText2.getText().length()); //sets cursor to the end
    }

    public void onSaveItem(View view){

        String output = editText2.getText().toString();

        Intent returnIntent = new Intent(EditActivity.this, MainActivity.class);
        returnIntent.putExtra("output", output);
        setResult(Activity.RESULT_OK, returnIntent);

        finish();
    }
}
