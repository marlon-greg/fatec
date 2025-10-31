package semana10;

public class UsaVida {

    public static void main(String[] args) {
        Fisio f = new Pessoa();
        Vida.viver(f);

        Fisio a = new Animal();
        Vida.viver(a);

        Fisio e = new ET();
        Vida.viver(e);
    }
}
