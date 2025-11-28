
public class Apartamento extends Imovel {

    private boolean possuiSacada;

    @Override
    public void cadastrarImovel(String descricao, String endereco, double preco) {
        super.cadastrarImovel(descricao, endereco, preco);
        this.possuiSacada = true;
    }
    
}
