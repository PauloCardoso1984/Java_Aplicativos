import java.util.Scanner;

public class Exercicio_06 {
    /* Escreva um programa capaz de ler três números que representam os lados de um triângulo.
    Informar qual tipo do triangulo:
    - Equilátero - todos lados iguais
    - Escaleno - todos lados diferentes
    - Isosceles - dois lados iguais
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exercicio_06 ex = new Exercicio_06();

        System.out.println("Informe os 3 lados do triângulo: ");
        ex.triangulo(sc.nextInt(), sc.nextInt(), sc.nextInt());

        sc.close();
    }

    void triangulo(int x, int y, int z) {
        if (x == y && x == z && y == z) {
            System.out.println("Triângulo com três lados iguais => Equilátero");
        } if (x == y || x != y || y == z) {
            System.out.println("Triângulo com dois lados iguais => Isósceles");
        } else {
            System.out.println("Triângulo com três lados diferentes => Escaleno");
        }
    }
}
