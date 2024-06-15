import java.util.Scanner;

public class ControleFluxo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ControleFluxo1 ctr = new ControleFluxo1();

        // SOLICITAR VIA TECLADO
        System.out.print("Qual sua idade: ");
        ctr.maiorIdade(sc.nextInt());

        // INFORMADO PELO SISTEMA
        ctr.maiorIdade(20);

        sc.close();
    }

    // MÉTODO - FUNÇÕES
    void maiorIdade(int idade){
        if (idade > 17){
            if (idade > 60 ){
                System.out.println("Terceira idade.");
            } else {
                System.out.println("Pessoa maior de idade.");
            }
        } else {
            System.out.println("Pessoa menor de idade.");
        }
    }
}
