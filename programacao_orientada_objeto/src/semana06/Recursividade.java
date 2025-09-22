public class Recursividade {
    public static void main(String[] args) {
       System.out.println(somatoriar(5));
    }

    /**
     * realiza a soma de todos os inteiros compreendidos entre 1 e N
     * @param n - valor inteiro que será definirá o início da soma
     * @return
     */
    public static int somatoriar(int n){
        if (n == 1) {
            return 1;
        } else {
            return n + somatoriar(n-1);
        }
    }

}
