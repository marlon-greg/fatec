
public class Pincel {

    /*Atributos(Propriedades) --> Definem o estado do objeto
    ou
    Variáveis de instância (pois pode mudar a cada instante)*/
    public String cor;
    public double preco;
    public int tamanho;

    // Métodos realizam ações sobre os dados do objeto
    // Métodos definem o comportamento de um objeto
    /**
     * Apresenta em tela o estado atual do objeto
     */
    public void mostrar() {
        System.out.println("Cor: " + cor);
        System.out.println("Preço: " + preco);
        System.out.println("Tamanho: " + tamanho);
    }

    /**
     * Limpa o estado do objeto
     *
     */
    public void limpar() {
        cor = "";
        preco = 0;
        tamanho = 12;
    }

    /**
     * Abre a tampa do pincel
     */
    public void abrirTampa() {
        System.err.println("A tampa do pincel foi aberta!");
    }

    /**
     * Fecha a tampa do pincel
     */
    public void fecharTampa() {
        System.err.println("A tampa do pincel foi fechada!");
    }

}
