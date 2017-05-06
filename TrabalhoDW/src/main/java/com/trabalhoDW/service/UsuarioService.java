/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabalhoDW.service;

import com.trabalhoDW.model.Esporte;
import com.trabalhoDW.model.Usuario;
import com.trabalhoDW.persistence.UsuarioDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author guilherme
 */
@Service
public class UsuarioService {

    @Autowired
    private UsuarioDAO usuarioDAO;
    //@Autowired
    //EsporteService esporteService;

    public Usuario buscarPorId(int id) {

        return usuarioDAO.findOne(id);
    }

    /*public void aaa() {
        Usuario u = new Usuario();
        u.setDisponivel(true);
        u.setEmail("email@email.com");
        u.setEndereco("123");
        Esporte esporte = new Esporte();
        esporteService.salvar(esporte);
        u.setEsporteFavorito(esporte);
        u.setNome("fodac");
        u.setTelefone(1234567890);
        this.salvar(u);

    }*/

    public List<Usuario> listarTodos() {
        return usuarioDAO.findAll();
    }

    public void salvar(Usuario usuario) {
        usuarioDAO.saveAndFlush(usuario);
    }

}
