package Milestone_empresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Employee> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        empleados.add(emp);
    }

    public void emitirBono() {
        for (Employee emp : empleados) {
            emp.aplicarBono();
        }
    }

    public static void main(String[] args) {
        Empresa miEmpresa = new Empresa();

        try {
            // Creo empleados
            Boss jefe = new Boss("Jefe Juan", 8500);
            Manager gerente = new Manager("Gerente Ana", 4000);
            Senior seniorEmp = new Senior("Senior Pedro", 3000);
            Mid midEmp = new Mid("Mid María", 2000);
            Junior juniorEmp = new Junior("Junior Luis", 1200);
            Volunteer voluntario = new Volunteer("Voluntario Pepe", 250);

            // Validamos salarios
            jefe.validarSalario();
            gerente.validarSalario();
            seniorEmp.validarSalario();
            midEmp.validarSalario();
            juniorEmp.validarSalario();
            voluntario.validarSalario();

            // Add empleados a la empresa
            miEmpresa.addEmployee(jefe);
            miEmpresa.addEmployee(gerente);
            miEmpresa.addEmployee(seniorEmp);
            miEmpresa.addEmployee(midEmp);
            miEmpresa.addEmployee(juniorEmp);
            miEmpresa.addEmployee(voluntario);

            // Imprimir los salarios
            System.out.println("Salario de " + jefe.nombre + ": " + jefe.calcularSalario());
            System.out.println("Salario de " + gerente.nombre + ": " + gerente.calcularSalario());
            System.out.println("Salario de " + seniorEmp.nombre + ": " + seniorEmp.calcularSalario());
            System.out.println("Salario de " + midEmp.nombre + ": " + midEmp.calcularSalario());
            System.out.println("Salario de " + juniorEmp.nombre + ": " + juniorEmp.calcularSalario());
            System.out.println("Salario de " + voluntario.nombre + ": " + voluntario.calcularSalario());

        } catch (SalaryException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
			e.printStackTrace();
		}
    }

}
