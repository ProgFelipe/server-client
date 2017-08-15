/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Felipe
 */
@RestController
public class LuckyWorldController {
    
    @Value("${lucky-word}") String luckyWord;
    
    @RequestMapping("/lucky-word")
    public String showLuckyWorld(){
        return "The lucky word is: "+ luckyWord;
    }
}
