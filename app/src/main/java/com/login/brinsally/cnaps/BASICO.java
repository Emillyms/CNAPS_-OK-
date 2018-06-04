package com.login.brinsally.cnaps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class BASICO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basico);

        Button button3 = (Button) findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(BASICO.this, ALFABETO.class);
                startActivity(it);
            }

        });

    }
}
