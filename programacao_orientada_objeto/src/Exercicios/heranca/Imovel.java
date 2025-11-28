
abstract class Imovel {

    private String descricao;
    private String endereco;
    private double preco;

    public void cadastrarImovel(String descricao, String endereco, double preco) {
        this.descricao = descricao;
        this.endereco = endereco;
        this.preco = preco;
    }

}
