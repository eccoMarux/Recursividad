import java.util.Scanner;
public class ej19PiramideDoble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese el tamaño de Piramide que desea: ");
        numero = sc.nextInt();
        piramide(numero, 0);
        sc.close();  
        
    }

    public static void piramide(int numeroCentral, int espacioBase) {
        // Caso Base
        if (numeroCentral == 1) {
            agregaEspacios(espacioBase);
            System.out.print(numeroCentral);
        } else {
            // El orden de los factores altera al producto.
            // Si quiero una piramide al revez, coloco la recursiva en ultima posicion.   
            piramide(numeroCentral - 1, espacioBase+2);
            System.out.println();
            agregaEspacios(espacioBase); 
            imprimeSumaDeUno(numeroCentral, 1);
            imprimeRestaDeUno(numeroCentral);
             
        }
    }

    public static void imprimeSumaDeUno(int numero, int inicio) {
        if (inicio < numero) {
            System.out.print((inicio) + " ");
            imprimeSumaDeUno(numero, inicio+1);
        }
    }

    public static void imprimeRestaDeUno(int numero) {
        if (numero > 0) {
            System.out.print((numero) + " ");
            imprimeRestaDeUno(numero - 1);
        }
    }

    public static void agregaEspacios(int numero){
        if(numero>=1){
            System.out.print(" ");
            agregaEspacios(numero-1);
        }
    }
}
