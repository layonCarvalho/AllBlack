package com.example.allblack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private Button bt_entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();
        iniciarComponentes();

        bt_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Login.this,TelaPrincipal.class);
                startActivity(intent);

                Toast.makeText(Login.this, "Bem vindo!", Toast.LENGTH_SHORT).show();

            }
        });


    }

    private void iniciarComponentes(){
        bt_entrar = findViewById(R.id.bt_entrar);
    }

}

