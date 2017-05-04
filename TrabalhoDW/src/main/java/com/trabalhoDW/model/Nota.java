/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabalhoDW.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author guilherme
 */
@Entity
public class Nota {

    @Id
    @GeneratedValue
    private int id;
    
    private List<Long> notaConhecido;
    
    private List<Long> notaHospedagem;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getNotaConhecido() {
        long media = 0;
        for (long nota : notaConhecido) {
            media += nota;
        }
        return media / notaConhecido.size();
    }

    public void setNotaConhecido(long nota) {
        this.notaConhecido.add(nota);
    }

    public long getNotaHospedagem() {
        long media = 0;
        for (long nota : notaHospedagem) {
            media += nota;
        }
        return media / notaHospedagem.size();
    }

    public void setNotaHospedagem(long nota) {
        this.notaHospedagem.add(nota);
    }

}
