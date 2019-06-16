package com.example.investnation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class financialListView extends AppCompatActivity {
    ListView finacialListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financial_list_view);
        finacialListView = findViewById(R.id.financialListView);

        String[] food = {"apple","chicken","papa","bread","kaka","sonka","grape","banana","nkanks","mbegu","nantsika","Liesbeck","dlalagam","hali"};
        String[] food2 = {"apple","chicken","papa","bread","kaka","sonka","grape","banana","nkanks","mbegu","nantsika","Liesbeck","dlalagam","hali"};

        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(),food,food2,R.drawable.invest);
        finacialListView.setAdapter(customAdapter);
    }
}
