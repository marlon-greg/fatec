package semana04;

import javax.swing.JOptionPane;

public class Excecao01{
    public static void main(String[] args) {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Idade? "));

        Tread.sleep(2000); // Exceção checked
    }
}