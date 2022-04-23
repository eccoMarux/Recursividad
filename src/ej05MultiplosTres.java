import java.util.Scanner;

public class ej05MultiplosTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero entero: ");
        numero = sc.nextInt();
        System.out.println("Cantidad de digitos multiplos de 3: " + cuentaMultiplos3(numero));
        sc.close();
    }

    private static int cuentaMultiplos3(int numero) {
        int acumulador = 0, contadorAux = 0;
        int digitoEvaluado;
        digitoEvaluado = numero % 10;
        if (numero > 0) {
            if (digitoEvaluado % 3 == 0) {
                contadorAux++;
            }
            acumulador = contadorAux + cuentaMultiplos3(numero / 10);
        }
        return acumulador;
    }
}