package com.example.my_pageviewdemo.History;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
/*
import com.example.my_pageviewdemo.App;*/
import com.example.my_pageviewdemo.App;
import com.example.my_pageviewdemo.Model.Entry;
import com.example.my_pageviewdemo.R;
import java.util.ArrayList;
/**
 * Created by Julio on 28/07/2015.
 */
public class HistoryAdapter extends BaseAdapter {

    private ArrayList<Entry> history;
    private LayoutInflater mLayoutInflanter = (LayoutInflater) App.getInstance().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    private ViewHolder holder;
    Context context;

    public void setData(ArrayList<Entry> _history){
        history = _history;
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if(view == null){
            holder = new ViewHolder();
            view = mLayoutInflanter.inflate(R.layout.listview_history,null);

            holder.txtListName = (TextView) view.findViewById(R.id.txtListName);
            holder.txtListAutoPlate = (TextView) view.findViewById(R.id.txtListPhone);
            holder.txtListPhone = (TextView) view.findViewById(R.id.txtListPhone);
            holder.txtListCompany = (TextView) view.findViewById(R.id.txtListCompany);
            holder.txtListAddress = (TextView) view.findViewById(R.id.txtListAddress);

        }
        else
            holder  = (ViewHolder) view.getTag();

        holder.txtListName.setText((history.get(position).getName()));
        holder.txtListPhone.setText((history.get(position).getPhone()));
        holder.txtListAutoPlate.setText((history.get(position).getAutoplate()));
        holder.txtListCompany.setText((history.get(position).getCompany()));
        holder.txtListAddress.setText((history.get(position).getAddress()));

        return view;
    }
    private class ViewHolder{
        private TextView txtListName,txtListAutoPlate,txtListPhone,txtListAddress,txtListCompany;
    }
    @Override
    public int getCount() {
        return history.size();
    }

    @Override
    public Object getItem(int position) {
        return history.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}