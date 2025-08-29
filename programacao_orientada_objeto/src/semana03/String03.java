package semana03;

public class String03 {
    public static void main(String[] args) throws InterruptedException {
        String aula = "Programação Orientada a Objetos";

        int tamanho = aula.length();

        int controle = 0;

        while (controle < tamanho) { 
            System.out.print(aula.charAt(controle));
            controle ++;
            Thread.sleep(500);
            
        }

        for(int i=aula.length()-1;i>=0;i--){
            System.out.print(aula.charAt(i));
            Thread.sleep(500);
        }

    }
}
