package semana10;

public class Animal implements Fisio { // fornecedora da interface
    @Override
    public void comer() {
        System.out.println("Animal comendo");
    }

    @Override
    public void beber() {
        System.out.println("Animal bebendo");
    }

    @Override
    public void dormir() {
        System.out.println("Animal dormindo");
    }
}
