public class Ejercicio8 {
    public static void main(String[] args){

        int[] tabla = generarTablaMultiplicar(5);
        System.out.println("Tabla del 5:");

        for (int i = 0; i < tabla.length; i++){
            System.out.println("5 x" + (i + 1) + "=" + tabla[i]);
        }
    }

    public static int[] generarTablaMultiplicar(int numero){
        int[] resultados = new int[10];

        for (int i = 0; i < resultados.length; i++){
            resultados[i] = numero * (i + 1);
        }

        return resultados;
    }
}
