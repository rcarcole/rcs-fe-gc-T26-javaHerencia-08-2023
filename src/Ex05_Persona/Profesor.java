package Ex05_Persona;

import java.util.Random;

class Profesor extends Persona {
    private String materia;

    public Profesor(String nombre, int edad, char sexo, String materia) {
        super(nombre, edad, sexo);
        this.materia = materia;
    }
    
    // 20% de posibilidad de no estar disponible
    @Override
    public boolean estaDisponible() {
        Random rand = new Random();
        return rand.nextInt(100) >= 20;
    }
    
    public String getMateria() {
        return materia;
    }
}
