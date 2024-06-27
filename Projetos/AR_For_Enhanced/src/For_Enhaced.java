public class For_Enhaced {
    public static void main(String[] args) {
        int valores[] = {1, 2, 3, 4, 5, 6};

        // MELHOR MANEIRA
        for (int v : valores) {
            System.out.println(v);
        }
        System.out.println();

        // MANEIRA MAIS UTILIZADA
        for(int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");
        }
    }
}
