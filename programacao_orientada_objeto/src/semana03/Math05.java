package src.semana03;

public class Math05 {
    public static void main(String[] args) {
        
        String senha = "";
        int qtdeDigitos = 10;

        // utilizar o Random para concatenar e criar uma senha
        for(int i=1;i<=qtdeDigitos;i++){
            int n = (int)(Math.random()*10);
            // mesmo o senha sendo string e o n int, tudo que é concatenado para uma string VIRA STRING
            senha +=n;
        }
        System.out.println(senha);

    }
}
