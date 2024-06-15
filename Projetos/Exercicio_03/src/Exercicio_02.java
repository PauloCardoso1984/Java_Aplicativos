import java.util.Scanner;

public class Exercicio_02 {
    /* Escreva um programa para ajudar a empresa XPTO calcular o bonus que os funcionários
    receberão no final do ano. Os bonus são classificados por cargo.

    1 - Gerentes                R$ 2.000,00 (< 2 anos)        R$ 3.000,00
    2 - Coordenadores           R$ 1.500,00 (<= 1 ano)        R$ 2.000,00
    3 - Engenheiros Software    R$ 1.000,00
    4 - Estágiarios             R$ 500,00
    *
    * */

    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Exercicio_02 ex = new Exercicio_02();

        System.out.println("Qual a sua função na empresa:");
        System.out.print("1 - Gerente \n2 - Coordenadores \n3 - Engenheiro de Software \n4 - Estágiário \nDigite: ");
        ex.bonus(sc.nextInt());
    }


    String bonus (int cargo) {
        if (cargo == 1) {
            System.out.print("Qual tempo de serviço? ");
            int tempo = sc.nextInt();
            if (tempo < 2) {
                System.out.println("Gerente BONUS de => R$ 2.000,00");
            } else {
                System.out.println("Gerente BONUS de => R$ 3.000,00");
            }

        } else if (cargo == 2) {
            System.out.print("Qual tempo de serviço? ");
            int tempo = sc.nextInt();
            if (tempo <= 1 ) {
                System.out.println("Coordenadores BONUS de => R$ 1.500,00");
            } else {
                System.out.println("Coordenadores BONUS de => R$ 2.000,00");
            }

        } else if (cargo == 3) {
            System.out.println("Engenheiro de Software BONUS de => R$ 1.000,00");
        } else {
            System.out.println("Estágiário BONUS de => R$ 500,00");
        }
        return null;
    }
}
