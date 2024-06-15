import java.util.Scanner;

public class ControleFluxo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ControleFluxo ctr = new ControleFluxo();

        System.out.print("Qual sua idade: ");
        ctr.maiorDeIdade(sc.nextInt());
        System.out.print("\nDigite a suda idade para saber em que ano nasceu: ");
        ctr.anoNascimento(sc.nextInt());
    }

    // METODO - FUNÇÃO
    void maiorDeIdade(int idade){
        if (idade > 17 ){
            System.out.println("A pessoa é maior de idade.");
        } else {
            System.out.println("A pessoa é menor de idade.");
        }
    }
    void anoNascimento(int idade){
        System.out.println("Nasceu no ano de " + (2024 - idade));
    }
}
