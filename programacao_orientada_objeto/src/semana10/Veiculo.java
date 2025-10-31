package semana10;

public class Veiculo {

    public static void utilizar(Motor m) {
        m.ligar();
        m.desligar();
        m.acelerar();
        m.frear();
    }

    public static void main(String[] args) {
        Automovel a = new Automovel();
        Veiculo.utilizar(a);
    }
}
