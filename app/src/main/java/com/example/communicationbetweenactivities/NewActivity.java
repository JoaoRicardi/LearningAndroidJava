package com.example.communicationbetweenactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {

    private TextView mTextview;
    private String getInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        mTextview = (TextView) findViewById(R.id.recive_text_view_id);

        Intent i = getIntent();
        Bundle b = i.getExtras();
        getInfo =  b.get(MainActivity.SEND_INFO).toString();
        mTextview.setText(getInfo);

    }
}
