package com.login.brinsally.cnaps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class MENU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button buttonDesenvolvedor = (Button) findViewById(R.id.buttonDesenvolvedor);

        buttonDesenvolvedor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MENU.this, DESENVOLVEDORES.class);
                startActivity(it);
            }

        });

        Button buttonPerfil = (Button) findViewById(R.id.buttonPerfil);

        buttonPerfil.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MENU.this, PERFIL.class);
                startActivity(it);
            }

        });

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MENU.this, CONFIGURACAO.class);
                startActivity(it);
            }

        });

        Button button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MENU.this, ESPECIALIZADO.class);
                startActivity(it);
            }

        });

        Button button3 = (Button) findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MENU.this, BASICO.class);
                startActivity(it);
            }

        });

    }}