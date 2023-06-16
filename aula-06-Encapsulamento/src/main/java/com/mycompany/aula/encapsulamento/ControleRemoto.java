
package com.mycompany.aula.encapsulamento;


public class ControleRemoto implements Controlador{
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Metodos Especiais
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    
    
    //Construtor
    public ControleRemoto() {
        this.setVolume(50);
        this.setLigado(true);
        this.setTocando(false);
    }
    
    

    //Metodos Abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("--------MENU---------");
        
        if (this.isLigado()) {
            System.out.println("Esta Ligado");
        } else {
            System.out.println("Esta Desligado");
        }
        
        if(this.isTocando()){
            System.out.println("Esta tocando");
        } else {
            System.out.println("Não esta tocando");
        }
        
        
        System.out.print("Volume: ");
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.print("| ");
        }
        System.out.println("");
            

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu [...]");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            if (this.getVolume() < 100) {
                this.setVolume(this.getVolume() + 10);

            } else {
                System.out.println("Volume Maximo");
            }
            
        }else{
            System.out.println("Aparelho desligado");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            if (this.getVolume() >= 10) {
                this.setVolume(this.getVolume() - 10);
            } else {
                System.out.println("Esta no Minimo");
            }
        }else{
            System.out.println("Aparelho desligado");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !this.isTocando()){
            this.setTocando(true);
        }else{
            System.out.println("Não consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }else{
            System.out.println("Não consegui pausar");
        }
    }

}
