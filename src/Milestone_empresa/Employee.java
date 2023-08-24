package Milestone_empresa;

public abstract class Employee {

    protected double salario;
    public String nombre;

    public Employee(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public abstract double calcularSalario();
    public abstract void validarSalario() throws Exception;

    public void aplicarBono() {
        this.salario += this.salario * 0.10;
    }
}
