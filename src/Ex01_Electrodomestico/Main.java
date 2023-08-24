package Ex01_Electrodomestico;


public class Main {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        // Creando objetos y asignandolos a las posiciones
        electrodomesticos[0] = new Electrodomestico();
        electrodomesticos[1] = new Lavadora(300, 35, 'C', "rojo", 45);
        electrodomesticos[2] = new Television(400, 15, 'B', "azul", 50, true);

        double precioElectrodomesticos = 0;
        double precioLavadoras = 0;
        double precioTelevisores = 0;

        for (Electrodomestico e : electrodomesticos) {
            if (e != null) {
                if (e instanceof Lavadora) {
                    precioLavadoras += e.precioFinal();
                } else if (e instanceof Television) {
                    precioTelevisores += e.precioFinal();
                }
                precioElectrodomesticos += e.precioFinal();
            }
        }

        System.out.println("Precio total electrodomésticos: " + precioElectrodomesticos);
        System.out.println("Precio total lavadoras: " + precioLavadoras);
        System.out.println("Precio total televisores: " + precioTelevisores);
    }
}