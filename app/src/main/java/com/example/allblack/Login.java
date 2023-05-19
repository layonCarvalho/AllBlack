package com.example.allblack;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public  class Login extends AppCompatActivity implements View.OnClickListener {

    Button bt_entrar;

    EditText edit_email, edit_senha;

    DtoLogin dtoLogin = new DtoLogin("usuario", "usuario");


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();
        iniciarComponentes();

        bt_entrar.setOnClickListener(this);

        Toast.makeText(Login.this, "Bem vindo!", Toast.LENGTH_SHORT).show();


    }


    private void iniciarComponentes() {
        bt_entrar = findViewById(R.id.bt_entrar);
        edit_email = findViewById(R.id.edit_email);
        edit_senha = findViewById(R.id.edit_senha);
    }


    @Override
    public void onClick(View v) {

        Boolean validPassword = edit_senha.getText().toString().equals(dtoLogin.getSenha());
        Boolean validUser = edit_email.getText().toString().equals(dtoLogin.getUsuario());
        Boolean validLogin = validPassword && validUser;

        if (validLogin) {
            Intent intent = new Intent(this, TelaPrincipal.class);
            startActivity(intent);
            return;
        } else {
            AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
            builder1.setMessage("Usuario ou senha inválidos.");
            builder1.setCancelable(true);
            AlertDialog alert11 = builder1.create();
            alert11.show();

            //Toast.makeText(this, "preencha campos vazio", Toast.LENGTH_SHORT).show();

        }
    }
}
