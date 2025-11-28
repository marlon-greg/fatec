package semana09;

import java.util.ArrayList;
import java.util.List;

public class UsaCargo {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();
        f1.id = 1;
        f1.nome = "Paulo";

        Funcionario f2 = new Funcionario();
        f2.id = 2;
        f2.nome = "Ana";

        List<Funcionario> lista = new ArrayList<Funcionario>();
        lista.add(f1);
        lista.add(f2);

        Cargo c = new Cargo();
        c.id = 100;
        c.nome = "Analista";
        c.lista = lista; // adiciona a lista de funcionários ao cargo
        c.mostrar();
    }
}
