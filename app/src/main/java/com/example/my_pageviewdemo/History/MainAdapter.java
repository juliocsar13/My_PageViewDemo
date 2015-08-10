package com.example.my_pageviewdemo.History;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.my_pageviewdemo.R;

/**
 * Created by Julio on 09/08/2015.
 */
public class MainAdapter extends BaseAdapter {

    Context context;
    String[] titulo;
    LayoutInflater  inflater;

    public MainAdapter(Context context, String[] titulo){
        this.context = context;
        this.titulo = titulo;

    }



    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View converView, ViewGroup viewGroup) {
        TextView name;
        TextView autoplate;
        TextView address;
        TextView phone;
        TextView company;
        View itemview=null;

        if(converView != null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            itemview = inflater.inflate(R.layout.listview_history, viewGroup, false);
        }
         name = (TextView) itemview.findViewById(R.id.txtListName);
         phone = (TextView) itemview.findViewById(R.id.txtListPhone);
         autoplate = (TextView) itemview.findViewById(R.id.txtListAutoPlate);
         company= (TextView) itemview.findViewById(R.id.txtListCompany);
         address = (TextView) itemview.findViewById(R.id.txtListAddress);

        name.setText(titulo[i]);
        phone.setText(titulo[i]);
        address.setText(titulo[i]);
        autoplate.setText(titulo[i]);
        company.setText(titulo[i]);
        return itemview;
    }
}
