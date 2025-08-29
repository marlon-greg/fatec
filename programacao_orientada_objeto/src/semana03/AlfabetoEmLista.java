package semana03;
import java.util.ArrayList;
import java.util.List;

public class AlfabetoEmLista {
    public static void main(String[] args) {
        List<Character> alfabeto = new ArrayList<>();

        for (char letra = 'a'; letra <= 'z'; letra++) {
            alfabeto.add(letra);
        }

        System.out.println(alfabeto);
        // Saída: [a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z]
    }
}