package com.example.allblack;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class CriaBanco extends SQLiteOpenHelper {

    private static final String NOME_BANCO = "banco.db";
    private static final int VERSAO = 1;


    public CriaBanco(Context context) {
        super(context, NOME_BANCO, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sql = "CREATE TABLE cadastro_de_usuario ("
                + "codigo integer primary key autoincrement,"
                + "id_usuario,"
                + "nome text,"
                + "cpf int,"
                + "telefone,"
                + "email text)";
        db.execSQL(sql);

        String sql1 = "CREATE TABLE usuario ("
                + "codigo integer primary key autoincrement,"
                + "nome text,"
                + "email text,"
                + "senha text)";
        db.execSQL(sql1);

        String sql2 = "CREATE TABLE login ("
                + "codigo integer primary key autoincrement,"
                + "email text,"
                + "senha text)";
        db.execSQL(sql2);



        String sql3= "CREATE TABLE cadastro_de_produto ("
                + "codigo integer primary key autoincrement,"
                + "produto text,"
                + "peso int,"
                + "preco long)";

        db.execSQL(sql3);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS cadastro_de_usuario");
        db.execSQL("DROP TABLE IF EXISTS cadastro_de_produto");
        db.execSQL("DROP TABLE IF EXISTS usuario");
        db.execSQL("DROP TABLE IF EXISTS login");

        onCreate(db);
    }
}