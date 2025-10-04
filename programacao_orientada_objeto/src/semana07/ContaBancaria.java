/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula07;

/**
 *
 * @author 1050482423018
 */
public class ContaBancaria {
    private int numero;
    public String titular; // nao encapsulado
    private double saldo;
    private final int LIMITE_PARA_SAQUE = 1000;
    
    /*
    Em um ambiente encapsulado é possível definir regras de negócio
    */
    
    public static boolean fazerPix(ContaBancaria contaOrigem, ContaBancaria contaDestino, double valor){
        double total = contaOrigem.saldo + contaDestino.saldo;
        contaOrigem.sacar(valor);
        contaDestino.depositar(valor);
        double total2 = contaOrigem.saldo + contaDestino.saldo;
        
        if(total == total2){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Retorna o estado atual do objeto em tipo String
     * @return 
     */
    public String toString(){
        return "["+numero+";"+titular+";"+saldo+"]";
    }
    
    public String sacar(double valor){
        String texto = "Saque realizado com sucesso";
        if(valor<=LIMITE_PARA_SAQUE){
            if(valor>saldo){
                texto = "Saque invalido";
            }else{
                saldo-=valor;
            }
        }else{
            texto = "O limite para saque é " + LIMITE_PARA_SAQUE;
        }
        
        return texto;
    }
    
    /**
     * Recebe um valor positivo e adicona ao saldo
     * @param valor 
     */
    public void depositar(double valor){
        if(valor>0){
            saldo+= valor;
        }else{
            System.out.println("So é possivel depositar valores positivos");
        }
    }
    
    public double consultar(){
        return this.saldo;
    }

    public int getNumero() {
        return numero;
    }

    /**
     * Armazena o número da conta que deve ser superior a 0.
     * @param numero 
     */
    public void setNumero(int numero) {
        if(numero > 0){
            this.numero = numero;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
