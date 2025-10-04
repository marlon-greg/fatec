/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula07;

/**
 *
 * @author 1050482423018
 */
public class UsaAluno {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.nome = "Paulo";
        a.ra = "123";
        a.idade = 19;
        
        System.out.println(Aluno.gravar(a));
    }
}
