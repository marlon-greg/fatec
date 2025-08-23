package src.semana03;

public class Math03 {

    public static void main(String[] args) {
        System.out.println(Math.random());// Gera valores aleatórios entre 0....1
        System.out.println((int) Math.random()); // Gera valores aleatórios entre 0....1 com o (int) vai dar sempre zero
        System.out.println((int) (Math.random() * 100)); // Gera valores aleatórios entre 0....100 com * 100 para dar casas decimais maior que 0 e menor que 100

        System.out.println("Vou gerar os números da loteria para você");
        for (int cartao = 0; cartao < 10; cartao++) {
            System.out.print("Cartão:" +(cartao + 1) + ": ");
            for (int i = 1; i < 6; i++) {
                System.out.print((int) (1 + Math.random() * 60) + " ");
            }
            System.out.println();
        }
    }
}
