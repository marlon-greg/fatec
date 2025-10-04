
import javax.swing.JOptionPane;

/**
 * Representa um Vendedor, que é uma especialização de Funcionario.
 * Adiciona a informação de comissão.
 */
public class Vendedor extends Funcionario {
    private double comissao;

    /**
     * Captura os dados do vendedor. Chama o método da superclasse {@code Funcionario}
     * para obter os dados de funcionário e, em seguida, solicita a comissão.
     */
    @Override
    public void digitar() {
        super.digitar();
        comissao = Double.parseDouble(JOptionPane.showInputDialog("Digite a comissão: "));
    }

    /**
     * Exibe os dados completos do vendedor. Chama o método {@code mostrar()} da superclasse
     * e depois exibe a comissão.
     */
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Comissão: " + comissao);
    }
}