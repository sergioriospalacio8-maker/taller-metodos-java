public class Ejercicio6 {
    public static void main(String[] args){

        // Creamos un objeto de la clase Estudiante
        Estudiante estudiante1 = new Estudiante(4.5);

        // Llamo al metodo de instancia
        estudiante1.mostrarBoeltin();

        // Llamo al metodo satic sin crear un objeto
        double resultado = Estudiante.compararNotas(4.5, 3.8);
        System.out.println("La diferencia entre las notas es:" + resultado);
    }
}

class Estudiante {
    double nota;

    public Estudiante(double nota){
        this.nota = nota;
    }
}
