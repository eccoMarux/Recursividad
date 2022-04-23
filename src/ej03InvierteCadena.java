public class ej03InvierteCadena {
    public static void main(String[] args) throws Exception {
        String numero = "123456789";
        int j = numero.length() - 1;
        mistery(j, numero);
    }

    public static void mistery(int p, String a) {
        if (p >= 0) {
            System.out.println(a.charAt(p));
            mistery(p - 1, a);
        }
    }
}
