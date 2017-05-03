/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabalhoDW.persistence;

import com.trabalhoDW.model.Usuario;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author guilherme
 */
public interface UsuarioDAO extends JpaRepository<Usuario, Integer> {
    public Usuario findOne();
    public List<Usuario> findAll();
}
