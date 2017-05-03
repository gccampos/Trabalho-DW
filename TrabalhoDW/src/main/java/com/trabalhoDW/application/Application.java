package com.trabalhoDW.application;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author bernardolopes at id.uff.br
 */
@SpringBootApplication
@ComponentScan("com.trabalhoDW.persistence")
@ComponentScan("com.trabalhoDW.controller")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

