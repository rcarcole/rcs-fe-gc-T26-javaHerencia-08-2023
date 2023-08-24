package Ex01_Electrodomestico;

public class Television extends Electrodomestico {

    private static final int RESOLUCION_DEFAULT = 20;
    private static final boolean SINTONIZADOR_DEFAULT = false;

    private int resolucion;
    private boolean sintonizadorTDT;

    public Television() {
        super();
        this.resolucion = RESOLUCION_DEFAULT;
        this.sintonizadorTDT = SINTONIZADOR_DEFAULT;
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = RESOLUCION_DEFAULT;
        this.sintonizadorTDT = SINTONIZADOR_DEFAULT;
    }

    public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public double precioFinal() {
        double precioTV = super.precioFinal();
        if (resolucion > 40) {
            precioTV += precioTV * 0.3;
        }
        if (sintonizadorTDT) {
            precioTV += 50;
        }
        return precioTV;
    }

    // Getters
    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }
}