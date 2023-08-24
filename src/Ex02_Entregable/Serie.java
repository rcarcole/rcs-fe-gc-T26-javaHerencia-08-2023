package Ex02_Entregable;

public class Serie implements Entregable {

    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    private static final int TEMPORADAS_POR_DEFECTO = 3;
    private static final boolean ENTREGADO_POR_DEFECTO = false;

    public Serie() {
        this.numeroTemporadas = TEMPORADAS_POR_DEFECTO;
        this.entregado = ENTREGADO_POR_DEFECTO;
    }

    public Serie(String titulo, String creador) {
        this();
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this(titulo, creador);
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
    }

    public String getTitulo() { return titulo; }
    public int getNumeroTemporadas() { return numeroTemporadas; }
    public String getGenero() { return genero; }
    public String getCreador() { return creador; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setNumeroTemporadas(int numeroTemporadas) { this.numeroTemporadas = numeroTemporadas; }
    public void setGenero(String genero) { this.genero = genero; }
    public void setCreador(String creador) { this.creador = creador; }

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
        if (a instanceof Serie) {
            return Integer.compare(this.numeroTemporadas, ((Serie) a).getNumeroTemporadas());
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Serie{" + "titulo='" + titulo + '\'' + ", numeroTemporadas=" + numeroTemporadas +
               ", genero='" + genero + '\'' + ", creador='" + creador + '\'' + '}';
    }
}
