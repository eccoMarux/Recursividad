import java.util.Scanner;

public class ej09DivisionResta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisor, dividendo;

        System.out.println("Ingrese un numero entero a dividir: ");
        dividendo = sc.nextInt();
        do {
            System.out.println("Ingrese un numero entero divisor, DIFERENTE DE CERO: ");
            divisor = sc.nextInt();
        } while (divisor == 0);
        System.out.println("El resultado de dividir "+dividendo+" por " + divisor + " es: "+ divisionPorResta(dividendo, divisor));
        sc.close();
    }

    public static int divisionPorResta(int dividendo, int divisor){
        int resultado;
        //Caso base divisor>dividendo. Si ingresa en este caso, retorna cero y se suman todos los 1 para obtener el resultado de la division.
        if(divisor>dividendo){
            resultado=0;
        }else{
            resultado = 1 + divisionPorResta(dividendo-divisor, divisor);
        }
        return resultado;
    }
}
