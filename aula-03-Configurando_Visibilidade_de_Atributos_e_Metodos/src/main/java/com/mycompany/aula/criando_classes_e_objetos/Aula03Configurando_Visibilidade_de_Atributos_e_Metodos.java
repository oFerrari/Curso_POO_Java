package com.mycompany.aula.criando_classes_e_objetos;

public class Aula03Configurando_Visibilidade_de_Atributos_e_Metodos {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        
        
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 2;
        //c1.tampada = true;
        
        c1.tampar();
        //c1.destampar();
        c1.status();
        
    }
}
