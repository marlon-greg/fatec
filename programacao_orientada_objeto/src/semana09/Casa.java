package semana09;

public class Casa {
    public Quarto q1, q2, q3;
    public Sala sala;
    public Cozinha cozinha;

    public Casa(){
        q1 = new Quarto();
        q2 = new Quarto();
        q3 = new Quarto();
        cozinha = new Cozinha();
        sala= new Sala();
    }
}
