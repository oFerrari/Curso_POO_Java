/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula.relacionamento_entre_classes;

/**
 *
 * @author madae
 */
public class Lutador {
    private String nome,nacionalidade,categoria;
    private int idade, vitorias,derrotas,empates;
    private float altura,peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(String categoria) {
       
        if(this.peso < 52.2){
            this.categoria = "Invalido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Medio";
        }else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            System.out.println("Invalido");
        }
        
        this.categoria = categoria;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria(categoria);
    }

    
    
    
    
    
    public Lutador(String nome, String nacionalidade, int idade,float altura, float peso, int vitorias, int derrotas, int empates){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
                
    }
    
    public void apresentar(){
        System.out.println("Nome: "+this.getNome()+
                            "\nOrigem: "+this.getNacionalidade()+
                            "\nIdade: "+this.getIdade()+" Anos"+
                            "\nAltura: "+this.getAltura()+" M De Altura"+
                            "\nPeso: "+this.getPeso()+" Kg"+
                            "\nGanhou: "+this.getVitorias()+
                            "\nDerrotas: "+this.getDerrotas()+
                            "\nEmpates: "+this.getEmpates()
        );
    }
    
    public void status(){
        System.out.println( "Nome: "+this.getNome()+
                            "\né um Peso "+this.getCategoria()+"\n"+
                            this.getVitorias()+" Vitorias\n"+
                            this.getDerrotas()+" Derrotas\n"+
                            this.getEmpates()+" Empates"
        );
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+ 1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
}
