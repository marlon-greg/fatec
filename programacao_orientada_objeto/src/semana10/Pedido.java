package semana10;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    public int numero;
    public String dataEmissao;

    public List<Item> items = new ArrayList<Item>();

    public void addItem(String produto, int quantidade, float precoUnitario) {
        Item i = new Item();
        i.produto = produto;
        i.quantidade = quantidade;
        i.precoUnitario = precoUnitario;

        items.add(i);
    }

    public void mostrar() {
        float total = 0;

        System.out.println(numero);
        System.out.println(dataEmissao);

        for(Item i: items) {
            i.mostrar();
            total = total + (i.quantidade * i.precoUnitario);
        }

        System.out.println("Total do pedido: " + total);
    }

    private class Item {
        public String produto;
        public int quantidade;
        public float precoUnitario;
        public void mostrar() {
            System.out.println(produto + "-" + quantidade + "-" + precoUnitario);
        }
    }
}
