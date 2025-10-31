package semana10;

public class Automovel implements Motor, Turbo, Porta {

    public void ligar() {
        System.out.println("Liga o motor do automovel");
    }

    public void desligar() {
        System.out.println("Desligar o motor do automovel");
    }

    public void acelerar() {
        System.out.println("Acelera o automovel");
    }

    public void frear() {
        System.out.println("Freia o automovel");
    }

    public void acionar() {
        System.out.println("Turbo do automovel acionado");
    }

    public void resetar() {
        System.out.println("Turbo do automovel cancelado");
    }

    public void abrir() {
        System.out.println("Porta do automovel aberta");
    }

    public void fechar() {
        System.out.println("Porta do automovel fechada");
    }

    public void Mostrar() {
        System.out.println("Mostrando automovel");
    }


}
