package Ex02_Entregable;

public class Main {
    
    public static void main(String[] args) {
        Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];

        // Series
        series[0] = new Serie("Breaking Bad", "Vince Gilligan");
        series[1] = new Serie("Stranger Things", 4, "Fantasía", "Duffer Brothers");
        series[2] = new Serie("Mr.Robot", "Peter Morgan");
        series[3] = new Serie("Chernobyl", 1, "Histórico", "Craig Mazin");
        series[4] = new Serie("The Mandalorian", 2, "Ciencia Ficción", "Jon Favreau");

        // Videojuegos
        videojuegos[0] = new Videojuego("League of Legends", 9999);
        videojuegos[1] = new Videojuego("Minecraft", 100, "Creativo", "Mojang");
        videojuegos[2] = new Videojuego("Final Fantasy VII Remake", 35);
        videojuegos[3] = new Videojuego("Cyberpunk 2077", 60, "RPG", "CD Projekt Red");
        videojuegos[4] = new Videojuego("FIFA 24", 15, "Deporte", "EA Sports");

        // Entregando 2 videojuegos y 2 series
        series[1].entregar();
        series[3].entregar();
        videojuegos[0].entregar();
        videojuegos[2].entregar();

        // Contando entregados y devolviendo
        int countSeriesEntregadas = 0;
        int countVideojuegosEntregados = 0;

        for (Serie serie : series) {
            if (serie.isEntregado()) {
                countSeriesEntregadas++;
                serie.devolver();
            }
        }

        for (Videojuego videojuego : videojuegos) {
            if (videojuego.isEntregado()) {
                countVideojuegosEntregados++;
                videojuego.devolver();
            }
        }
        System.out.println("Series entregadas: " + countSeriesEntregadas);
        System.out.println("Videojuegos entregados: " + countVideojuegosEntregados);

        // Buscando la serie con más temporadas y el videojuego con más horas
        Serie serieMaxTemporadas = series[0];
        Videojuego videojuegoMaxHoras = videojuegos[0];

        for (int i = 1; i < 5; i++) {
            if (series[i].compareTo(serieMaxTemporadas) > 0) {
                serieMaxTemporadas = series[i];
            }

            if (videojuegos[i].compareTo(videojuegoMaxHoras) > 0) {
                videojuegoMaxHoras = videojuegos[i];
            }
        }

        System.out.println("\nSerie con más temporadas:");
        System.out.println(serieMaxTemporadas.toString());
        System.out.println("\nVideojuego con más horas:");
        System.out.println(videojuegoMaxHoras.toString());
    }
}