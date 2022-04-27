

public class ej19PiramideDoble {
    public static void main(String[] args) {
        piramide(5);
    }


    public static void piramide(int cantRepeticiones) {
        // Caso Base
        if (cantRepeticiones == 1) {
            System.out.print(cantRepeticiones);
        } else {
            // El orden de los factores altera al producto.
            // Si quiero una piramide al revez, coloco la recursiva en ultima posicion.
            piramide(cantRepeticiones - 1);
            System.out.println();
            imprimeRestaDeUno(cantRepeticiones);
        }
    }

    public static void imprimeRestaDeUno(int numero) {
        if (numero > 0) {
            System.out.print((numero) + " ");
            imprimeRestaDeUno(numero - 1);
        }
    }
}
