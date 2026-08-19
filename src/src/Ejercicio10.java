public class Ejercicio10 {
    public static void main(String[] args){

        Inventario inventario = new Inventario();

        inventario.agregarProductos(new Producto("Arroz", 4500, 10));
        inventario.agregarProductos(new Producto("Leche", 3500, 8));
        inventario.agregarProductos(new Producto("Pan", 2000, 15));

        Inventario.mostrarInventario(inventario.productos);
        double total = Inventario.calcularValorTotalInventario(inventario.productos);
        System.out.println("\nValor total del inventario: $" + total);
        
    }
}
