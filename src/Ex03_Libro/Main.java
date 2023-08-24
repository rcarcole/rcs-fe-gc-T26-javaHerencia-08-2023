package Ex03_Libro;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("978-3-16-148410-0", "Steve Jobs", "Walter Isaacson", 1000);
        Libro libro2 = new Libro("978-0-262-03488-0", "Don Quijote de la Mancha", "Miguel de Cervantes", 1500);

        System.out.println(libro1);
        System.out.println(libro2);

        if (libro1.getNumeroDePaginas() > libro2.getNumeroDePaginas()) {
            System.out.println("El libro '" + libro1.getTitulo() + "' tiene más páginas.");
        } else if (libro1.getNumeroDePaginas() < libro2.getNumeroDePaginas()) {
            System.out.println("El libro '" + libro2.getTitulo() + "' tiene más páginas.");
        } else {
            System.out.println("Ambos libros tienen el mismo número de páginas.");
        }
    }
}