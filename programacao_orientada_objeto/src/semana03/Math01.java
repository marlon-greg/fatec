package semana03;
public class Math01 {
    public static void main(String[] args) {

        String s= "ola";
        System.out.println(s.charAt(0)); // acesso do método via objeto

        int a = Math.abs(-10);
        System.out.println(a);

        int c=10, b=20, d=30;
        int maior2 = Math.max(Math.max(c,b),d); // gambiarra
        System.out.println(maior2);
        
        
        // Todos os métodos que são acessados a partir da class são chamados de ESTÁTICOS  
        int maior = Math.max(5, 6); // acesso do método via classe
        int menor = Math.min(5, 6);
        System.out.println(menor);
        System.out.println(maior);
    }
}
