public class For {
    public static void main(String[] args) {

        // CRESCENTE
        for(int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        // DECRESCENTE
        for(int i = 10; i >=0; i--) {
            System.out.print (i + " ");
        }
        System.out.println();
        System.out.println();


        // PARES
        for(int i = 0; i < 10; i++ ) {
            if (i % 2 == 0) {
               System.out.println(i);
            }
        }
        System.out.println();

        // IMPARES
        for(int i = 0; i < 10; i++ ) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
