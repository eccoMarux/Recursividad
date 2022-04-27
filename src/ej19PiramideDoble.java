import java.util.Scanner;
public class ej19PiramideDoble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese el tamaño de Piramide que desea: ");
        numero = sc.nextInt();
        piramide(numero);
        sc.close();
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
            imprimeSumaDeUno(cantRepeticiones, 1);
            imprimeRestaDeUno(cantRepeticiones);
        }
    }

    public static void imprimeRestaDeUno(int numero) {
        if (numero > 0) {
            System.out.print((numero) + " ");
            imprimeRestaDeUno(numero - 1);
        }
    }

    public static void imprimeSumaDeUno(int numero, int inicio) {
        if (inicio < numero) {
            System.out.print((inicio) + " ");
            imprimeSumaDeUno(numero, inicio+1);
        }
    }
}
