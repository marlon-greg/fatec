package semana04;

import javax.swing.JOptionPane;

public class Excecao03 {

    public static void main(String[] args) {

        while (true) {
            try {
                int n = Integer.parseInt(JOptionPane.showInputDialog("Mês?"));//exceção unchecked
                int a = 30 / n;
                if (n < 1 || n > 12) {
                    JOptionPane.showMessageDialog(null, "Mês inválido");
                    // Lançar excessão de mês inválido
                } else {
                    JOptionPane.showMessageDialog(null, "Mês válido");
                    break;
                }
             } 
             catch (Exception erro){
                if(erro.toString().contains("Number")){
                    JOptionPane.showMessageDialog(null, "Digite inteiro");
                }
                else if(erro.toString().contains("Arith")){
                    JOptionPane.showMessageDialog(null, "Divisão Zero");
                }
             }
              /* catch (NumberFormatException erro) {
                System.out.println("Você errou!" + erro);
           
            } catch (ArithmeticException erro) {
                JOptionPane.showMessageDialog(null, "Divisão por Zero!");
            } */
            finally { //a excução sempre passa por aqui, independente se entrar no try ou catch
                //Recomendado para liberar recursos
                System.out.println("Passou no finally");
            }
        }
    }
}
