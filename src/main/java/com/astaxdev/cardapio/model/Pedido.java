/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.astaxdev.cardapio.model;

/**
 *
 * @author astaxgg
 */
public class Pedido {
    private static int contador = 1;
    
    private int id;
    private String descricao;
    private String mesa;
    private Item combo;
    private Usuario cliente;

    public Pedido(String descricao, String mesa, Item combo, Usuario cliente) {
        this.contador++;
        this.id = this.contador;
        this.descricao = descricao;
        this.mesa = mesa;
        this.combo = combo;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public Item getCombo() {
        return combo;
    }

    public void setCombo(Item combo) {
        this.combo = combo;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }
}
