package com.example.investnation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class financialListView extends AppCompatActivity {
    private ListView listview;
    private TextView heading_textview;
    private TextView description_textview;
    private ImageView imageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financial_list_view);



    }
}
