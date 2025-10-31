package semana10;

public class Aviao implements Motor{
    @Override
    public void ligar() {
        System.out.println("Ligando o avião");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o avião");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando o avião");
    }

    @Override
    public void frear() {
        System.out.println("Freando o avião");
    }
}
