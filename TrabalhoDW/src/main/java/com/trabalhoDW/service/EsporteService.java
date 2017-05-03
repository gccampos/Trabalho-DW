/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabalhoDW.service;

import com.trabalhoDW.model.Esporte;
import com.trabalhoDW.persistence.EsporteDAO;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author guilherme
 */
@Service
public class EsporteService {

    private EsporteDAO esporteDAO;

    public Esporte buscarPorId(int id) {
        return esporteDAO.findOne(id);
    }

    public List<Esporte> listarTodos() {
        return esporteDAO.findAll();
    }
    public void salvar(Esporte esporte){
        esporteDAO.saveAndFlush(esporte);
    }



    

}
