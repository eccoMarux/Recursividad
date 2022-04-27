public class ej12BuscarCaracter {
    public static void main(String[] args) {
        char[] caracteres = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
        char caracterFalso = 'm';
        char caracterVerdadero = 'd';
        imprimirArreglo1D(caracteres);
        System.out.println(
                "Existe el caracter 'd' en el arreglo entonces " + buscarCaracter(caracteres, caracterVerdadero, 0));
        System.out.println(
                "No existe el caracter 'm' en el arreglo entonces " + buscarCaracter(caracteres, caracterFalso, 0));
    }

    public static void imprimirArreglo1D(char[] arreglo) {
        int i, longitudArreglo;
        longitudArreglo = arreglo.length;
        System.out.print("Arreglo de caracteres: \n");
        for (i = 0; i < longitudArreglo; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public static boolean buscarCaracter(char[] arreglo, char caracter, int posicion) {
        boolean retorno;
        // CB: El arreglo en la posicion sea igual al caracter
        if (arreglo[posicion] == caracter) {
            retorno = true;
        } else {
            if (posicion < arreglo.length - 1) {
                retorno = buscarCaracter(arreglo, caracter, posicion + 1);
            } else {
                retorno = false;
            }

        }
        return retorno;
    }
}