

public class ej01Suma {
    public static void main(String[] args) throws Exception {
        System.out.println("Suma de valores desde 0 a n: ");
        System.out.println("Por recursividad: "+func(2));
        System.out.println("Por iteracion: "+iterativo(2));
    }

    public static int func(int n) {
        int aux;
        if (n == 0) {
            aux = 0;
        } else {
            aux = n + func(n - 1);
        }
        return aux;
    }

    public static int iterativo(int n){
        int suma=0;
        for (int i = 0; i <= n; i++) {
            suma += i;
        }
        return suma;
    }
}
