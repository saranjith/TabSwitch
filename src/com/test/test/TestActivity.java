/* 
 *This file contains code from "http://developer.android.com/resources/tutorials/views/hello-tabwidget.html"
 * author: Saranjith S
 * twitter: @saranjith 
 */


package com.test.test;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class TestActivity extends TabActivity {
    TabHost tabHost; // The activity TabHost
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        tabHost= getTabHost(); 
        TabHost.TabSpec spec;  // Resusable TabSpec for each tab
        Intent intent;  // Reusable Intent for each tab

        // Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent().setClass(this, FirstActivity.class);

        // Initialize a TabSpec for each tab and add it to the TabHost
        spec = tabHost.newTabSpec("details").setIndicator("Details")
                      .setContent(intent);
        tabHost.addTab(spec);

        // Do the same for the other tabs
        intent = new Intent().setClass(this, SecondActivity.class);
        spec = tabHost.newTabSpec("notes").setIndicator("Notes")
                      .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, ThirdActivity.class);
        spec = tabHost.newTabSpec("comments").setIndicator("Comments")
                      .setContent(intent);
        tabHost.addTab(spec);

        tabHost.setCurrentTab(0);
       
    }
    
   
}