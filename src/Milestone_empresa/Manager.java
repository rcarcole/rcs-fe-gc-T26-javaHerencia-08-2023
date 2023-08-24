package Milestone_empresa;

public class Manager extends Employee {

    public Manager(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularSalario() {
        return salario * 1.10;
    }

    @Override
    public void validarSalario() throws Exception {
        if (salario <= 3000 || salario >= 5000) {
            throw new Exception("Salario de Manager no válido.");
        }
    }
}
