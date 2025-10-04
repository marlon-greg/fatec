/**
 * Classe para demonstrar o polimorfismo com as classes de Animais.
 */
public class UsaAnimal {

    /**
     * Método que executa uma ação com um animal, sem saber qual animal específico é.
     * @param animal um objeto do tipo Animal (pode ser Gato, Galinha, etc.)
     */
    public static void alimentar(Animal animal) {
        System.out.println("\n--- Alimentando um animal ---");
        // POLIMORFISMO: Não importa se 'animal' é um Gato ou uma Galinha,
        // a JVM chamará o método comer() correto da classe específica.
        animal.comer();
        animal.beber();
    }

    public static void main(String[] args) {
        // --- Exemplo 1: Referência do tipo da superclasse ---
        System.out.println("--- Exemplo com referência de Animal ---");
        // Declara uma variável 'a' do tipo Animal. Ela pode apontar para qualquer subclasse de Animal.
        Animal a;

        // 'a' agora aponta para um objeto Gato.
        a = new Gato();
        // Ao chamar comer(), o método da classe Gato é executado.
        a.comer(); // Saída: Gato comendo ração de peixe.

        // 'a' agora aponta para um objeto Galinha.
        a = new Galinha();
        // Ao chamar comer(), o método da classe Galinha é executado.
        a.comer(); // Saída: Galinha ciscando e comendo milho.

        // --- Exemplo 2: Usando um método polimórfico ---
        Gato meuGato = new Gato();
        Galinha minhaGalinha = new Galinha();

        // Passa um objeto Gato para o método que espera um Animal.
        alimentar(meuGato);

        // Passa um objeto Galinha para o mesmo método.
        alimentar(minhaGalinha);
    }
}
