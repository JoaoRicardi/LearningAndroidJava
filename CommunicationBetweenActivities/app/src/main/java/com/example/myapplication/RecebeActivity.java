package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RecebeActivity extends AppCompatActivity {

    public static final  String MENSAGEM = "mensagem";

    private TextView textoRecebido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recebe);
        textoRecebido = findViewById(R.id.textView_recebe);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
       textoRecebido.setText(bundle.getString(MENSAGEM));



    }
}
