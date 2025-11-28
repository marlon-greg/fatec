package semana09;

public class Quarto {

    public String descricao;
    public Lampada lampada1;
    public ArCondicionado ar;

    // composição, as lãmpadas estão dentro da Sala e são criadas ao mesmo tempo que a sala.
    public Quarto() {
        lampada1 = new Lampada();
        ar = new ArCondicionado();
    }
}
