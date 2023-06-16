/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula.heranca;

/**
 *
 * @author andre
 */
public class Funcionario extends Pessoa{
    public String setor;
    private boolean trabalhando;
    
    
    
    @Override
    public void fazerMiojo() {
        System.out.println("stou fazendo miojo");
    }
}
