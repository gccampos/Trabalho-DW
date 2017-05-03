/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabalhoDW.service;

import com.trabalhoDW.model.Nota;
import com.trabalhoDW.persistence.NotaDAO;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author guilherme
 */
@Service
public class NotaService {

    private NotaDAO notaDAO;

    public Nota buscarPorId(int id) {
        return notaDAO.findOne(id);
    }

    public List<Nota> listarTodos() {
        return notaDAO.findAll();
    }
    public void salvar(Nota nota){
        notaDAO.saveAndFlush(nota);
    }
    
    

    

}
