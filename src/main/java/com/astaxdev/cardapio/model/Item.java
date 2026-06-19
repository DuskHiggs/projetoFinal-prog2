/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.astaxdev.cardapio.model;

import java.net.URL;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author astaxgg
 */
public class Item {
    private static int contador = 1;
    
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private List<String> ingredientes;
    private Categoria tipo;
    
    public Item(String nome, String desc, double preco, List<String> ingredientes, Categoria tipo) {
        this.contador++;
        
        this.id = this.contador;
        this.nome = nome;
        this.descricao = desc;
        this.preco = preco;
        this.tipo = tipo;
        this.ingredientes = ingredientes;
    }
    
    private ImageIcon criarIconeCaminho(String caminho) {
        URL url = getClass().getResource(caminho);
        
        if (url != null) {
            return new ImageIcon(url);
        }

        return new ImageIcon();
    }
    
    public List<String> getIngredientes() {
        return this.ingredientes;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public double getPreco() {
        return this.preco;
    }
    
    public ImageIcon getIcone() {
        String caminho = "";
        
        switch (this.tipo) {
            case Categoria.BEBIDA:
                caminho = "/bebida-50.png";
                break;
            case Categoria.LANCHE:
                caminho = "/lanche-50.png";
                break;
            case Categoria.PORCAO:
                caminho = "/porcao-50.png";
                break;
            case Categoria.SOBREMESA:
                caminho = "/sobremesa-50.png";
                break;
        }
        
        return criarIconeCaminho(caminho);
    }
}
