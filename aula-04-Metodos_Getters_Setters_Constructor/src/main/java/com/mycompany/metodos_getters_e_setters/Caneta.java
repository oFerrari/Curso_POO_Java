package com.mycompany.metodos_getters_e_setters;

public class Caneta {

    public String modelo;
    private Double ponta;
    private boolean tampada;
    private boolean destampada;
    private String cor;

    public Caneta(String m, String c, Double p) {    //Metodo Construtor//  
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        
        this.tampar();
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public Double getPonta() {
        return ponta;
    }

    public void setPonta(Double p) {
        this.ponta = p;
    }

    public void status() {
        System.out.println("Sobre a Caneta:\nModelo: " + this.getModelo() + "\nPonta:" + this.getPonta()
                + "\nCor: " + this.cor + "\nTampada: " + this.tampada);
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
