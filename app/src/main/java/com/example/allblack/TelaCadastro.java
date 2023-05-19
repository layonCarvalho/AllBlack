package com.example.allblack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TelaCadastro extends AppCompatActivity {

    private Button bt_cadastrarusuario;

    private Button bt_cadastrarprodutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);

        getSupportActionBar().hide();
        iniciarComponentes();

        bt_cadastrarusuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TelaCadastro.this, tela_cadastro_usuario.class);
                startActivity(intent);

                return ;
            }
        });

        bt_cadastrarprodutos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TelaCadastro.this, tela_cadastro_produtos.class);
                startActivity(intent);

                return ;
            }
        });
    }
    private void iniciarComponentes(){
        bt_cadastrarusuario = findViewById(R.id.bt_cadastrarusuario);
        bt_cadastrarprodutos = findViewById(R.id.bt_cadastrarprodutos);

    }

}