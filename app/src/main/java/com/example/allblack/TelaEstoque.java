package com.example.allblack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TelaEstoque extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_estoque);

        getSupportActionBar().hide();
    }
}