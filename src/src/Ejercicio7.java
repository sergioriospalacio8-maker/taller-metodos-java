public class Ejercicio7 {
    public static void main(String[] args){

        double[] calificaciones = {4.0 , 3.5, 5.0, 4.5, 3.0,};
        double promedio = calcularPromedioClase(calificaciones);
        System.out.println("El promedio general de la clase es:" + promedio);
    }

    public static double calcularPromedioClase(double[] calificaciones){
        double suma = 0;

        for (int i = 0; i < calificaciones.length; i++){
            suma += calificaciones[i];

        }

        return suma / calificaciones.length;
    }
}
