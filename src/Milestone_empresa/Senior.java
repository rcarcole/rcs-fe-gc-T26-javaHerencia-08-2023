package Milestone_empresa;

public class Senior extends Employee {

    public Senior(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularSalario() {
        return salario * 0.95;
    }

    @Override
    public void validarSalario() throws SalaryException {
        if (salario <= 2700 || salario >= 4000) {
            throw new SalaryException("Salario de Senior no válido.");
        }
    }
}
