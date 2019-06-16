package com.example.investnation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private String[] food;
    private String[] dicri;
    private int numId;
    private LayoutInflater layoutInflater;



    CustomAdapter(Context applicationContext,String[] food){
        this.context = applicationContext;
        this.food = food;
     //   this.numId = numID;
        this.layoutInflater = (LayoutInflater.from(applicationContext));
    }

    CustomAdapter(Context applicationContext,String[] headings,String[] discription,int image){
        this.context = applicationContext;
        this.food = headings;
        this.dicri = discription;
        this.numId = image;
        this.layoutInflater = (LayoutInflater.from(applicationContext));

    }

    @Override
    public int getCount() {
        return food.length;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = layoutInflater.inflate(R.layout.activity_financial_litracy,null);
        //TextView foodEle = view.findViewById(R.id.nameOfInvestment);
      //  Button que = view.findViewById(R.id.qustionButtonForInvestment);
        TextView textView = view.findViewById(R.id.textView);
        TextView textView2 = view.findViewById(R.id.textView2);
        ImageView imageView = view.findViewById(R.id.imageView);

        textView.setText(food[i]);
        textView2.setText(dicri[i]);
        imageView.setImageResource(numId);
        return view;
    }
}
