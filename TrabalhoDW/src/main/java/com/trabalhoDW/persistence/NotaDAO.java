/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabalhoDW.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import com.trabalhoDW.model.Nota;
/**
 *
 * @author guilherme
 */
public interface NotaDAO extends JpaRepository<Nota, Integer>{
    
}
