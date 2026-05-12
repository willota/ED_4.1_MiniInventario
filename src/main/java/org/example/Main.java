import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("MiniInventario iniciado correctamente.");
        System.out.println("Sistema preparado para futuras mejoras.");
    }

    public static void buscarProducto(ArrayList<String> productos, String nombreBuscado) {
        boolean encontrado = false;

        for (String producto : productos) {
            if (producto.equalsIgnoreCase(nombreBuscado)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Producto encontrado en el inventario.");
        } else {
            System.out.println("El producto no existe en el inventario.");
        }
    }
}