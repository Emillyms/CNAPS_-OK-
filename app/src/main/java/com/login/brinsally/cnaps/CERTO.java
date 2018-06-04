package com.login.brinsally.cnaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CERTO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certo);

        Button button10 = (Button) findViewById(R.id.button10);

        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(CERTO.this, BASICO.class);
                startActivity(it);
            }

        });

    }
}
