package com.login.brinsally.cnaps;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PERFIL extends AppCompatActivity {

    EditText nome;
    EditText email;
    EditText senha;
    Button salvar;
    EditText nascimento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        nome = (EditText) findViewById(R.id.nome);
        email = (EditText) findViewById(R.id.email);
        senha = (EditText) findViewById(R.id.senha);
        salvar = (Button) findViewById(R.id.salvar);
        nascimento = (EditText) findViewById(R.id.nascimento);
    }

    public void clickSalvar(View view) {
        Toast.makeText(this, "Alterações salvas", Toast.LENGTH_SHORT).show();
    }
}