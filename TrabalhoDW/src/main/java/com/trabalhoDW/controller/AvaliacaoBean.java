/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabalhoDW.controller;

import com.trabalhoDW.model.Avaliacao;
import com.trabalhoDW.service.AvaliacaoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author guilherme
 */
@RestController
public class AvaliacaoBean {
    @Autowired
    private AvaliacaoService avaliacaoService;
    
    @RequestMapping("/avaliacaoConhecido")
    public List<Avaliacao> avaliacaoConhecido(){
        return avaliacaoService.listarTodos();
    } 
    @RequestMapping("/avaliacaoHospedagem")
    public List<Avaliacao> avaliacaoHospedagem(){
        return avaliacaoService.listarTodos();
    } 

}
