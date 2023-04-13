package com.example.allblack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class tela_cadastro_usuario extends AppCompatActivity {

    private Button bt_salvarcadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro_usuario);
        getSupportActionBar().hide();
        iniciarComponentes();

        bt_salvarcadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(tela_cadastro_usuario.this,TelaPrincipal.class);
                startActivity(intent);
                finish();
                Toast.makeText(tela_cadastro_usuario.this, "Usuário Cadastrado!", Toast.LENGTH_SHORT).show();

            }
        });

    }

    private void iniciarComponentes(){
        bt_salvarcadastro = findViewById(R.id.bt_salvarcadastro);

    }

}