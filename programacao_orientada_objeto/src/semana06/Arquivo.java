import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Arquivo{

    public static void main(String[] args) {
        gravar();
        try {
            salvar();
        } catch (FileNotFoundException ex) {
        }

    }
// Tratou o erro com Try catch já na declaração do método
    public static void gravar(){ 
        try {
            PrintWriter pw = new PrintWriter("ar.txt"); 
        } 
        catch (FileNotFoundException ex) {
        }
    }
    // Não tratamos, usamos o throws que irá postergar o erro, terá que ser tratado quando chamar o método
    public static void salvar() throws FileNotFoundException{ 
        PrintWriter pw = new PrintWriter("ar.txt"); 
        //Essa linha gera uma excessão checada por esse motivo é obrigatório tratar. 
    }
}