package Ex02_Entregable;

public class Videojuego implements Entregable {

    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;

    private static final int HORAS_ESTIMADAS_POR_DEFECTO = 10;
    private static final boolean ENTREGADO_POR_DEFECTO = false;

    public Videojuego() {
        this.horasEstimadas = HORAS_ESTIMADAS_POR_DEFECTO;
        this.entregado = ENTREGADO_POR_DEFECTO;
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this();
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this(titulo, horasEstimadas);
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() { return titulo; }
    public int getHorasEstimadas() { return horasEstimadas; }
    public String getGenero() { return genero; }
    public String getCompania() { return compania; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setHorasEstimadas(int horasEstimadas) { this.horasEstimadas = horasEstimadas; }
    public void setGenero(String genero) { this.genero = genero; }
    public void setCompania(String compania) { this.compania = compania; }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }

    @Override
    public int compareTo(Object a) {
        if (a instanceof Videojuego) {
            return Integer.compare(this.horasEstimadas, ((Videojuego) a).getHorasEstimadas());
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Videojuego{" + "titulo='" + titulo + '\'' + ", horasEstimadas=" + horasEstimadas +
               ", genero='" + genero + '\'' + ", compania='" + compania + '\'' + '}';
    }
}