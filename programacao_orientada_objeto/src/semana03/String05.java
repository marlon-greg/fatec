package semana03;
public class String05 {

    public static void main(String[] args) {
        String ra = "1050482423017";

        // Substring: pega dentro de um range os valores de uma String (Excluindo o último)
        String unidade = ra.substring(0, 3);
        String curso = ra.substring(3, 6);
        String ano = "20"+ra.substring(6, 8);
        String semestre = ra.substring(8,  9);

        // equals: Método que recebe uma STRING e retorna um BOOLEANO. Serve para comparar strings
        if(semestre.equals("1")) semestre = "primeiro semestre";
        if(semestre.equals("2")) semestre = "segundo semestre";
        System.out.println(ra);
        System.out.println(unidade);
        System.out.println(curso);
        System.out.println(ano);
    }
}
