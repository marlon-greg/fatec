package semana09;

public class UsaFuncionario {
    public static void main(String[] args) {

        Cargo c = new Cargo();
        c.id = 100;
        c.nome = "Programador";

        Funcionario f = new Funcionario(); // instancia o objeto do tipo funcionario
        f.id = 1;
        f.nome = "Pedro";
        f.cargo = c; // ocorre a associação entre os objetos
        f.mostrar();

        Funcionario f2 = new Funcionario();
        f2.id = 2;
        f2.nome = "Lucas";
        f2.cargo = c;
        f2.mostrar();
    }
}
