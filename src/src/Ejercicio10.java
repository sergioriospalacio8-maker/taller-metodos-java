import java.util.ArrayList;

public class Ejercicio10 {
    public static void main(String[] args){

        Inventario inventario = new Inventario();

        inventario.agregarProducto(new Producto("Arroz", 4500, 10));
        inventario.agregarProducto(new Producto("Leche", 3500, 8));
        inventario.agregarProducto(new Producto("Pan", 2000, 15));

        Inventario.mostrarInventario(inventario.productos);
        double total = Inventario.calcularValorTotalInventario(inventario.productos);
        System.out.println("\nValor total del inventario: $" + total);
        
    }
}

class Producto {

    String nombre;
    double precio;
    int cantidad;

    public Producto(String nombre, double precio, int cantidad){

        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
}

class Inventario {

    ArrayList<Producto> productos;

    public Inventario(){
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public static double calcularValorTotalInventario(
            ArrayList<Producto> productos){

        double total = 0;

        for (Producto producto : productos){
            total += producto.precio * producto.cantidad;
        }
        return total;
    }
}
