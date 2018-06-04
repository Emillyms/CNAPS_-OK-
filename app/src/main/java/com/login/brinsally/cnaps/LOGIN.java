package com.login.brinsally.cnaps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class LOGIN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button buttonEntrar = (Button) findViewById(R.id.buttonEntrar);

        buttonEntrar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(LOGIN.this, MENU.class);
                startActivity(it);
            }

        });

    }}
