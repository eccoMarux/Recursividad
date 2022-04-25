import java.util.Scanner;

public class ej10CaracterDifPunto {
    public static void main(String[] args) {
        System.out.println(agregarCaracter() + "es la cadena generada.");
    }

    public static String agregarCaracter(){
        Scanner sc = new Scanner(System.in);
        char ingreso;
        String cadena="";
        System.out.println("Ingrese un caracter. Punto para terminar: ");
        ingreso = sc.next().charAt(0);
        //Caso base: Si el ingreso es igual a punto, se deja de repetir.
        if(ingreso == '.'){
            cadena = " ";
        }else{
            cadena= ingreso + agregarCaracter();
        }
        sc.close();
        return cadena;
    }
}
