/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabalhoDW.service;

import com.trabalhoDW.model.Avaliacao;
import com.trabalhoDW.persistence.AvaliacaoDAO;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author guilherme
 */
@Service
public class AvaliacaoService {

    private AvaliacaoDAO avaliacaoDAO;

    public Avaliacao buscarPorId(int id) {
        return avaliacaoDAO.findOne(id);
    }

    public List<Avaliacao> listarTodos() {
        return avaliacaoDAO.findAll();
    }
    
    public void salvar(Avaliacao avaliacao){
        avaliacaoDAO.saveAndFlush(avaliacao);
    }
    


    

}
