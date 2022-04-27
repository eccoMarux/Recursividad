import java.util.Scanner;

public class ej15VocalesEnCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = "Anita lavala tina";
        System.out.println("Ingrese una frase o palabra: ");
        cadena = sc.nextLine();
        System.out.println("La frase o palabra tiene " + cuentaVocales(cadena, 0) + " vocales.");
        sc.close();
    }

    public static int cuentaVocales(String cadena, int posicion) {
        int cantVocales = 0;
        char caracter;
        cadena = cadena.toLowerCase();
        if (posicion < cadena.length()) {
            caracter = cadena.charAt(posicion);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                cantVocales = 1 + cuentaVocales(cadena, posicion + 1);
            } else {
                cantVocales = cuentaVocales(cadena, posicion + 1);
            }
        }
        return cantVocales;
    }
}
