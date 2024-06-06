public class Main {
    public static void main(String[] args) {

        System.out.println("Adição:         2 + 2 = " + (2 + 2));
        System.out.println("Subtração:      3 - 2 = " + (3 - 2));
        System.out.println("Divisão:        2 / 2 = " + (2 / 2));
        System.out.println("Multiplicação:  2 * 2 = " + (2 * 2));

        // Pegar o resto da divisão
        System.out.println("Resto divisão:  2 % 2 = " + (5 % 2));
        System.out.println();

        int numero = 10;
        float multiplicador = 2.4f;
        System.out.println(numero - 5);
        System.out.println(numero + 5);
        System.out.println(numero / 5);
        System.out.println(numero * 5);
        System.out.println(numero % 5);
        System.out.println();

        System.out.println(numero - multiplicador);
        System.out.println(numero + multiplicador);
        System.out.println(numero / multiplicador);
        System.out.println(numero * multiplicador);
        System.out.println();

        // Simplificar os operadores
        System.out.println(numero -= 9);
        System.out.println(numero += 5);
        System.out.println(numero /= 2);
        System.out.println(numero *= 8);
        System.out.println();
    }
}
