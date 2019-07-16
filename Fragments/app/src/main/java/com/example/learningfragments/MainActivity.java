package com.example.learningfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnFragment1;
    private Button btnFragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFragment1 = (Button) findViewById(R.id.btn_fragment_1_id);
        btnFragment2 = (Button) findViewById(R.id.btn_fragment_2_id);

        btnFragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Fragment1 fragment = new Fragment1();
                fragmentTransaction.add(R.id.container_id, fragment);
                fragmentTransaction.commit();
            }
        });

        btnFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Fragment2 fragment = new Fragment2();
                fragmentTransaction.add(R.id.container_id, fragment);
                fragmentTransaction.commit();
            }
        });



    }
}
