

import javax.swing.JOptionPane;

/**
 * Subclasse (ou classe filha) que herda de Pessoa.
 * Representa uma pessoa física, adicionando CPF e RG como atributos específicos.
 */
public class PessoaFisica extends Pessoa {
    // Atributos específicos da Pessoa Física.
    private String cpf;
    private String rg;

    /**
     * Sobrescreve o método da superclasse para capturar também os dados de CPF e RG.
     * Primeiro, chama o método {@code digitar()} da superclasse para obter o número e o nome,
     * e depois solicita os dados específicos desta classe.
     */
    @Override
    public void digitar() {
        // A palavra 'super' chama o método 'digitar()' da superclasse (Pessoa).
        // Isso é importante para reutilizar o código que pede o número e o nome.
        super.digitar();
        // Após preencher os dados da superclasse, pede os dados específicos de PessoaFisica.
        cpf = JOptionPane.showInputDialog("Digite o CPF: ");
        rg = JOptionPane.showInputDialog("Digite o RG: ");
    }

    /**
     * Sobrescreve o método da superclasse para exibir também os dados de CPF e RG.
     * Primeiro, chama o método {@code mostrar()} da superclasse para exibir o número e o nome,
     * e depois exibe os dados específicos desta classe.
     */
    @Override
    public void mostrar() {
        // Chama o método da classe pai para mostrar os dados comuns.
        super.mostrar();
        // Imprime os dados específicos da Pessoa Física.
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
    }
}