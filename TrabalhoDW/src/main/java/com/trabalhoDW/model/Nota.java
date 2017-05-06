/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabalhoDW.model;

import java.util.List;
import javax.persistence.ElementCollection;
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
    
    @ElementCollection(targetClass=Double.class)
    private List<Double> notaConhecido;
    
    @ElementCollection(targetClass=Double.class)
    private List<Double> notaHospedagem;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getNotaConhecido() {
        double media = 0;
        media = notaConhecido.stream().map((nota) -> nota).reduce(media, (accumulator, _item) -> accumulator + _item);
        return media / notaConhecido.size();
    }

    public void setNotaConhecido(double nota) {
        this.notaConhecido.add(nota);
    }

    public double getNotaHospedagem() {
        double media = 0;
        media = notaHospedagem.stream().map((nota) -> nota).reduce(media, (accumulator, _item) -> accumulator + _item);
        return media / notaHospedagem.size();
    }

    public void setNotaHospedagem(double nota) {
        this.notaHospedagem.add(nota);
    }

}
