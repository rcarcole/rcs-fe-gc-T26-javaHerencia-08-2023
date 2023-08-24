package Ex01_Electrodomestico;

public class Lavadora extends Electrodomestico {

    private static final double CARGA_DEFAULT = 5.0;

    private double carga;

    public Lavadora() {
        super();
        this.carga = CARGA_DEFAULT;
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = CARGA_DEFAULT;
    }

    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, double carga) {
        super(precioBase, peso, consumoEnergetico, color);
        this.carga = carga;
    }

    @Override
    public double precioFinal() {
        double precioLavadora = super.precioFinal();
        if (carga > 30) {
            precioLavadora += 50;
        }
        return precioLavadora;
    }

    // Getter
    public double getCarga() {
        return carga;
    }
}