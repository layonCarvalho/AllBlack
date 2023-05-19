package com.example.allblack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TelaPrincipal extends AppCompatActivity {

    private Button bt_1;
    private Button bt_2;
    private Button bt_3;
    private Button bt_4;
    private Button bt_5;

    private Button bt_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        getSupportActionBar().hide();
        iniciarComponentes();

        bt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TelaPrincipal.this,TelaProducao.class);
                startActivity(intent);

                return ;
            }
        });

        bt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TelaPrincipal.this,TelaEstoque.class);
                startActivity(intent);

                return ;
            }
        });

        bt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TelaPrincipal.this,TelaVendas.class);
                startActivity(intent);

                return ;
            }
        });

        bt_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TelaPrincipal.this,TelaAlterarDados.class);
                startActivity(intent);

                return ;
            }
        });

        bt_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TelaPrincipal.this,TelaCadastro.class);
                startActivity(intent);

                return ;
            }
        });



        bt_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TelaPrincipal.this,Login.class);
                startActivity(intent);

               // finish();

                Toast.makeText(TelaPrincipal.this, "Usuário desconectado", Toast.LENGTH_SHORT).show();

                return ;
            }
        });



    }

    private void iniciarComponentes(){
        bt_1 = findViewById(R.id.bt_1);
        bt_2 = findViewById(R.id.bt_2);
        bt_3 = findViewById(R.id.bt_3);
        bt_4 = findViewById(R.id.bt_4);
        bt_5 = findViewById(R.id.bt_5);
        bt_6 = findViewById(R.id.bt_6);
    }



}