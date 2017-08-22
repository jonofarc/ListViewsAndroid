package com.example.jonathanmaldonado.listviews;

import android.widget.ArrayAdapter;
import android.widget.TextView;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jonathan Maldonado on 8/21/2017.
 */

public class CustomAdapter extends ArrayAdapter<String> {


    List<String> myList;
    Context myContext;


    public CustomAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<String> objects) {
        super(context, resource, objects);

        myList = objects;
        myContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder myVvHld = new ViewHolder();

        LayoutInflater adapInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //convertView = adapInflater.inflate(R.layout.my_list_item,parent,false);
        convertView = adapInflater.inflate(R.layout.my_list_item,parent,false);

        myVvHld.vhName = (TextView) convertView.findViewById(R.id.list_item_text_view);

        myVvHld.vhName.setText(myList.get(position));

        convertView.setTag(myVvHld);

        return convertView;
    }

    static class ViewHolder{
        TextView vhName;
    }


}
