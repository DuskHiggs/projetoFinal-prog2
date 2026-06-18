/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.astaxdev.cardapio.util;

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
    private Usuario sessao;
    
    private BancoDeDados() {
        usuarios.add(new Usuario("Alexis", "123", TipoUsuario.ADMINISTRADOR));
    }

    public static BancoDeDados getInstance() {
        return INSTANCE;
    }
    
    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public void setSessao(Usuario sessao) {
        this.sessao = sessao;
    }
    
    public Usuario getSessao() {
        return this.sessao;
    }
}
