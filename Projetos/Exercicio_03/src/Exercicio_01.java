import java.util.Scanner;

public class Exercicio_01 {
    /* Escreva um programa para ajudar a empresa XPTO calcular o bonus que os funcionários
    receberão no final do ano. Os bonus são classificados por cargo.

    1 - Gerentes                R$ 2.000,00
    2 - Coordenadores           R$ 1.500,00
    3 - Engenheiros Software    R$ 1.000,00
    4 - Estágiarios             R$ 500,00
    *
    * */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Exercicio_01 ex = new Exercicio_01();

        // MINHA CHAMADA
        System.out.println("Qual a sua função na empresa:");
        System.out.print("1 - Gerente \n2 - Coordenadores \n3 - Engenheiro de Software \n4 - Estágiário \nDigite: ");
        ex.bonus(sc.nextInt());

        // CHAMADA DO PROFESSOR
        System.out.println(ex.bonus2("Estagiário"));
    }

    // METODO MEU
    String bonus (int cargo) {
        if (cargo == 1) {
            System.out.println("Gerente BONUS de => R$ 2.000,00");
        } else if (cargo == 2) {
            System.out.println("Coordenadores BONUS de => R$ 1.500,00");
        } else if (cargo == 3) {
            System.out.println("Engenheiro de Software BONUS de => R$ 1.000,00");
        } else {
            System.out.println("Estágiário BONUS de => R$ 500,00");
        }
        return null;
    }

    // METODO PROFESSOR USANDO 0 =
    float bonus2 (String cargo) {
        if (cargo == "Gerente") {
            return 2000f;
        } else if (cargo == "Coordenador") {
            return 1500f;
        } else if (cargo == "Engenheiro de Software") {
            return 1000f;
        } else if (cargo == "Estagiário") {
            return 500f;
        }
        return 0f;
    }

    // METODO PROFESSOR USANDO Equals
    float bonus3 (String cargo) {
        if (cargo.equals("Gerente")) {
            return 2000f;
        } else if (cargo.equals("Coordenador")) {
            return 1500f;
        } else if (cargo.equals("Engenheiro de Software")) {
            return 1000f;
        } else if (cargo.equals("Estagiário")) {
            return 500f;
        }
        return 0f;
    }
}
