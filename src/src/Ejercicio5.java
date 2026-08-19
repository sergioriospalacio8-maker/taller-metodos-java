public class Ejercicio5 {
    public static void main(String[] args){

        double promedio1 = calcularPromedio(4.0, 5.0);
        System.out.println("Promedio de dos notas:" + promedio1);
        double[] notas = {4.0 , 3.5, 5.0, 4.5};
        double promedio2 = calcularPromedio(notas);

        System.out.println("Promedio del arreglo:" + promedio2);
    }
}
