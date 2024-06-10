import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String str = "Olá! ";
        String nome = "Paulo";
        String nome1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Qual seu nome? ");
        nome1 = sc.nextLine();

        System.out.println(str + " " + nome);
        System.out.println(str + " " + nome1);

        // Pulando uma linha
        System.out.println("O Corinthians é o último \nCampeão Mundial Brasileiro");

        // Dando um TAB
        System.out.println("O Corinthians é o último \tCampeão Mundial Brasileiro");

        // Dando um usando "aspas"
        System.out.println("O Corinthians é o último \"Campeão Mundial Brasileiro\"");

        // Usando \ no texto
        System.out.println("O Corinthians é o último \\ Campeão Mundial Brasileiro");
    }
}

