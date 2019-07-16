package com.example.communicationbetweenactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String SEND_INFO = "info";

    private EditText infoEditText;
    private Button btnSend;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        infoEditText = (EditText) findViewById(R.id.send_edit_text_id);
        btnSend =  (Button) findViewById(R.id.btn_send_id);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),infoEditText.getText(),Toast.LENGTH_LONG).show();
                Intent intent =  new Intent(MainActivity.this,NewActivity.class);
                Bundle b = new Bundle();
                b.putString(SEND_INFO,infoEditText.getText().toString());
                intent.putExtras(b);
                startActivity(intent);
            }
        });



    }
}
