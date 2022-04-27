import java.util.Random;

public class ej07sumaMatriz {
    public static void main(String[] args) {
        int[][] matriz = new int[3][2];
        cargarRandom(matriz);
        leerArreglo2D(matriz);
        mostrarSumaPorFila(matriz, 0);
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

    public static int sumarFila(int[][] matriz, int variacionDeFila, int ultimaPosicionCol ) {
        int suma;
        if(ultimaPosicionCol == 0){
            suma=matriz[variacionDeFila][ultimaPosicionCol];
        }else{
            suma = matriz[variacionDeFila][ultimaPosicionCol] + sumarFila(matriz, variacionDeFila, ultimaPosicionCol-1);
        }
        return suma;
    }

    public static void mostrarSumaPorFila(int[][]matriz, int fila){
        if (fila < matriz.length) {
            System.out.println(sumarFila(matriz, fila, matriz[0].length-1));
            mostrarSumaPorFila(matriz, fila+1);
        }
    }


}
