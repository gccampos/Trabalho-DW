/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabalhoDW.controller;

import com.trabalhoDW.model.Usuario;
import com.trabalhoDW.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author root
 */
@RestController
public class UsuarioBean {
    @Autowired
    private UsuarioService usuarioService;
    
    @RequestMapping ("/usuario")
    public List<Usuario> usuarios() {
        usuarioService.aaa();
        return usuarioService.listarTodos();
    }
}
