package semana03;
import javax.swing.JOptionPane;

public class String04 {

    public static void main(String[] args) {
        String termos = "sexo sexual droga";

        String s = JOptionPane.showInputDialog("Digite o termo de busca").toLowerCase();
        //Ou --> s = s.toLowerCase();

        // CONTAINS é um método - Recebe String e devolve boolean como se tivesse if (valor == true)
        if (termos.contains(s)) {
            // showMessageDialog - MÉTODO
            JOptionPane.showMessageDialog(null, "Termo Proibido");
        } else {
            JOptionPane.showMessageDialog(null, "Termo Liberado");
        }

    }

}
