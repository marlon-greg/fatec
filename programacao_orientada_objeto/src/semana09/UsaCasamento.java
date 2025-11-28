package semana09;

public class UsaCasamento {
    public static void main(String[] args) {

        Homem h = new Homem();
        h.nome = "Sérgio";

        Mulher m = new Mulher();
        m.nome = "Ivone";

        Casamento c = new Casamento();
        c.cerimonialista = "Nestor";
        c.data = "21/01/1995";
        c.homem = h;
        c.mulher = m;
        c.mostrar();
    }
}
