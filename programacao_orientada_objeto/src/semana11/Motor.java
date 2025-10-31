package semana11;

public abstract class Motor {
    public int codigo;
    public String fabricante;
    public double preco;

    public abstract void ligar();
    public abstract void desligar();
    public abstract void acelerar();
    public abstract void frear();

    public void esfriar() {
        System.out.println("Esfriando");
    }
}
