import java.util.Scanner;
public class ej08Palindromo {
    public static void main(String[] args) {
        int inicio, fin;
        String palindromo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una oracion a ser evaluada como palindromo: ");
        //ejemplo Somos o No Somos // neuquen // anita lava la tina.
        palindromo = sc.nextLine();
        palindromo = palindromo.replaceAll(" ", "");
        palindromo = palindromo.toLowerCase();
        System.out.println("True si es palindomo / False si no es palindromo: ");
        inicio = 0;
        fin = palindromo.length() - 1;
        System.out.println(esPalindromo(palindromo, inicio, fin));
        sc.close();
    }

    public static boolean esPalindromo(String oracion, int inicio, int fin) {
        boolean palindromo=true, evaluacion;
        int limite;
        limite = oracion.length() / 2;
        if (oracion.charAt(inicio) == oracion.charAt(fin)) {
            //Caso base: palindromo. En caso de que palindromo sea falso, se corta la recursividad y retorna falso.
            palindromo = true;
            if (palindromo && inicio < limite && fin > limite) {
                evaluacion = esPalindromo(oracion, inicio + 1, fin - 1);
                if (evaluacion == false) {
                    palindromo = evaluacion;
                }
            }  
        }else{
            palindromo = false;
        }
        return palindromo;
    }

}
