package com.login.brinsally.cnaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ERRADO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_errado);

        Button button11 = (Button) findViewById(R.id.button11);

        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(ERRADO.this, EXEUM.class);
                startActivity(it);
            }

        });

        Button button10 = (Button) findViewById(R.id.button10);

        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(ERRADO.this, BASICO.class);
                startActivity(it);
            }

        });

    }
}
