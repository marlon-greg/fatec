package semana09;

import java.util.ArrayList;
import java.util.List;

public class Automovel {

    public String modelo;
    public Motor motor;
    public Som som;
    public List<Pneu> pneus = new ArrayList<Pneu>();

    public Automovel(String modelo, Motor motor, Som som) {
        this.modelo = modelo;
        this.motor = motor;
        this.som = som;
    }

    public void addPneu(Pneu pneu) {
        pneus.add(pneu);
    }

    public void listarPneus() {
        for(Pneu p: pneus) {
            System.out.println(p.aro);
            System.out.println(p.marca);
        }
    }

    public void mostrar() {
        System.out.println(modelo);
        System.out.println("Potência motor: " + motor.potencia);
        System.out.println("Potência som: " + som.potencia);
    }
}
