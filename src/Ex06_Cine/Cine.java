package Ex06_Cine;

import java.util.Random;

public class Cine {
    private Pelicula pelicula;
    private double precioEntrada;
    private Asiento[][] asientos;

    public Cine(Pelicula pelicula, double precioEntrada) {
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
        this.asientos = new Asiento[8][9];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {
                asientos[i][j] = new Asiento((char) ('A' + j), 8 - i);
            }
        }
    }

    public void sentarEspectador(Espectador espectador) {
        Random rand = new Random();
        while (true) {
            int fila = rand.nextInt(8);
            int columna = rand.nextInt(9);

            if (!asientos[fila][columna].estaOcupado() && espectador.getEdad() >= pelicula.getEdadMinima() && espectador.getDinero() >= precioEntrada) {
                espectador.pagar(precioEntrada);
                asientos[fila][columna].ocupar();
                System.out.println(espectador + " se ha sentado en " + asientos[fila][columna]);
                return;
            }
        }
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public Asiento[][] getAsientos() {
        return asientos;
    }
}
