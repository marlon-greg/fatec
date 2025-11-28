package semana09;

public class UsaAutomovel {
    public static void main(String[] args) {
        Pneu p1 = new Pneu();
        p1.aro = "15";
        p1.marca = "Pirelli";

        Pneu p2 = new Pneu();
        p2.aro = "15";
        p2.marca = "Pirelli";

        Pneu p3 = new Pneu();
        p3.aro = "15";
        p3.marca = "Pirelli";

        Pneu p4 = new Pneu();
        p4.aro = "15";
        p4.marca = "Pirelli";

        Som som = new Som();
        som.potencia = "500W";

        Motor motor = new Motor();
        motor.potencia = "200CV";

        Automovel a1 = new Automovel("Porsche", motor, som);
        a1.addPneu(p1);
        a1.addPneu(p2);
        a1.addPneu(p3);
        a1.addPneu(p4);
        a1.listarPneus();
        a1.mostrar();

        Automovel a2 = new Automovel("Ferrari", motor, som);
        a2.addPneu(p1);
        a2.addPneu(p2);
        a2.addPneu(p3);
        a2.addPneu(p4);
        a2.listarPneus();
        a2.mostrar();
    }
}
