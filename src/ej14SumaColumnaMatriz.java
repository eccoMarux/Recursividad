import java.util.Random;

public class ej14SumaColumnaMatriz {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        cargarRandom(matriz);
        leerArreglo2D(matriz);
        mostrarSumaPorColumnas(matriz, 0);
    }

    public static void cargarRandom(int[][] arreglo) {
        int i, j;
        for (i = 0; i < arreglo.length; i++) {
            for (j = 0; j < arreglo[0].length; j++) {
                arreglo[i][j] = new Random().nextInt(10);
            }
        }
    }

    public static void leerArreglo2D(int[][] arreglo) {
        int i, j;
        System.out.print("Matriz: \n");
        for (i = 0; i < arreglo.length; i++) {
            for (j = 0; j < arreglo[0].length; j++) {
                System.out.print(arreglo[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int sumarColumna(int[][] matriz, int ultimaPosicionFila, int variacionDeColumna ) {
        int suma;
        if(ultimaPosicionFila == 0){
            suma=matriz[ultimaPosicionFila][variacionDeColumna];
        }else{
            suma = matriz[ultimaPosicionFila][variacionDeColumna] + sumarColumna(matriz, ultimaPosicionFila-1, variacionDeColumna);
        }
        return suma;
    }

    public static void mostrarSumaPorColumnas(int[][]matriz, int columna){
        if (columna < matriz[0].length) {
            System.out.println("La suma de la columna "+(columna+1)+" es: "+sumarColumna(matriz, matriz.length-1, columna));
            mostrarSumaPorColumnas(matriz, columna+1);
        }
    }
}
