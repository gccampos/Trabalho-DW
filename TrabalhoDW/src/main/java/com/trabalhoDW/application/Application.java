package com.trabalhoDW.application;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.trabalhoDW.model.Avaliacao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * @author salle
 */
@SpringBootApplication
@EntityScan(basePackages = {"com.trabalhoDW.model"})
@ComponentScan("com")
@EnableJpaRepositories("com.trabalhoDW.persistence")
//@ComponentScan("com.trabalhoDW.persistence")
//@ComponentScan("com.trabalhoDW.controller")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

