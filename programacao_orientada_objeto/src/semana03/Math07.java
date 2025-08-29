package semana03;

public class Math07 {
    public static void main(String[] args) {
        String[] alunos = {"Eduardo", "Murilo", "Arthur", "Rogério", "Armando", "Camila"};
        int qtde = alunos.length; // Length sem parenteses é proprieade. No caso do array/lista

        int n = (int)(Math.random()*qtde);
        System.out.println(alunos[n]);

    }
    
}
