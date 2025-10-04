/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula07;

/**
 *
 * @author 1050482423018
 */
public class UsaProduto {
    public static void main(String[] args) {
        
        Produto p = new Produto(1, "Sabonete", 2.34, true, 'S');
        Produto p2 = new Produto(2, "Maionese", 5.23, true, 'M');
//        p.setNome("Sabonete");
//        p.setTipo('S');
//        p.setValor(2.34);
//        p.setNovo(true);
        p.status();
        p2.status();
    }
}
