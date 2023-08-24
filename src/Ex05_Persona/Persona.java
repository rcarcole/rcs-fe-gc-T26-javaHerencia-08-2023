package Ex05_Persona;

abstract class Persona {
    protected String nombre;
    protected int edad;
    protected char sexo;
    
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    // Verificamos disponibilidad
    public abstract boolean estaDisponible();
}