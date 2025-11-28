public class Comissionado extends Funcionario {
    private double totalVendas;
    private double taxaComissao;
    private final int porcentagem = 100;

    @Override
    public void calcularSalario(double salario) {
        super.calcularSalario(salario + (totalVendas * taxaComissao/porcentagem));
    }
    
}
