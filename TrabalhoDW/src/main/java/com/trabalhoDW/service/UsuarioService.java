/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabalhoDW.service;

import com.trabalhoDW.model.Usuario;
import com.trabalhoDW.persistence.UsuarioDAO;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author guilherme
 */
@Service
public class UsuarioService {

    private UsuarioDAO usuarioDAO;

    public Usuario buscarPorId(int id) {
        return usuarioDAO.findOne();
    }

    public List<Usuario> listarTodos() {
        return usuarioDAO.findAll();
    }
    public void salvar(Usuario usuario){
        usuarioDAO.saveAndFlush(usuario);
    }
    


    

}
