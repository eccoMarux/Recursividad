import java.util.Random;

public class ej11SumaParImpar {
    public static void main(String[] args) {
        int[] arregloPar = new int[7];
        int[] arregloImpar = new int[4];
        cargarRandom(arregloPar);
        cargarRandom(arregloImpar);
        
        System.out.println("En un arreglo de ultima posicion PAR (posicion 0 a 2k)");
        leerArreglo1D(arregloPar);
        System.out.println("Suma en posiciones pares: "+sumarValoresPares(arregloPar, arregloPar.length-1));
        System.out.println("Suma en posiciones impares: "+sumarValoresImpares(arregloPar, arregloPar.length-1));   

        System.out.println("\nEn un arreglo de ultima posicion IMPAR (posicion 0 a 2k+1)");
        leerArreglo1D(arregloImpar);
        System.out.println("Suma en posiciones pares: "+sumarValoresPares(arregloImpar, arregloImpar.length-1));
        System.out.println("Suma en posiciones impares: "+sumarValoresImpares(arregloImpar, arregloImpar.length-1));
    }

    public static void cargarRandom(int[] arreglo) {
        int i, longitud;
        longitud = arreglo.length;
        for (i = 0; i < longitud; i++) {
            arreglo[i] = new Random().nextInt(1, 10);
        }
    }

    public static void leerArreglo1D(int[] arreglo) {
        int i, longitudArreglo;
        longitudArreglo = arreglo.length;
        System.out.print("Arreglo: ");
        for (i = 0; i < longitudArreglo; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public static int sumarValoresPares(int[] arreglo, int posicionFinal) {
        int posicion = posicionFinal;
        int suma;
        if (posicion == 0) {
            suma= arreglo[posicion];
        } else {
            if(posicion%2 == 0){
                suma = (arreglo[posicion]) + sumarValoresPares(arreglo, posicion-2);
            }else{
                posicion--;
                suma = (arreglo[posicion]) + sumarValoresPares(arreglo, posicion-2);
            }
        }
        return suma;
    }

    public static int sumarValoresImpares(int[] arreglo, int posicionFinal) {
        int posicion = posicionFinal;
        int suma;
        if (posicion == 1) {
            suma= arreglo[posicion];
        } else {
            if(posicion%2 == 0){
                posicion--;
                suma = (arreglo[posicion]) + sumarValoresImpares(arreglo, posicion-2);
            }else{
                suma = (arreglo[posicion]) + sumarValoresImpares(arreglo, posicion-2);
            }
        }
        return suma;
    }
}
