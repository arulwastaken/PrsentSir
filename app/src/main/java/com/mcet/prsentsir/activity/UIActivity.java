package com.mcet.prsentsir.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mcet.prsentsir.R;
import com.mcet.prsentsir.SessionManager;

public class UIActivity extends AppCompatActivity {
    // Session Manager Class
    SessionManager session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_login);
        Toolbar toolbar = findViewById(R.id.tb_main);
        toolbar.setSubtitle("User Name");
        setSupportActionBar(toolbar);

        session = new SessionManager(getApplicationContext());

        String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
                "WebOS","Ubuntu","Windows7","Max OS X"};
//
//        ArrayAdapter adapter = new ArrayAdapter<String>(this,
//                R.layout.listview_container, mobileArray);
//
//        ListView listView = (ListView) findViewById(R.id.mobile_list);
//        listView.setAdapter(adapter);
    }

}
