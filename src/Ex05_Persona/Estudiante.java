package Ex05_Persona;

import java.util.Random;

class Estudiante extends Persona {
    private double calificacion;

    public Estudiante(String nombre, int edad, char sexo, double calificacion) {
        super(nombre, edad, sexo);
        this.calificacion = calificacion;
    }
    
    // 50% de posibilidad de hacer novillos
    @Override
    public boolean estaDisponible() {
        Random rand = new Random();
        return rand.nextInt(100) >= 50;
    }
    
    public double getCalificacion() {
        return calificacion;
    }
}
