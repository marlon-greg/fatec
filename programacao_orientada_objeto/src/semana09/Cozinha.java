package semana09;

public class Cozinha {

    public String descricao;
    public Lampada lampada1;

    // composição, as lãmpadas estão dentro da Sala e são criadas ao mesmo tempo que a sala.
    public Cozinha() {
        lampada1 = new Lampada();
    }
}
