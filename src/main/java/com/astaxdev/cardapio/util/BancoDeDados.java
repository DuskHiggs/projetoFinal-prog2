/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.astaxdev.cardapio.util;

import com.astaxdev.cardapio.model.Categoria;
import com.astaxdev.cardapio.model.Item;
import com.astaxdev.cardapio.model.Pedido;
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
    private final List<Pedido> pedidos = new ArrayList<>();
    private Usuario sessao;
    
    private BancoDeDados() {
        usuarios.add(new Usuario("Alexis", "123", TipoUsuario.ADMINISTRADOR));
        usuarios.add(new Usuario("Jack", "123", TipoUsuario.ADMINISTRADOR));
        
        itens.add(new Item("Combo Artesanal", "Combo familia", 35.50, new ArrayList<String>() {{
            add("Hamburguer Artesanal");
            add("Batata Especial");
            add("CocaCola 2l");
        }}, Categoria.LANCHE));

        itens.add(new Item("Batata Frita Especial", "Especial com Coca", 22.00, new ArrayList<String>() {{
            add("Batata Especial");
            add("CocaCola 600ml");
        }}, Categoria.PORCAO));

        itens.add(new Item("Porção Mista", "Varias Porções", 12.00, new ArrayList<String>() {{
            add("Frango");
            add("Batata Frita");
            add("Calabresa");
        }}, Categoria.PORCAO));

        itens.add(new Item("Petit Gateau", "Saboroso", 15.00, new ArrayList<String>() {{
            add("Bolo de Chocolate");
            add("Sorvete");
            add("Chantilly");
        }}, Categoria.SOBREMESA));
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

    public List<Pedido> getPedidos() {
        return pedidos;
    }
    
    public void setSessao(Usuario sessao) {
        this.sessao = sessao;
    }
    
    public Usuario getSessao() {
        return this.sessao;
    }
}
