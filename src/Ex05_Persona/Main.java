package Ex05_Persona;

public class Main {
    public static void main(String[] args) {
        Estudiante[] estudiantes = {
            new Estudiante("Juan", 18, 'M', 9.5),
            new Estudiante("Ana", 19, 'F', 8.0),
            new Estudiante("Pedro", 20, 'M', 7.5)
        };

        Profesor profesor = new Profesor("Sr. Smith", 45, 'M', "Matemáticas");
        Aula aula = new Aula(profesor, estudiantes);
        
        aula.clase();
    }
}
