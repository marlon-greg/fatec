public class Horista extends Funcionario {
    private double precoHora;
    private int horasTrabalhadas;

    @Override
    public void calcularSalario(double salario) {
        super.calcularSalario(salario + (precoHora * horasTrabalhadas));
    }
}
