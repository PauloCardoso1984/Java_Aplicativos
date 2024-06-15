import java.util.Scanner;

public class ExercicioFuncoes {


    // Função
    int exercicio (String palavra) {
        return palavra.length();
    }

    public static void main(String[] args) {

        /*Escreva uma função capaz de receber uma string e retornar a quantidade de caracteres*/

        Scanner sc = new Scanner(System.in);
        ExercicioFuncoes ex = new ExercicioFuncoes();
        
        System.out.print("Digite a palavra : ");
        String palavra = sc.nextLine();
        System.out.println("Quantidades de : " + ex.exercicio(palavra) + " letras.");
    }
}
