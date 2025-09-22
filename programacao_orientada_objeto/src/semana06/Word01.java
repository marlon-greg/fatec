
public class Word01 extends Thread{

    String texto = "Apostila de Python";

    public void run() { // Start
        Impressora.imprimir(texto);
    }
}
