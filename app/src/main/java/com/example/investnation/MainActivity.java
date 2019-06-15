package com.example.investnation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;
    int flag;
    Handler mHandler = new Handler();
    Thread thread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flag = 0;
        progressBar = findViewById(R.id.progressBar);
        progressbar();

    }

    public void progressbar(){
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(flag < 100){
                    flag++;
                    android.os.SystemClock.sleep(50);
                    mHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            progressBar.setProgress(flag);
                        }
                    });


               mHandler.post(new Runnable() {
                   @Override
                   public void run() {
                       // start the next activity using an intent
                   }
               });

                }
            }
        });
        thread.start();


    }

}
