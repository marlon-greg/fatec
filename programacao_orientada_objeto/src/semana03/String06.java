package src.semana03;
public class String06 {

    public static void main(String[] args) {
        String s = "Aula de programação Orientada a Objetos";
        String n = "1,2,3,4,5,6,7,8,9,";

        //SPLIT: Método que fatiar/dividir/separar strings (onde vc pedir:  vírgula, espaço,etc.). Ele vai receber uma STRING e retorna um VETOR (Do mesmo tipo da variável que ele está executando o split)
        String [] palavras = s.split(" ");
        String [] numeros = n.split(",");

        for(String x: palavras){
            System.out.println(x);
        }

        for(String y: numeros){
            System.out.println(y);
        }

    }
    
}
