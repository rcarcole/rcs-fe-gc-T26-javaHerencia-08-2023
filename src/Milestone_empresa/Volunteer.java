package Milestone_empresa;

public class Volunteer extends Employee {

    private double ayudaGubernamental;

    public Volunteer(String nombre, double ayudaGubernamental) {
        super(nombre, 0);
        this.ayudaGubernamental = ayudaGubernamental;
    }

    @Override
    public double calcularSalario() {
        return 0;
    }

    @Override
    public void validarSalario() throws SalaryException {
        if (ayudaGubernamental > 300) {
            throw new SalaryException("Ayuda gubernamental para el voluntario excede el límite.");
        }
    }

    @Override
    public void aplicarBono() {
        // Dejamos vacio el metodo porque los voluntarios noi reciben bonos.
    }
}
