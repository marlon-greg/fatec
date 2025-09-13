
import javax.swing.JOptionPane;

public class UsaTexto {

    public static void main(String[] args) {
        String s = "garrafa";
        //Texto.Inverter(s);

        String sEspelhado = Texto.espelhar(s);
        System.err.println("Original: " + s);
        System.out.println("Espelhado: " + sEspelhado);

        //Texto.salvar(s, "c:/temp/arquivo.txt");
        /*boolean salvou = Texto.save(s, "c:/temp/arquivo.txt");
        if (salvou) {
            JOptionPane.showMessageDialog(null, "Deu certo");
        } else {
            JOptionPane.showMessageDialog(null, "Deu errado");
        }
         */
        // Outra opção
        if (Texto.save(s, "c:/temp/arquivo.txt")) {
            JOptionPane.showMessageDialog(null, "Deu certo");
        } else {
            JOptionPane.showMessageDialog(null, "Deu errado");
        }
        // s e file são arguementos
        // path é o diretório
    //    JOptionPane.showMessageDialog(null, Texto.save(s, "c:/temp", "file.txt"));
        JOptionPane.showMessageDialog(null, Texto.gerarSenha(8));
    }

}
