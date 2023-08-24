package Milestone_software;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class Taller {

    // Clase Vehiculo anidada
	static abstract class Vehiculo {
	    protected String matricula;
	    protected String marca;
	    protected String color;
	    protected Rueda[] ruedas;
	    protected Titular titular;
	    protected List<Persona> conductores;

	    public Vehiculo(String matricula, String marca, String color) {
	        this.matricula = matricula;
	        this.marca = marca;
	        this.color = color;
	        this.conductores = new ArrayList<>();
	    }
	}


    // Clase Rueda anidada
	static class Rueda {
        private String marca;
        private double diametro;

        public Rueda(String marca, double diametro) {
            this.marca = marca;
            this.diametro = diametro;
        }
    }

    // Clase Coche anidada
    static class Coche extends Vehiculo {
        public Coche(String matricula, String marca, String color) {
            super(matricula, marca, color);
            ruedas = new Rueda[4];
        }

        public void setRuedasDelanteras(Rueda rueda1, Rueda rueda2) {
            ruedas[0] = rueda1;
            ruedas[1] = rueda2;
        }

        public void setRuedasTraseras(Rueda rueda1, Rueda rueda2) {
            ruedas[2] = rueda1;
            ruedas[3] = rueda2;
        }
    }

    // Clase Moto anidada
    static class Moto extends Vehiculo {
        public Moto(String matricula, String marca, String color) {
            super(matricula, marca, color);
            ruedas = new Rueda[2];
        }

        public void setRuedas(Rueda rueda1, Rueda rueda2) {
            ruedas[0] = rueda1;
            ruedas[1] = rueda2;
        }
    }
    
    // Clase Camion anidada (supongamos que un camion tiene 8 ruedas)
    static class Camion extends Vehiculo {
        public Camion(String matricula, String marca, String color) {
            super(matricula, marca, color);
            ruedas = new Rueda[8];
        }
    }

    // Clase Persona anidada
    static abstract class Persona {
        protected String nombre;
        protected String apellidos;
        protected String fechaNacimiento;

        public Persona(String nombre, String apellidos, String fechaNacimiento) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.fechaNacimiento = fechaNacimiento;
        }
    }

    // Clase Licencia anidada
    static class Licencia {
        private String id;
        private String tipoLicencia;
        private String nombreCompleto;
        private String fechaCaducidad;

        public Licencia(String id, String tipoLicencia, String nombreCompleto, String fechaCaducidad) {
            this.id = id;
            this.tipoLicencia = tipoLicencia;
            this.nombreCompleto = nombreCompleto;
            this.fechaCaducidad = fechaCaducidad;
        }
    }

    // Clase Conductor anidada, hereda de Persona
    static class Conductor extends Persona {
        private Licencia licencia;

        public Conductor(String nombre, String apellidos, String fechaNacimiento, Licencia licencia) {
            super(nombre, apellidos, fechaNacimiento);
            this.licencia = licencia;
        }
    }

    // Clase Titular anidada, hereda de Persona
    static class Titular extends Persona {
        private Licencia licencia;
        private boolean tieneSeguro;
        private boolean tieneGaraje;

        public Titular(String nombre, String apellidos, String fechaNacimiento, Licencia licencia, boolean tieneSeguro, boolean tieneGaraje) {
            super(nombre, apellidos, fechaNacimiento);
            this.licencia = licencia;
            this.tieneSeguro = tieneSeguro;
            this.tieneGaraje = tieneGaraje;
        }
    }

    // Gestionar el Taller
    static class GestionTaller {
        private List<Persona> personas;
        private List<Vehiculo> vehiculos;

        public GestionTaller() {
            this.personas = new ArrayList<>();
            this.vehiculos = new ArrayList<>();
        }

        public void agregarPersona(Persona persona) {
            this.personas.add(persona);
        }

        public void agregarVehiculo(Vehiculo vehiculo) {
            this.vehiculos.add(vehiculo);
        }
    }
    
    
    public static void main(String[] args) {
		GestionTaller gestionTaller = new GestionTaller();
	    Scanner sc = new Scanner(System.in);
	    while (true) {
	        System.out.println("=== MENÚ ===");
	        System.out.println("1. Crear Persona");
	        System.out.println("2. Crear Vehículo");
	        System.out.println("3. Listar Personas");
	        System.out.println("4. Listar Vehículos");
	        System.out.println("5. Salir");
	        System.out.print("Seleccione una opción: ");
	        int opcion = sc.nextInt();
	        sc.nextLine();
	
	        switch (opcion) {
	            case 1:
	                System.out.print("Nombre: ");
	                String nombre = sc.nextLine();
	
	                System.out.print("Apellidos: ");
	                String apellidos = sc.nextLine();
	
	                System.out.print("Fecha de Nacimiento (dd/mm/yyyy): ");
	                String fechaNacimiento = sc.nextLine();
	
	                System.out.println("¿Es titular? (1 para Sí, 2 para No):");
	                int esTitular = sc.nextInt();
	
	                if (esTitular == 1) {
	                    Titular titular = new Titular(nombre, apellidos, fechaNacimiento, null, false, false);
	                    gestionTaller.agregarPersona(titular);
	                } else {
	                    Conductor conductor = new Conductor(nombre, apellidos, fechaNacimiento, null);
	                    gestionTaller.agregarPersona(conductor);
	                }
	
	                System.out.println("Persona creada exitosamente.");
	                break;
	
	            case 2:
	                System.out.print("Matrícula: ");
	                String matricula = sc.nextLine();
	
	                System.out.print("Marca: ");
	                String marca = sc.nextLine();
	
	                System.out.print("Color: ");
	                String color = sc.nextLine();
	
	                System.out.println("Tipo de vehículo (1 para Coche, 2 para Moto, 3 para Camión):");
	                int tipoVehiculo = sc.nextInt();
	
	                Vehiculo vehiculo;
	                switch (tipoVehiculo) {
	                    case 1:
	                        vehiculo = new Coche(matricula, marca, color);
	                        break;
	                    case 2:
	                        vehiculo = new Moto(matricula, marca, color);
	                        break;
	                    case 3:
	                        vehiculo = new Camion(matricula, marca, color);
	                        break;
	                    default:
	                        System.out.println("Opción no válida.");
	                        continue;
	                }
	                gestionTaller.agregarVehiculo(vehiculo);
	                System.out.println("Vehículo creado exitosamente.");
	                break;
	
	            case 3:
	                System.out.println("=== Listado de Personas ===");
	                for (Persona persona : gestionTaller.personas) {
	                    System.out.println(persona.nombre + " " + persona.apellidos);
	                }
	                break;
	
	            case 4:
	                System.out.println("=== Listado de Vehículos ===");
	                for (Vehiculo v : gestionTaller.vehiculos) {
	                    System.out.println(v.matricula + " - " + v.marca + " - " + v.color);
	                }
	                break;
	
	            case 5:
	                System.out.println("Saliendo...");
	                return;
	
	            default:
	                System.out.println("Opción no válida. Intente nuevamente.");
	                }
	        }
	    }
    }