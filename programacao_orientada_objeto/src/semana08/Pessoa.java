
import javax.swing.JOptionPane;

/**
 * Superclasse (ou classe pai) que define atributos e métodos comuns a todas as 'Pessoas'.
 * Contém informações básicas como número e nome.
 */
public abstract class Pessoa {

    // Atributos encapsulados (privados) para garantir a segurança dos dados.
    //private int numero;
    private int numero;
    protected String nome;

    /**
     * Captura os dados básicos (número e nome) do usuário através de caixas de diálogo.
     * Os valores inseridos são armazenados nos atributos da classe.
     */
    public void digitar() {
        // Pede ao usuário para digitar um número e o armazena no atributo 'numero'.
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: "));
        // Pede ao usuário para digitar um nome e o armazena no atributo 'nome'.
        nome = JOptionPane.showInputDialog("Digite o nome:");
    }

    /**
     * Exibe os dados atuais (número e nome) do objeto no console.
     */
    public void mostrar(){
        // Imprime o valor do atributo 'numero'.
        System.out.println("Numero: " + numero);
        // Imprime o valor do atributo 'nome'.
        System.out.println("Nome: " + nome);
    }

}
