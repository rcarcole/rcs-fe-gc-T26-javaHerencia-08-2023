package Ex04_Raices;

public class Raices {
    
    private double a, b, c;

    // Constructor
    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Devuelve el discriminante
    public double getDiscriminante() {
        return (b * b) - (4 * a * c);
    }

    // ¿tiene 2 soluciones?
    public boolean tieneRaices() {
        return getDiscriminante() > 0;
    }

    // ¿Tiene una soluciuón?
    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }

    // Enseña soluciones si las hay
    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("No tiene soluciones reales.");
        }
    }

    // Obtener 2 raices
    private void obtenerRaices() {
        double x1 = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
        double x2 = (-b - Math.sqrt(getDiscriminante())) / (2 * a);
        System.out.println("Las soluciones de la ecuación son x1 = " + x1 + " y x2 = " + x2);
    }

    // una única raíz
    private void obtenerRaiz() {
        double x = -b / (2 * a);
        System.out.println("La solución única de la ecuación es x = " + x);
    }

    public static void main(String[] args) {
        Raices ecuacion = new Raices(1, -5, 6);
        ecuacion.calcular();
    }
}