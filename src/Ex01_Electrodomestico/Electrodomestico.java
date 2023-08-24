package Ex01_Electrodomestico;


public class Electrodomestico {

    protected static final double PRECIO_BASE_DEFAULT = 100.0;
    protected static final String COLOR_DEFAULT = "blanco";
    protected static final char CONSUMO_ENERGETICO_DEFAULT = 'F';
    protected static final double PESO_DEFAULT = 5.0;

    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
        this(PRECIO_BASE_DEFAULT, PESO_DEFAULT, CONSUMO_ENERGETICO_DEFAULT, COLOR_DEFAULT);
    }

    public Electrodomestico(double precioBase, double peso) {
        this(precioBase, peso, CONSUMO_ENERGETICO_DEFAULT, COLOR_DEFAULT);
    }

    public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.color = comprobarColor(color);
    }

    private char comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        if (letra >= 'A' && letra <= 'F') {
            return letra;
        }
        return CONSUMO_ENERGETICO_DEFAULT;
    }

    private String comprobarColor(String color) {
        String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
        for (String c : colores) {
            if (c.equalsIgnoreCase(color)) {
                return c;
            }
        }
        return COLOR_DEFAULT;
    }

    public double precioFinal() {
        switch (Character.toUpperCase(consumoEnergetico)) {
            case 'A':
                precioBase += 100;
                break;
            case 'B':
                precioBase += 80;
                break;
            case 'C':
                precioBase += 60;
                break;
            case 'D':
                precioBase += 50;
                break;
            case 'E':
                precioBase += 30;
                break;
            case 'F':
                precioBase += 10;
                break;
        }

        if (peso >= 0 && peso < 20) {
            precioBase += 10;
        } else if (peso >= 20 && peso < 50) {
            precioBase += 50;
        } else if (peso >= 50 && peso < 80) {
            precioBase += 80;
        } else {
            precioBase += 100;
        }

        return precioBase;
    }

    // Getters
    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }
}