package com.example.allblack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class tela_resgistar_vendas extends AppCompatActivity {

    private Button bt_salvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_resgistar_vendas);
        getSupportActionBar().hide();
        iniciarComponentes();

        bt_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(tela_resgistar_vendas.this,TelaVendas.class);
                startActivity(intent);
                finish();
                Toast.makeText(tela_resgistar_vendas.this, "Informações salvas!", Toast.LENGTH_SHORT).show();

                return ;
            }
        });

    }

    private void iniciarComponentes(){
        bt_salvar = findViewById(R.id.bt_salvar);

    }
}