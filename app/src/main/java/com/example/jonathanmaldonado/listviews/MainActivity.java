package com.example.jonathanmaldonado.listviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private  ListView listView;
    private ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList = new ArrayList();

        for(int i = 0; i<5000; i++){


            arrayList.add("Entry #"+i);

        }

        listView = (ListView) findViewById(R.id.items_display_layout_no_VH);

        ListAdapter adapterView = new ArrayAdapter<String>(this, R.layout.my_list_item, R.id.list_item_text_view, arrayList);

       // ListAdapter adapterView = new ArrayAdapter<String>(MainActivity.this,R.layout.my_list_item,arrayList);

        listView.setAdapter(adapterView);
    }


    public void StartSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
