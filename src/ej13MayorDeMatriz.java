import java.util.Random;

public class ej13MayorDeMatriz {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        cargarRandom(matriz);
        leerArreglo2D(matriz);
        System.out.println(buscaMayorMatriz(matriz, 0));
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

    public static int mayorEnFila(int[][]matriz, int fila, int columna){
        int mayor =0, valorBase, valorEnPosicion;
            if(columna>= 0 && columna < matriz[0].length){
                valorEnPosicion = matriz[fila][columna];
                valorBase = mayorEnFila(matriz, fila, columna+1);
                if(valorEnPosicion< valorBase){
                    mayor = valorBase;
                }else{
                    mayor = valorEnPosicion;
                }
        }
        return mayor;
    }

    public static int buscaMayorMatriz(int[][]matriz, int fila){
        int mayor=0, mayorEstaFila, mayorSiguienteFila;
        if (fila >=0 && fila < matriz.length) {
            mayorEstaFila= mayorEnFila(matriz, fila, 0);
            mayorSiguienteFila= buscaMayorMatriz(matriz, fila+1);
            if(mayorEstaFila > mayorSiguienteFila){
                mayor= mayorEstaFila;
            }else{
                mayor = mayorSiguienteFila;
            }
        }
        return mayor;
    }
}