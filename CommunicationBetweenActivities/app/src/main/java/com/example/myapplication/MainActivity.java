package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button botaoMudar;
    private EditText nomeDigitado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoMudar = findViewById(R.id.btn_muda_de_tela);
        nomeDigitado = findViewById(R.id.edit_text_nome);

        botaoMudar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),RecebeActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString(RecebeActivity.MENSAGEM, nomeDigitado.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);



            }
        });
    }
}
