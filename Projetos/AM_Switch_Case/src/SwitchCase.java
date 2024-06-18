import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual cargo? \n1- Gerente \n2 - Analista \n3 - Supervisor \nDigite: ");
        new SwitchCase().calculaBonus(sc.nextLine(), 0f);

    }

    // MÉTODO - FUNÇÕES
    float calculaBonus(String cargo, float salario) {
        float bonus = 0f;


        switch (cargo){
            case "Gerente" :
                bonus = salario + 1.5f;
                System.out.println("Gerente recebe R$ : 1500,00");
                break;

            case "Analista" :
                bonus = salario + 1.2f;
                System.out.println("Analista recebe R$ : 1200,00");
                break;


            case "Supervisor" :
                bonus = salario + 1.1f;
                System.out.println("Supervisor recebe R$ : 1100,00");
                break;

            default:
                bonus = salario + 0.7f;
                System.out.println("Recebe R$ : 700,00");
                break;

        }
        return bonus;
    }
}
