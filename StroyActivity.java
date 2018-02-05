package com.annakulczycka.interactivestory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StroyActivity extends AppCompatActivity {

    public static final String TAG = StroyActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stroy);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");


    }
}
