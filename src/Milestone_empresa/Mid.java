package Milestone_empresa;

public class Mid extends Employee {

    public Mid(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularSalario() {
        return salario * 0.90;
    }

    @Override
    public void validarSalario() throws SalaryException {
        if (salario <= 1800 || salario >= 2500) {
            throw new SalaryException("Salario de Mid no válido.");
        }
    }
}
