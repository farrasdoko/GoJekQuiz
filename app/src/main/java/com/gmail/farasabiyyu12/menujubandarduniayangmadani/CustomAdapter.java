package com.gmail.farasabiyyu12.menujubandarduniayangmadani;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by farasabiyyuhandoko on 08/02/2018.
 */

public class CustomAdapter extends BaseAdapter {
    String [] result1;
    Context context;
    int [] imageId;
    private static LayoutInflater inflater = null;

    //declare osName List, osImages, mainActivity
    public CustomAdapter(MainActivity mainActivity, String[] namamakanan, int[] gambar) {
        // TODO Auto-generated constructor stub
        result1 = namamakanan;
        context = mainActivity;
        imageId = gambar;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount(){
        //To Count The Sum
        // TODO Auto-generated method stub
        return result1.length;
    }
    @Override
    public Object getItem(int pos) {
        // TODO Auto-generated method stub
        return pos;
    }
    @Override
    public long getItemId(int pos){
        // TODO Auto-generated method stub
        return pos;
    }

    public class Holder
    {
        TextView text;
        ImageView img;
    }
    @Override
    public View getView(final int pos, View convertView, ViewGroup parent){
        // TODO Auto-generated method stub
        Holder holder = new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.sample_grid_layout, null);
        holder.text = (TextView)rowView.findViewById(R.id.tv1);
        holder.img =(ImageView) rowView.findViewById(R.id.img);

        holder.text.setText(result1[pos]);
        holder.img.setImageResource(imageId[pos]);

        return rowView;
    }
}
