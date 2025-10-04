/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula07;

/**
 *
 * @author 1050482423018
 */
public class UsaConta {
    public static void main(String[] args) {
        ContaBancaria c = new ContaBancaria();
        c.titular = "Pedro Henrique";
        c.setNumero(100);
        c.depositar(1000);
        
//        System.out.println("Titular da conta : " + c.titular);
//        System.out.println("Numero da conta : " + c.getNumero());
//        System.out.println("Saldo atual : " + c.consultar());

//        System.out.println(c.toString());
        System.out.println(c);
        
        System.out.println(c.sacar(2000));
        System.out.println(c.sacar(500));
        
        System.out.println(c);
        
        ContaBancaria c2 = new ContaBancaria();
        c2.depositar(1000);
        
        ContaBancaria.fazerPix(c, c2, 100);
        
        System.out.println("Conta 1 : " + c);
        System.out.println("Conta 2 : " + c2);
    }
}
