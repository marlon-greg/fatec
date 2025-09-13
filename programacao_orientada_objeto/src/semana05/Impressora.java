
public class Impressora {

    // ABAIXO ESTAMOS DOCUMENTO OS MÉTODOS
    /**
     * Imprime uma mensagem padrão.(sempre a mesma mensagem)
     */
    public static void imprimir() {
        System.out.println("Apostila de Java");
    }

    /**
     * Imprime em tela a mensagem o texto recebido como parâmetro.
     *
     * @param texto Texto a ser impresso.
     */
    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    /**
     * Imprime em tela a mensagem o texto recebido como parâmetro, repetida a
     * quantidade de vezes (n vezes).
     *
     * @param texto Texto a ser impresso.
     * @param qtde Quantidade de vezes que o texto será impresso.
     */
    public static void imprimir(String texto, int qtde) {
        for (int i = 0; i < qtde; i++) {
            System.out.println(texto);
        }
    }

    /**
     * Imprime em tela tudo que for digitado em maiuscula ou minuscula.
     *
     * @param texto Texto a ser impresso.
     * @param caixa Define se o texto será impresso em maiuscula ou minuscula
     */
    public static void imprimir(String texto, String caixa) {
        if (caixa.equalsIgnoreCase("maiuscula")) {
            System.out.println(texto.toUpperCase());
        } else {
            System.out.println(texto.toLowerCase());
        }
    }
}
