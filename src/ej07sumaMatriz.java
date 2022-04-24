import java.util.Random;
public class ej07sumaMatriz {
    public static void main(String[] args) {
        int[][] matriz ={{1,1},{2,2},{3,3}};
        //int[][] matriz = new int[3][2];
        //cargarRandom(matriz);
        int[] resultado = new int[3];
        leerArreglo2D(matriz);
        sumarFilas(matriz, 3, 2, resultado);
        leerArreglo1D(resultado); 
    }

    public static void leerArreglo2D(int[][] arreglo) {
        int i, j ;
        System.out.print("Matriz: \n");
        for (i = 0; i < arreglo.length; i++) {
            for (j= 0; j < arreglo[0].length; j++) {
                System.out.print(arreglo[i][j] + " ");
            }
           System.out.println();
        }
    }

    public static void leerArreglo1D(int[] arreglo) {
        int i, longitudArreglo;
        longitudArreglo = arreglo.length;
        System.out.print("Resultado de la suma de cada fila: \n");
        for (i = 0; i < longitudArreglo; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }

    public static int sumarFilas(int[][] matriz, int filas, int columnas, int[] resultado) {
        int suma=0;
        if(columnas == 0){
            suma = matriz[filas][columnas];
        }elseif(filas > 0){
            suma = sumarFilas(matriz, filas-1, columnas, resultado);
        }else{
            if(filas>0){
                columnas--;
                if(columnas>=-1){
                    filas--;
                    suma = matriz[filas][columnas] + sumarFilas(matriz, filas, columnas-1, resultado);
                    resultado[filas] = suma;
                }
            }
        }
        return suma;
    }

    public static void cargarRandom(int[][] arreglo) {
        int i, j;
        for (i = 0; i < arreglo.length; i++) {
            for (j = 0; j < arreglo[0].length; j++) {
                arreglo[i][j] = new Random().nextInt(10);
            }
        }
    }
}
