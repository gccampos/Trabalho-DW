/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabalhoDW.service;

import com.trabalhoDW.model.Esporte;
import com.trabalhoDW.persistence.EsporteDAO;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author guilherme
 */
@Service
public class EsporteService {

    @Autowired    
    private EsporteDAO esporteDAO;

    public Esporte buscarPorId(int id) {
        return esporteDAO.findOne(id);
    }

    public List<Esporte> listarTodos() {
        return esporteDAO.findAll();
    }
    @Transactional
    public void salvar(Esporte esporte){
        esporteDAO.saveAndFlush(esporte);
    }



    

}
