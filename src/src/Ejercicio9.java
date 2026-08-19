public class Ejercicio9 {
    public static void main(String[] args){

        String resultado = clasificarNota(4.7);
        System.out.println("Resultado:" + resultado);
    }

    public static String clasificarNota(double nota){

        if (nota < 3.0){
            return "Reprobado";

        } else if (nota < 4.5) {
            return "Aprobado";

        } else {
            return "Excelente";
        }
    }
}
