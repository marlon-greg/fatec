package semana09;

import java.util.List;

public class Cargo {

    public int id;
    public String nome;
   // public Funcionario[] funcionarios; // opção 2
    public List<Funcionario> lista; // opção2

    public void mostrar() {
        System.out.println(id);
        System.out.println(nome);

        for(Funcionario f: lista) {
            System.out.println(f.nome);
        }
    }
}
