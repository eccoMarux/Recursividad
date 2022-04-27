public class ej18Bomba {
    public static void main(String[] args) {
        explotar(15, 3);
    }

    public static void explotar(int n, int b) {
        //Caso base
        if (b >= n)
            System.out.print(n + " ");
        else {
            explotar(n / b, b);
            explotar(n - (n / b), b);
        }
    }
}
