package Ex05_Persona;

class Aula {
    private Profesor profesor;
    private Estudiante[] estudiantes;

    public Aula(Profesor profesor, Estudiante[] estudiantes) {
        this.profesor = profesor;
        this.estudiantes = estudiantes;
    }

    public void clase() {
        if(profesor.estaDisponible()) {
            int countEstudiantes = 0;
            for(Estudiante estudiante : estudiantes) {
                if(estudiante.estaDisponible()) {
                    countEstudiantes++;
                }
            }
            System.out.println("El profesor de " + profesor.getMateria() + " está disponible.");
            System.out.println(countEstudiantes + " estudiantes están disponibles para la clase.");
        } else {
            System.out.println("El profesor no está disponible.");
        }
    }
}
