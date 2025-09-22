
public class UsaMotor {

    public static void main(String[] args) {
        Motor m = new Motor();
        m.ligar();
        m.mostrar();

        for (int i = 0; i < 102; i++) {

            System.out.println(m.acelerar());
            m.mostrar();
        }

        for (int i = 100; i > -2; i--) {
            System.out.println(m.frear());
            m.mostrar();
        }

        m.desligar();
        m.mostrar();

    }
}
