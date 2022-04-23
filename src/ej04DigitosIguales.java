import java.util.Scanner;

public class ej04DigitosIguales {
    public static void main(String[] args) throws Exception {
        int numero, posicion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();
        posicion = Integer.toString(numero).length() - 1;
        System.out.println(
                "Retorna 'true' si los digitos son todos iguales / 'false' si los digitos no son todos iguales. \nRetorno: "
                        + compruebaIgualdad(numero, posicion));
        sc.close();
    }

    public static boolean compruebaIgualdad(int numero, int posicion) {
        boolean igualdad, aux;
        int casoBase, numEvaluado;
        casoBase = Integer.toString(numero).charAt(0);
        numEvaluado = Integer.toString(numero).charAt(posicion);

        if (casoBase == numEvaluado) {
            igualdad = true;
            if (posicion > 0 && igualdad) {
                aux = compruebaIgualdad(numero, posicion - 1);
                if (aux == false) {
                    igualdad = aux;
                }
            }
        } else {
            igualdad = false;
        }
        return igualdad;
    }
}
