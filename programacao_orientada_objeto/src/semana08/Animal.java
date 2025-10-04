/**
 * Classe abstrata que define a estrutura base para todos os Animais.
 * Em polimorfismo, ela estabelece os métodos comuns (comer, beber)
 * que as subclasses concretas (Gato, Galinha) devem implementar.
 */
abstract class Animal {

    /**
     * Método abstrato para a ação de comer. 
     * As subclasses são forçadas a fornecer uma implementação concreta.
     */
    public abstract void comer();

    /**
     * Método abstrato para a ação de beber.
     * As subclasses são forçadas a fornecer uma implementação concreta.
     */
    public abstract void beber();

}
