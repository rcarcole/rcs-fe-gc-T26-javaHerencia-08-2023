package Ex06_Cine;

import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Titanic", 180, 13, "James Cameron");
        Cine cine = new Cine(pelicula, 10.5);

        Random rand = new Random();

        for (int i = 0; i < 50; i++) {
            Espectador espectador = new Espectador("Espectador " + (i+1), rand.nextInt(100), rand.nextDouble() * 50);
            cine.sentarEspectador(espectador);
        }
    }
}