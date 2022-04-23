public class ej02DevuelveNumero {
    public static void main(String[] args) throws Exception {
        System.out.println(algo(5));
    }

    public static int algo(int n) {
        int aux;
        if (n == 1) {
            aux = 1;
        } else {
            aux = algo(n - 1) + 1;
        }
        return aux;
    }
}
