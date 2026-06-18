/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.astaxdev.cardapio.util;

import com.astaxdev.cardapio.model.Categoria;
import com.astaxdev.cardapio.model.Item;
import com.astaxdev.cardapio.model.TipoUsuario;
import com.astaxdev.cardapio.model.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author astaxgg
 */
public class BancoDeDados {
    private static final BancoDeDados INSTANCE = new BancoDeDados();
    private final List<Usuario> usuarios = new ArrayList<>();
    private final List<Item> itens = new ArrayList<>();
    private Usuario sessao;
    
    private BancoDeDados() {
        usuarios.add(new Usuario("Alexis", "123", TipoUsuario.ADMINISTRADOR));
        usuarios.add(new Usuario("a", "a", TipoUsuario.ADMINISTRADOR));
        
        itens.add(new Item("Hambúrguer Artesanal", "Pão brioche.", 35.50, Categoria.LANCHE));
        itens.add(new Item("Batata Frita Especial", "Batata rústica.", 22.00, Categoria.PORCAO));
        itens.add(new Item("Soda Italiana", "Sabor maçã verde.", 12.00, Categoria.BEBIDA));
        itens.add(new Item("Pudim de Leite", "Receita tradicional.", 15.00, Categoria.SOBREMESA));
    }

    public static BancoDeDados getInstance() {
        return INSTANCE;
    }
    
    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public List<Item> getItens() {
        return itens;
    }

    
    public void setSessao(Usuario sessao) {
        this.sessao = sessao;
    }
    
    public Usuario getSessao() {
        return this.sessao;
    }
}
