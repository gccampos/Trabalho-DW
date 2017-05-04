/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabalhoDW.controller;

import com.trabalhoDW.model.Esporte;
import com.trabalhoDW.service.EsporteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author root
 */
@RestController
public class EsporteBean {
    @Autowired
    private EsporteService esporteService;
    
    @RequestMapping ("/Esporte")
    public List<Esporte> esportes() {
        return esporteService.listarTodos();
    }
    
}
