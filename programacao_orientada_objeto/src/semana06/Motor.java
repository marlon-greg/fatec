
public class Motor {

    private final int velocidade_maxima = 100;
    private final int velocidade_minima = 0;
    private boolean status;
    private int velocidade;

    public void ligar() {
        status = true;
    }

    public void desligar() {
        status = false;
    }

    public String acelerar() {
        String retorno = "Da pra ir mais rápido";
        if (status == true) {

            if (velocidade < velocidade_maxima) {
                velocidade++;
            } else {
                retorno = "Velocidade máxima atingida";
            }
        } else {
            retorno = "Motor desligado";
        }
        return retorno;

    }

    public String frear() {
        String retorno = "";
        if (velocidade > velocidade_minima) {
            velocidade--;
            retorno = "Freando";
        } else {
            retorno = "Velocidade mínima atingida";
        }
        return retorno;

    }

    public void mostrar() {
        System.out.println("Status: " + (status == true ? "Ligado" : "Desligado"));
        System.out.println("Velocidade: " + velocidade);
    }
}
