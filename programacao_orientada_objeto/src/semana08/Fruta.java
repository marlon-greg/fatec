/**
 * Classe abstrata que serve como base para todas as frutas.
 * Em polimorfismo, esta classe define um "contrato" comum (o método descascar)
 * que todas as subclasses devem seguir, cada uma à sua maneira.
 * Uma classe abstrata não pode ser instanciada diretamente (ex: new Fruta() daria erro).
 */
public abstract class Fruta {

    /**
     * Método genérico para descascar. As subclasses irão sobrescrever (override) este método
     * para fornecer uma implementação específica de como cada fruta é descascada.
     */
    public void descascar() {
        System.out.println("Descascando a fruta genérica...");
    }
}
