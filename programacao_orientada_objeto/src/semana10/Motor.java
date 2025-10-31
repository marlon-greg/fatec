package semana10;

public interface Motor {

    // contém apenas especifições
    public abstract void ligar(); // são por natureza "abstract", ou seja, não é instanciável
    void desligar();
    void acelerar();
    void frear();
}
