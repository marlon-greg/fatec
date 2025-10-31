package semana10;

public class UsaVeiculo {

    public static void main(String[] args) {
        Moto m = new Moto();
        Aviao a = new Aviao();
        Automovel at = new Automovel();

        m.ligar();
        m.acelerar();

        a.ligar();
        a.desligar();

        at.ligar();
        at.acelerar();
        at.frear();
        at.acionar();
        at.abrir();
    }


}
