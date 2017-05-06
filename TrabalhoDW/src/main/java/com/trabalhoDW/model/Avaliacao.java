/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabalhoDW.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author guilherme
 */
@Entity
public class Avaliacao {
    @Id
    @GeneratedValue
    private int id;
    
    @OneToOne
    @Autowired
    private Usuario usuario;
    
    @OneToOne(targetEntity=Nota.class)
    @Autowired
    private Nota nota;

}
