package src.semana03;

import javax.swing.JOptionPane;

public class Math02{
    public static void main(String[] args) {
        
        final float PASSAGEIROS_POR_ONIBUS = 40;

        float numeroAlunos = Float.parseFloat(JOptionPane.showInputDialog("Qual a quantidade de alunos que irá ao passeio?"));
        System.out.println(numeroAlunos/PASSAGEIROS_POR_ONIBUS); // Valor Original

        // Ceil faz o arredondamento
        System.out.println((int)Math.ceil(numeroAlunos/PASSAGEIROS_POR_ONIBUS)); // Valor arredondado e ainda utilizando o (int) que pega o valor inteiro do float


    }
}