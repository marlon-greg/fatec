/**
 * Classe principal, responsável por criar os objetos (instanciar as classes) 
 * e executar os métodos para demonstrar o funcionamento do sistema.
 */
public class UsaPessoa {
    /**
     * Ponto de entrada da aplicação. Este método é executado quando o programa é iniciado.
     * Cria objetos de PessoaFisica, PessoaJuridica e Vendedor, solicita a entrada de dados
     * e exibe os dados no console.
     * @param args Argumentos de linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
        // --- Demonstração com PessoaFisica ---
        System.out.println("--- Cadastro de Pessoa Física ---");
        PessoaFisica pf = new PessoaFisica();
        pf.digitar();
        pf.mostrar();
        
        
        // --- Demonstração com PessoaJuridica ---
        System.out.println("\n--- Cadastro de Pessoa Jurídica ---");
        PessoaJuridica pj = new PessoaJuridica();
        pj.digitar();
        pj.mostrar();

        // --- Demonstração com Vendedor ---
        System.out.println("\n--- Cadastro de Vendedor ---");
        Vendedor v = new Vendedor();
        v.digitar();
        v.mostrar();

        
    }
}