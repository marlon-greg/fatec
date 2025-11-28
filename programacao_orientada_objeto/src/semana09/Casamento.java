package semana09;

public class Casamento {

    public String cerimonialista, data;
    public Homem homem;
    public Mulher mulher;

    public void mostrar() {
        System.out.println("Dados do casamento:");
        System.out.println(homem.nome);
        System.out.println(mulher.nome);
        System.out.println(cerimonialista);
        System.out.println(data);
    }
}
