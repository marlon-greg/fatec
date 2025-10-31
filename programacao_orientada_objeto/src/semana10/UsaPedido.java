package semana10;

public class UsaPedido {

    public static void main(String[] args) {
        Pedido p = new Pedido();
        p.numero = 100;
        p.dataEmissao = "24/10/2025";
        p.addItem("Sabonete", 10, 2.34f);
        p.addItem("Detergente", 20, 1.99f);
        p.addItem("Sabão", 30, 0.50f);

        p.mostrar();
    }
}
