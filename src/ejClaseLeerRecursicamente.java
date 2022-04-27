public class ejClaseLeerRecursicamente {
    public static void main(String[] args) {
        int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        mostrarRecMatriz(matriz, 0, 0);
    }

    public static void mostrarRecMatriz(int[][] mat, int fil, int col) {
        if (col == mat[0].length) { // llegamos a la ultima columna
            System.out.println(" ");
            col = 0;
            fil++;
        }
        // terminamos la ultima fila
        if (fil < mat.length) {
            System.out.print(" | " + mat[fil][col] + " | ");
            mostrarRecMatriz(mat, fil, col + 1);
        }
    }

    
}
