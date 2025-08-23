package src.semana03;

import java.util.Random;

public class Math04 {
    public static void main(String[] args) {
        Random r = new Random();
        // Gera valores aleatórios podendo escolher tipo e quantidade (vai de 0 a quantidade)
        System.out.println(r.nextInt(10,20)); // dessa maneira criamos um intervalo do 0 ao 20
        System.out.println(r.nextFloat(10)); // valores aletórios de 0 a 10
        System.out.println(r.nextDouble(10));
        /*
         Se não for inserido valor nenhum dentro do Random() ele pega como base o relógio
         Agora se você digitar algo dentro como Random(100) ele irá pegar o 100 como referencia e os resultados serão sempre os mesmos, provando ser uma Class que gera comandos semialeatórios
         */
    }
}
