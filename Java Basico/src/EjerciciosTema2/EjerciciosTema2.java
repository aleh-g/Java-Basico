package EjerciciosTema2;

public class EjerciciosTema2 {
    public static void main(String[] args) {
        precioConIva(100);
    }

    static void precioConIva(int precio) {
        double precioIva = precio * 1.21;
        System.out.println("El precio con iva es: " + precioIva);
    }

}
