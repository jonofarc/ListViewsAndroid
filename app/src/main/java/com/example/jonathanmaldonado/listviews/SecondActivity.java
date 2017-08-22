package com.example.jonathanmaldonado.listviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private  ListView listView;
    private ArrayList<String> arrayList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        arrayList = new ArrayList();
        for(int i = 0; i<5000; i++){


            arrayList.add("Entry #"+i + "with View Holder");

        }

        listView = (ListView) findViewById(R.id.items_display_layout_with_VH);


        CustomAdapter adapterView = new CustomAdapter(SecondActivity.this,R.layout.my_list_item,arrayList);
        //CustomAdapter adapterView = new CustomAdapter<String>(this, R.layout.my_list_item, R.id.list_item_text_view, arrayList);

        listView.setAdapter(adapterView);



    }

    public void StartMainActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);




    }
}
