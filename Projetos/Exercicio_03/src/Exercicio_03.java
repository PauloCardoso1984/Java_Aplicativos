public class Exercicio_03 {

    /* Veja o resultado das espressões lógicas */

    public static void main(String[] args) {

        boolean a = false, b = false, c = true, d = true;

        System.out.println("O resultado de (a && b && c && d)         : " + (a && b && c && d));
        System.out.println("O resultado de (!a && !b && (c && d))     : " + (!a && !b && (c && d)));
        System.out.println("O resultado de (a && ((b || c ) || !d))   : " + (a && ((b || c ) || !d)));
        System.out.println("O resultado de (a || ((!b && c ) || !d))  : " + (a || ((!b && c ) || !d)));
    }
}
