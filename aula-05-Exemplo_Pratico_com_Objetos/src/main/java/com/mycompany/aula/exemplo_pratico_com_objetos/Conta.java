/*

 */
package com.mycompany.aula.exemplo_pratico_com_objetos;
import javax.swing.JOptionPane;
/**
 *
 * @author madae
 */
public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo = 0;
    private boolean status;

    
    //Métodos Especiais
    
    public Conta(){
        this.saldo = 0;
        this.status = false;
    }
    
    public void estado(){
        JOptionPane.showMessageDialog(null, "--------------------------------"
                                           + "\nConta: " + this.getNumConta()
                                           +"\nTipo: " + this.getTipo()
                                           +"\nDono:" + this.getDono()
                                           +"\nSaldo:" + this.getSaldo()
                                           +"\nStatus:" + this.isStatus());
    }
    
    //Métodos Personalizados
    public double getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
    public void abrirConta(String tipo){
        this.tipo = tipo;
        if(tipo == "cc"){
            this.setStatus(true);
            this.setSaldo(50);
            JOptionPane.showMessageDialog(null, "Conta aberta com Sucesso");
        }else if(tipo == "cp"){
            this.setStatus(true);
            this.setSaldo(150);
            JOptionPane.showMessageDialog(null, "Conta aberta com Sucesso");
        }else {
            JOptionPane.showMessageDialog(null, "Tipo de conta Invalida!");
        }

    }
    public void FecharConta(){
        if(this.getSaldo() == 0){
            this.status = false;
            JOptionPane.showMessageDialog(null, "Conta Fechada");
        }
        else if(this.getSaldo() > 0){
            JOptionPane.showMessageDialog(null, "ERRO Conta com Saldo");
        }
        else if(this.getSaldo() == 0){
            this.setStatus(false);
            JOptionPane.showMessageDialog(null, "ERRO, Conta em Débito");
        }
    }
    public void depositar(double valor){
        if(this.isStatus() && valor >= getSaldo()){
//          this.saldo += valor; 
            this.setSaldo(getSaldo() + valor);
            JOptionPane.showMessageDialog(null, "Deposito de "+valor+" realizado com Sucesso\nNa conta de "+this.getDono());
        }else{
            JOptionPane.showMessageDialog(null, "ERRO Impossivel Sacar");
        }
    }
    public void sacar(double valor){
        if(this.isStatus() && this.getSaldo() >= valor){
            this.setSaldo(getSaldo() - valor);
            JOptionPane.showMessageDialog(null, "Saque de "+valor+" realizado com Sucesso\nNa conta de "+this.getDono());
        }else{
            JOptionPane.showMessageDialog(null, "ERRO Impossivel Sacar");
        }
    }
    public void pagarMensalidade() {
        if (isStatus() == true) {
            if (getTipo() == "cc") {
                this.setSaldo(getSaldo() - 12);
                JOptionPane.showMessageDialog(null, "Mensalidade paga com sucesso por "+this.getDono());
            } else if (getTipo() == "cp") {
                this.setSaldo(getSaldo() - 20);
                JOptionPane.showMessageDialog(null, "Mensalidade paga com sucesso por "+this.getDono());

            } else {
                JOptionPane.showMessageDialog(null, "Impossivel Pagar");
            }

        }
    
}
}

