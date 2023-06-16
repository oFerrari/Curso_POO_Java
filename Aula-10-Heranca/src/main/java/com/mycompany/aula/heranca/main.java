/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula.heranca;

/**
 *
 * @author andre
 */
public class main {
    public static void main(String[] args) {
//        Pessoa a1 = new Pessoa();
    Funcionario f1 = new Funcionario();
    f1.fazerMiojo();
    
    
   //Pessoa p1 = new Pessoa();
    Aluno p2 = new Aluno();
    p2.setCurso("Informatica");
    p2.cancelarMatricula();
    
    Funcionario p3 = new Funcionario();
    p3.setNome("Andrei Pessoa");
    p3.setor = "Rural";
}
}