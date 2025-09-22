// Com o Extends Thread eu digo que minha classe fica aberta a possibilidade de ser executada simultanea a outra. 

public class Word02 extends Thread {

    String texto = "Apostila de Java";

    public void run() { // Start
        Impressora.imprimir(texto);
    }

}
