
package com.mycompany.aula.criando_classes_e_objetos;


public class Caneta {
    String modelo;
    String cor;
    Double ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Sou uma caneta: " + this.cor);
        
            if(this.tampada == true){
                System.out.println("Estou tampada");
                    }else{
                System.out.println("Estou destampada");
            }
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga: "+ this.carga);
    }
    
    void rabiscar(){
        if(tampada == true){
            System.out.println("ERRO, NÃO POSSO RABISCAR");
        }else{
            System.out.println("Estou Rabiscando");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
