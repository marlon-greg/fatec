package semana10;

public class Moto implements Motor{
    @Override
    public void ligar() {
        System.out.println("Ligando a moto");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando a moto");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando a moto");
    }

    @Override
    public void frear() {
        System.out.println("Freando a moto");
    }
}
