/**
 * Classe concreta que representa uma Galinha, herdando de Animal.
 */
public class Galinha extends Animal {

    /**
     * Implementação específica do método comer para a Galinha.
     * POLIMORFISMO: O método 'comer' da superclasse Animal é sobrescrito
     * para ter um comportamento específico para a Galinha.
     */
    @Override
    public void comer() {
        System.out.println("Galinha ciscando e comendo milho.");
    }

    /**
     * Implementação específica do método beber para a Galinha.
     * POLIMORFISMO: O método 'beber' da superclasse Animal é sobrescrito
     * para ter um comportamento específico para a Galinha.
     */
    @Override
    public void beber() {
        System.out.println("Galinha bebendo água do bebedouro.");
    }
}
