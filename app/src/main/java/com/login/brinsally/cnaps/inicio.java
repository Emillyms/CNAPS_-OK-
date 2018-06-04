package com.login.brinsally.cnaps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Button nomeParaOBotao = (Button) findViewById(R.id.nomeParaOBotao);

        nomeParaOBotao.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(inicio.this, LOGIN.class);
                startActivity(it);
            }

        });

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(inicio.this, CADASTRO.class);
                startActivity(it);
            }

        });

    }}


