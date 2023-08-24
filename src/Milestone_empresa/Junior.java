package Milestone_empresa;

public class Junior extends Employee {

    public Junior(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularSalario() {
        return salario * 0.85;
    }

    @Override
    public void validarSalario() throws SalaryException {
        if (salario <= 900 || salario >= 1600) {
            throw new SalaryException("Salario de Junior no válido.");
        }
    }
}
