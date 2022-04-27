import java.util.Scanner;

public class ej17PiramideDeNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese el tamaño de Piramide que desea: ");
        numero = sc.nextInt();
        piramideRecursiva(numero);
        sc.close();
    }

    public static void piramideRecursiva(int cantRepeticiones) {
        // Caso Base
        if (cantRepeticiones == 1) {
            System.out.print(cantRepeticiones);
        } else {
            // El orden de los factores altera al producto.
            // Si quiero una piramide al revez, coloco la recursiva en ultima posicion.
            piramideRecursiva(cantRepeticiones - 1);
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
