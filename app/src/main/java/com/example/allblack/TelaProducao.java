package com.example.allblack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TelaProducao extends AppCompatActivity {

    private Button bt_salvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_producao);

        getSupportActionBar().hide();
        iniciarComponentes();

        bt_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TelaProducao.this,TelaPrincipal.class);
                startActivity(intent);
                finish();
                Toast.makeText(TelaProducao.this, "Informações salvas!", Toast.LENGTH_SHORT).show();

            }
        });

    }

    private void iniciarComponentes(){
        bt_salvar = findViewById(R.id.bt_salvar);

    }
}