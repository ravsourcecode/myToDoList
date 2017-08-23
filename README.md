# Pre-work - My ToDo List

My ToDo List is an android app that allows building a todo list and basic todo items management functionality including adding new items, editing and deleting an existing item.

Submitted by: Ravi K

Time spent: 9 hours spent in total

## User Stories

The following **required** functionality is completed:

* [Y] User can **successfully add and remove items** from the todo list
* [Y] User can **tap a todo item in the list and bring up an edit screen for the todo item** and then have any changes to the text reflected in the todo list.
* [Y] User can **persist todo items** and retrieve them properly on app restart

The following **optional** features are implemented:

* [N] Persist the todo items [into SQLite](http://guides.codepath.com/android/Persisting-Data-to-the-Device#sqlite) instead of a text file
* [N] Improve style of the todo items in the list [using a custom adapter](http://guides.codepath.com/android/Using-an-ArrayAdapter-with-ListView)
* [N] Add support for completion due dates for todo items (and display within listview item)
* [N] Use a [DialogFragment](http://guides.codepath.com/android/Using-DialogFragment) instead of new Activity for editing items
* [N] Add support for selecting the priority of each todo item (and display in listview item)
* [N] Tweak the style improving the UI / UX, play with colors, images or backgrounds

The following **additional** features are implemented:

* [N] List anything else that you can get done to improve the app functionality!

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='http://imgur.com/a/a7Of2' title='Video Walkthrough' width='' alt='Video Walkthrough' />  or http://imgur.com/a/a7Of2

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Project Analysis

As part of your pre-work submission, please reflect on the app and answer the following questions below:

**Question 1:** "What are your reactions to the Android app development platform so far? Compare and contrast Android's approach to layouts and user interfaces in past platforms you've used."

**Answer:** I had tried android development in the past but got stuck in the setup and issues related to that. Steps and documentation mentioned in the codepath is concise and clear. It was a good experience. 
    I have used JSP, Servlet in the past to create web application. Android's approach from concept point of view is simillar but much better. In JSP-Servelet world, HttpRequest & HttpResponse objects are used where as in android world, its INTENT.
    In JSP-Servlet world button onclick event is analogous to button ONCLICK event in android world. 

**Question 2:** "Take a moment to reflect on the `ArrayAdapter` used in your pre-work. How would you describe an adapter in this context and what is its function in Android? Why do you think the adapter is important? Explain the purpose of the `convertView` in the `getView` method of the `ArrayAdapter`."

**Answer:** ArrayAdapter is an interface between ArrayList and ListView. In other words it fits between datasource and visual representation. 
ArrayAdapter is simplest form of adapter that converts arraylist of objects into view items loaded into ListView container.
getView - Get a View that displays the data at the specified position in the data set.
convertView - It's a parameter for getView method, of type View. the old view to reuse, if possible. Note: You should check that this view is non-null and of an appropriate type before using. If it is not possible to convert this view to display the correct data, this method can create a new view.

## Notes

Describe any challenges encountered while building the app.
I had issue with OnClick listener for ListView while working on Edit Item activity. Apart from that codepath's steps and documentation is very well explained.

## License

    Copyright [2017] [Ravi K]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
