package com.login.brinsally.cnaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EXEUM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exeum);

        Button button8 = (Button) findViewById(R.id.button8);

        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(EXEUM.this, CERTO.class);
                startActivity(it);
            }

        });

        Button button6 = (Button) findViewById(R.id.button6);

        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(EXEUM.this, ERRADO.class);
                startActivity(it);
            }

        });

        Button button7 = (Button) findViewById(R.id.button7);

        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(EXEUM.this, ERRADO.class);
                startActivity(it);
            }

        });

        Button button9 = (Button) findViewById(R.id.button9);

        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(EXEUM.this, ERRADO.class);
                startActivity(it);
            }

        });
    }
}