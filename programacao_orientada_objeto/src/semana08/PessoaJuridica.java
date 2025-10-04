import javax.swing.JOptionPane;
    
/**
 * Subclasse que herda de Pessoa e representa uma pessoa jurídica.
 * Adiciona os atributos específicos de CNPJ e Razão Social.
 */
public class PessoaJuridica  extends Pessoa {
    // Atributos específicos da Pessoa Jurídica.
    private String cnpj; 
    private String razaoSocial;

    /**
     * Sobrescreve o método da superclasse para capturar também os dados de CNPJ e Razão Social.
     * Primeiro, chama o método {@code digitar()} da superclasse para obter o número e o nome,
     * e depois solicita os dados específicos desta classe.
     */
    @Override
    public void digitar() {
        // Chama o método 'digitar()' da superclasse para obter o número e o nome.
        super.digitar();
        // Pede os dados específicos de Pessoa Jurídica.
        cnpj = JOptionPane.showInputDialog("Digite o CNPJ: ");
        razaoSocial = JOptionPane.showInputDialog("Digite a Razão Social: ");
    }

    /**
     * Sobrescreve o método da superclasse para exibir também os dados de CNPJ e Razão Social.
     * Primeiro, chama o método {@code mostrar()} da superclasse para exibir o número e o nome,
     * e depois exibe os dados específicos desta classe.
     */
    @Override
    public void mostrar() {
        // Chama o método da classe pai para mostrar os dados comuns.
        super.mostrar();
        // Imprime os dados específicos da Pessoa Jurídica.
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Razão Social: " + razaoSocial);
    }
}
