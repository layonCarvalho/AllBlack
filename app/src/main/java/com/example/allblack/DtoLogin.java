package com.example.allblack;

public class DtoLogin {

    private String usuario;
    private String senha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public DtoLogin(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;

    }

    public boolean autenticar(String usuario, String senha) {

        if (this.usuario.equals(usuario) && this.senha.equals(senha)) {
            return true;

        }
        return false;
    }
}

