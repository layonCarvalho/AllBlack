package com.example.allblack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.allblack.databinding.ActivityTelaConsultaVendasBinding;

public class TelaVendas extends AppCompatActivity {

    private Button bt_consultavendas;
    private Button bt_registrartavendas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_vendas);

        getSupportActionBar().hide();

        iniciarComponentes();

        bt_consultavendas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TelaVendas.this, tela_consulta_vendas.class);
                startActivity(intent);

            }
        });

        bt_registrartavendas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TelaVendas.this, tela_resgistar_vendas.class);
                startActivity(intent);

            }
        });
    }
    private void iniciarComponentes(){
        bt_consultavendas = findViewById(R.id.bt_consultavendas);
        bt_registrartavendas = findViewById(R.id.bt_registrartavendas);

    }
}