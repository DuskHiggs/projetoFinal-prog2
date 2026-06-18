/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.astaxdev.cardapio.model;

public class Usuario {
    private String username;
    private String senha;
    private TipoUsuario cargo;
    private static int contador = 1; 
    private int id;

    public TipoUsuario getPerfil() {
        return cargo;
    }
    
    public Usuario(String username, String senha, TipoUsuario cargo) {
        this.id = contador++;
        this.username = username;
        this.senha = senha;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }
    
    public Usuario(){
        this.id = contador++;
    
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" + "username=" + username + ", senha=" + senha + '}';
    }
    
    
}
