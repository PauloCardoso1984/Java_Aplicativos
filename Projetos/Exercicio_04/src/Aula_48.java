import java.util.Scanner;

public class Aula_48 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* Imprima os numeros de 1a 50 na mesma linha em ordem crescente.*/
        // Forma 1
        for (int i = 1; i <= 50; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        // Forma 2
        int j = 1;
        while (j <= 50){
            System.out.print(j + " ");
            j++;
        }
        System.out.println();

        // Forma 3
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 50);
        System.out.println();

        /*=============================================================================*/

        /* Imprima os numeros de 1a 50 na mesma linha em ordem decrescente.*/
        // Forma 1
        for (int i = 50; i >= 1; i--){
            System.out.print(i + " ");
        }
        System.out.println();

        // Forma 2
        int l = 50;
        while (l >= 1){
            System.out.print(l + " ");
            l--;
        }
        System.out.println();

        // Forma 3
        int m = 50;
        do {
            System.out.print(m + " ");
            m--;
        } while (m >= 1);
        System.out.println();

        /*=============================================================================*/

        /* Não imprimir os múltiplos de 5 */
        for (int i = 1; i <= 50; i++){
            if (i % 5 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        /*=============================================================================*/

        /* Faça a soma de todos os números no intervalo de 1 a 500 */
        int soma = 0;
        for (int i = 1; i <= 500; i++){
            soma += i;
            }
        System.out.println(soma);
        System.out.println();

        /*=============================================================================*/

        /* Escreva um programa capax de receber um número inteiro N e imprimir uma escada do tamanho N usando o caracter # */
        /* Se a entrada for 3, teremos
               #
               ##
               ###              */
        System.out.print("Qual o tamanho da escada: ");
        int n = sc.nextInt();

        int contador = 1;

        for (int i = 0; i < n; i++){
            for (int x = 0; x < contador; x++){
                System.out.print("#");
            }
            System.out.println();
            contador ++;
        }
    }
}
