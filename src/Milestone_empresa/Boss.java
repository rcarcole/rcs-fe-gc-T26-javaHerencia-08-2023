package Milestone_empresa;

public class Boss extends Employee {

    public Boss(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularSalario() {
        return salario * 1.50;
    }

    @Override
    public void validarSalario() throws Exception {
        if (salario <= 8000) {
            throw new Exception("Salario de Boss no válido.");
        }
    }
}
