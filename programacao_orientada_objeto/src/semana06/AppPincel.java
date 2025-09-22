
public class AppPincel {

    public static void main(String[] args) {

        Pincel p1 = new Pincel();
        Pincel p2 = new Pincel();
        Pincel p3 = new Pincel();

        System.out.println("_________Pincel 1_________");
        p1.mostrar();
        p1.cor = "Azul";
        p1.preco = 2.24;
        p1.tamanho = 2;
        p1.mostrar();
        p1.limpar();
        p1.mostrar();

        System.out.println("_________Pincel 2_________");
        p2.mostrar();
        p2.cor = "verde";
        p2.mostrar();

        System.out.println("_________Pincel 3_________");
        p3.abrirTampa();
        p3.preco = 3.45;
        p3.mostrar();
        p3.fecharTampa();

    }
}
