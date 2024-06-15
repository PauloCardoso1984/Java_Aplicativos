import java.util.Scanner;

public class Exercicio_04 {
    /*Escreva um programa para ser usado na portaria de um enevento.
    a - Peça a idade. Menores de idade não são permitidos. Mensagem: "Negado, menores de idade não são permitidos...
    b - Peça o tipo de convite. Os tipos de convite são comum, premium e luxo. Negar a entrada caso não seja nenhum destes. Mensagem: "Negado, convite inválido..
    c - Peça o código do convite. Convite premium e luxo começam com "XL". Convites comuns começam com "XT". Cso o código não esteja nos padrões, negar a entrada. Mensagem: "Negado, convite inválido.
    d - Caso todos os critérios sejam satisfeitos, exibir "Welcome :)".
    **/

    public static void main(String[] args) {
        Exercicio_04 ex = new Exercicio_04();

        // Maneira 1
    /*    ex.controleEntrada1();
     */
        // Maneira 2
        System.out.println(ex.controleEntrada2());
    }

    // METODO - FUNÇÃO
    // MANEIRA 1 =====================================================================
    void controleEntrada1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a idade : ");
        int idade = sc.nextInt();
        if (idade < 18) {
            System.out.println("Negado, menores de idade não são permitidos...");
        } else {
            System.out.println("Informe qual tipo de seu convite : \n1 - Comum \n2 - Premium \n3 - Luxo");
            int convite = sc.nextInt();
            if (convite == 1 || convite == 2 || convite == 3) {
                System.out.print("Informe o código do convite : ");
                sc.nextLine();
                String codigo = sc.nextLine();

                if (convite == 2 || convite == 3) {
                    if (codigo.startsWith("XL")) {
                        System.out.println("Welcome :)");
                    } else {
                        System.out.println("Acesso negado, convite inválido!");
                    }
                } else if (convite == 1) {
                    if (codigo.startsWith("XT")) {
                        System.out.println("Welcome :)");
                    } else {
                        System.out.println("Acesso negado, convite inválido!");
                    }

                }
            } else {
                System.out.println("Negado, convite inválido..");
            }

        }

    }

    // MANEIRA 2 =====================================================================
    String controleEntrada2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a idade : ");
        int idade = sc.nextInt();

        if (idade < 18) {
            return "Negado, menores de idade não são permitidos...";
        }

        System.out.println("Informe qual tipo de seu convite : \n1 - Comum \n2 - Premium \n3 - Luxo");
        int convite = sc.nextInt();

        if (convite == 1 && convite == 2 && convite == 3) {
            return "Negado, convite inválido..";
        }
        System.out.print("Informe o código do convite : ");
        sc.nextLine();
        String codigo = sc.nextLine();

        if ((convite == 2 || convite == 3) && codigo.startsWith("XL")) {
            return "Welcome :)";
        }

        if ((convite == 1) && codigo.startsWith("XT")) {
            return "Welcome :)";

        }
        return "Negado, convite inválido..";
    }
}
