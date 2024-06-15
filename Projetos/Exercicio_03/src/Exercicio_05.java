import java.util.Scanner;

public class Exercicio_05 {
    /*Escreva um programa capaz de ler dois números que representam os lados de uma figura geométrica
    * Informar se formam um quadrado (lados iguais)*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exercicio_05 ex = new Exercicio_05();

        System.out.println("Quais os lados: ");
        ex.quadrado(sc.nextInt(), sc.nextInt());
    }

    void quadrado(int x, int y){
        if (x == y){
            System.out.println("Pode ser um quadrado.");
        } else {
            System.out.println("Não é quadrado.");
        }
    }
}
