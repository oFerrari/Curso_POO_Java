/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula.exemplo_pratico_com_objetos;
import javax.swing.JOptionPane;

/**
 *
 * @author madae
 */

public class Aula05Exemplo_Pratico_com_Objetos {

    public static void main(String[] args) {
        
        Conta p1 = new Conta();
        p1.setNumConta(1111);
        p1.setDono("Jubilei");
        p1.abrirConta("cc");
        p1.depositar(300);
        p1.sacar(350);
        p1.FecharConta();
        p1.estado();
        
        Conta p2 = new Conta();
        p2.setNumConta(2222);
        p2.setDono("Ana");
        p2.abrirConta("cp");
        p2.depositar(500);
        p2.sacar(250);
        p2.FecharConta();
        
        p2.estado();
        
        //c1.abrirConta(JOptionPane.showInputDialog("Informe o tipo de conta: [cc] [cp]"));
    }
}
