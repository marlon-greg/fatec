
public class UsaGarrafa {

    public static void main(String[] args) {
        Garrafa garrafa1 = new Garrafa();

        garrafa1.material = "vidro";
        garrafa1.abrir();
        garrafa1.encher();
        garrafa1.mostrar();

        System.err.println(garrafa1.consumir(50000));
        garrafa1.mostrar();
        garrafa1.esvaziar();
        garrafa1.fechar();

        garrafa1.mostrar();
    }
}
