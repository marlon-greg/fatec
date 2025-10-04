
import javax.swing.JOptionPane;

/**
 * Representa um funcionário, que é uma especialização de PessoaFisica.
 * Adiciona informações de salário e cargo.
 */
public class Funcionario extends PessoaFisica {
    private double salario;
    private String cargo;

    /**
     * Captura os dados do funcionário. Chama o método da superclasse {@code PessoaFisica}
     * para obter os dados pessoais e, em seguida, solicita o cargo e o salário.
     */
    @Override
    public void digitar() {
        super.digitar();
        cargo = JOptionPane.showInputDialog("Digite o cargo: ");
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: "));
    }

    /**
     * Exibe os dados completos do funcionário, incluindo os dados de PessoaFisica.
     * Chama o método {@code mostrar()} da superclasse e depois exibe
     * o cargo e o salário.
     */
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    }
}
