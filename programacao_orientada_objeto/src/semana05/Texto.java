
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Texto {

    /**
     * Esse método inverte uma String (imprime ela espelhada)
     *
     * @param t -- texto a ser invertido
     */
    // método estático - Void não devolve nada
    public static void Inverter(String t) {
        for (int i = t.length() - 1; i >= 0; i--) {
            System.out.print(t.charAt(i));

        }
    }

    /**
     * Esse método inverte uma String e retorna ela espelhada
     *
     * @param t - texto a ser invertido
     * @return - retorna o texto invertido
     */
    // Agora retirando o void eu preciso definir o tipo do retorno
    public static String espelhar(String t) {
        String retorno = "";
        for (int i = t.length() - 1; i >= 0; i--) {
            retorno += (t.charAt(i));
        }
        //Toda vez que eu colocar um tipo eu tenho que devolver no return
        return retorno;
    }

    /**
     * Salva, armazen o texto fornecido em um arquivo.txt
     *
     * @param t - texto a ser salvo
     * @param path - caminho do arquivo
     */
    public static void salvar(String t, String path) {
        try {
            PrintWriter pw = new PrintWriter(path);
            pw.println(t);
            pw.close();
            System.out.println("Arquivo salvo com sucesso");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado" + e);
        }
    }

    /**
     * Verifica se deu certo e retorna true ou false
     *
     * @param t - texto a ser salvo
     * @param path - caminho do arquivo
     * @return - true se salvou, false se não salvou
     */
    // O ideal é que um método tenha um único retorno
    public static boolean save(String t, String path) {
        boolean retorno = false;
        try {
            PrintWriter pw = new PrintWriter(path);
            pw.print(t);
            pw.close();
            System.out.println("Arquivo salvo com sucesso");
            retorno = true;
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado" + e);
        }
        return retorno;
    }

    /**
     * Salva o arquivo em um diretório específico com nome específico
     *
     * @param t - texto a ser salvo
     * @param path - o caminho do diretório
     * @param fileName - nome do arquivo
     * @return - mensagem de sucesso ou falha
     */
    // essa é uma sobrecarga de método (overload)
    // mesmo nome, mas parâmetros diferentes
    public static String save(String t, String path, String fileName) {
        String retorno = "Arquivo salvo com sucesso";
        try {
            PrintWriter pw = new PrintWriter(path + "/" + fileName);
            pw.print(t);
            pw.close();
            System.out.println(retorno);
        } catch (FileNotFoundException e) {
            retorno = "Arquivo não encontrado" + e;

        }
        System.out.println(retorno);
        return retorno;
    }

    /**
     * Gera uma senha numérica e aleatória com a quantidade de dígitos informada
     * @param qtdeDigitos - quantidade de dígitos da senha
     * @return - retorna a senha aleatória gerada
     */

    public static String gerarSenha (int qtdeDigitos) {
        String senha = "";        
        for (int i = 0; i < qtdeDigitos; i++) {
            senha += (int)(Math.random() * 10);
        }
        return senha;
    }
}
