package com.huwenjun.myapplication3_17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);
            Intent intent=getIntent();
            String str=intent.getStringExtra("x");
            TextView textView=findViewById(R.id.textView);
            textView.setText(str);
        }
    }
