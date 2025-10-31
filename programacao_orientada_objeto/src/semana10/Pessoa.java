package semana10;

public class Pessoa implements Fisio { // fornecedora da interface

    @Override
    public void comer() {
        System.out.println("Pessoa comendo");
    }

    @Override
    public void beber() {
        System.out.println("Pessoa bebendo");
    }

    @Override
    public void dormir() {
        System.out.println("Pessoa dormindo");
    }
}
