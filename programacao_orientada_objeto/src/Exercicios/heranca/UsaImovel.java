import javax.swing.JOptionPane;

public class UsaImovel {

    public static void novoImovel(Imovel imovel){
        imovel.cadastrarImovel(descricao, endereco, preco);
    }

    public static void main(String[] args) {
        // Menu para escolher o tipo do imóvel
        Object[] options = {"Apartamento", "Casa", "Chacara"};
        String tipoImovel = (String) JOptionPane.showInputDialog(
                null,
                "Escolha o tipo de imóvel:",
                "Seleção de Imóvel",
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]);

        // Recebendo e trazendo a escolha do usuário com uma solicitação de dados referentes ao imóvel selecionado ao usuário e imprime tudo em tela
        if (tipoImovel.equals("Apartamento")) {
            Apartamento apartamento = new Apartamento();
            
        }
        

    }
}
