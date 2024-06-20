public class While {
    public static void main(String[] args) {

        //  WHILE

        int i = 0;
        int j = 0;
        int k = 10;

        // UM EM UM
        while(i <= 10){
            System.out.print(i + " ");
            i ++;
        }
        System.out.println();

        // DOIS EM DOIS
        while(j <= 10){
            System.out.print(j + " ");
            j += 2;
        }
        System.out.println();


        // DO WHILE
        do {
            System.out.print(k + " ");
            k -= 2;
        } while (k >= 0 );
    }
}
