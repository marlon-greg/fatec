package semana04;

import java.awt.HeadlessException;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Excecao05 {

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = null;

        try {// Print Writer é como se abrisse um notepad - bloco de notas - em branco
            fileWriter = new FileWriter("C:\\Users\\marli\\Documents\\fatec\\programacao_orientada_objeto\\src\\semana04\\log.txt", true);

            fileWriter.write("Início da gravação...\n");

            while (true) {
                String s = JOptionPane.showInputDialog("Digite algo ai:");
                if (s == null) {
                    break;
                }
                fileWriter.write(s + "\n");
            }
        } catch (HeadlessException | IOException e) {
            // TODO Auto-generated catch block
            JOptionPane.showInputDialog(null, "falha: " + e);
        } finally {
            fileWriter.close();
        }
    }
}
