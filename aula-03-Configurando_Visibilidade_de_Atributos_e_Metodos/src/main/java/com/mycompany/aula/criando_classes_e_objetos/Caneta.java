package com.mycompany.aula.criando_classes_e_objetos;


public class Caneta {
   public String modelo;
   public String cor;
   private Double ponta;
   protected int carga;
   private boolean tampada;
    
    public void status(){
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
    
    private void rabiscar(){
        if(tampada == true){
            System.out.println("ERRO, NÃO POSSO RABISCAR");
        }else{
            System.out.println("Estou Rabiscando");
        }
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
}

