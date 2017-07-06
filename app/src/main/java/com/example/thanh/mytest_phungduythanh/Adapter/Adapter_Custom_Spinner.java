package com.example.thanh.mytest_phungduythanh.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thanh.mytest_phungduythanh.CSDL.dlCustomSpinner;
import com.example.thanh.mytest_phungduythanh.CSDL.dlHome2;
import com.example.thanh.mytest_phungduythanh.R;

import java.util.ArrayList;

/**
 * Created by THANH on 7/6/2017.
 */

public class Adapter_Custom_Spinner extends ArrayAdapter<dlCustomSpinner> {
    private Context context;
    private ArrayList<dlCustomSpinner> datas;
    private LayoutInflater inflater;
    public Adapter_Custom_Spinner(Context context,ArrayList<dlCustomSpinner> datas)
    {
        super(context, R.layout.spinner_row,datas);
        this.context=context;
        this.datas=datas;
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }


    public View getCustomView(int position, View convertView, ViewGroup parent) {

        Adapter_Custom_Spinner.ViewHolder viewHolder;
        if(convertView==null)
        {
            viewHolder=new Adapter_Custom_Spinner.ViewHolder();
            convertView=inflater.inflate(R.layout.spinner_row,null);
            viewHolder.txtName= (TextView) convertView.findViewById(R.id.txt_spinner);
            viewHolder.imgImage=(ImageView)convertView.findViewById(R.id.img_spinner);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder=(Adapter_Custom_Spinner.ViewHolder)convertView.getTag();
        }
        dlCustomSpinner item=(dlCustomSpinner)getItem(position);

        viewHolder.txtName.setText(item.getTittle());
        viewHolder.imgImage.setImageResource(item.getUrlImage());
        return convertView;
    }
    public class ViewHolder{
        private TextView txtName;
        private ImageView imgImage;
    }
}
