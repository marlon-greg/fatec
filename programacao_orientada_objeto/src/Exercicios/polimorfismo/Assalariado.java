public class Assalariado extends Funcionario {
    private double desconto;

    @Override
    public void calcularSalario(double salario) {
        super.calcularSalario(salario-desconto);
    }
}
