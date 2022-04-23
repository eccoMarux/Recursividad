import java.util.Random;

public class ej06MayorDelArreglo {
    public static void main(String[] args) {
        int[] arreglo = new int[10];
        cargarRandom(arreglo);
        leerArreglo(arreglo);
        System.out.println("\nEl mayor valor del arreglo es: " + valorMaximo(arreglo, 0));
        System.out.println("El menor valor del arreglo es: " + valorMinimo(arreglo, 0));
    }

    public static void cargarRandom(int[] arreglo) {
        int i, longitud;
        longitud = arreglo.length;
        for (i = 0; i < longitud; i++) {
            arreglo[i] = new Random().nextInt(100);
        }
    }

    public static void leerArreglo(int[] arreglo) {
        int i, longitudArreglo;
        longitudArreglo = arreglo.length;
        System.out.print("Arreglo: ");
        for (i = 0; i < longitudArreglo; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }

    public static int valorMaximo(int[] arreglo, int posicion) {
        int valor = 0, auxiliar, valorEvaluado;
        if (posicion < arreglo.length - 1) {
            auxiliar = valorMaximo(arreglo, posicion + 1);
            valorEvaluado = arreglo[posicion];
            if (valorEvaluado > auxiliar) {
                valor = valorEvaluado;
            } else {
                valor = auxiliar;
            }
        } else {
            valor = arreglo[posicion];
        }
        return valor;
    }

    public static int valorMinimo(int[] arreglo, int posicion) {
        int valor = 0, auxiliar, valorEvaluado;
        if (posicion < arreglo.length - 1) {
            auxiliar = valorMinimo(arreglo, posicion + 1);
            valorEvaluado = arreglo[posicion];
            if (valorEvaluado < auxiliar) {
                valor = valorEvaluado;
            } else {
                valor = auxiliar;
            }
        } else {
            valor = arreglo[posicion];
        }
        return valor;
    }
}
