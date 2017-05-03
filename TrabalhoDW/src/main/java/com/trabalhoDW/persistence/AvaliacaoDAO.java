/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabalhoDW.persistence;

import com.trabalhoDW.model.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author guilherme
 */
public interface AvaliacaoDAO extends JpaRepository<Avaliacao, Integer> {
    
}
