package semana04;

import javax.swing.JOptionPane;

public class Excecao02 {

    public static void main(String[] args) {

        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog("idade?"));//exceção unchecked
            System.out.println("Parabéns você digitou um valor inteiro!");
        } catch (NumberFormatException erro) {
            System.out.println("Você errou!" + erro);
        }
        finally{ //a excução sempre passa por aqui, independente se entrar no try ou catch
            //Recomendado para liberar recursos
            System.out.println("Passou no finally");
        }
    }
}
