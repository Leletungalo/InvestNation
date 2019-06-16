package com.example.investnation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class investActivity extends AppCompatActivity {
    ListView investmentView;
    Button question;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invest);

        investmentView = findViewById(R.id.investActivityListId);
       // question = findViewById(R.id.qustionButtonForInvestment);
        String[] food = {"apple","chicken","papa","bread","kaka","sonka","grape","banana","nkanks","mbegu","nantsika","Liesbeck","dlalagam","hali"};
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(),food);
        investmentView.setAdapter(customAdapter);
    }
}
