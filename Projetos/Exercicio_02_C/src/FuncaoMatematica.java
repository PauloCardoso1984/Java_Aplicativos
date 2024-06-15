import java.util.Scanner;

public class FuncaoMatematica {

    public static void main(String[] args) {
        /*Escreva uma função capaz de calcular o quadrade e cubo de um número*/

        Scanner sc = new Scanner(System.in);
        FuncaoMatematica func = new FuncaoMatematica();

        System.out.print("Qual número você vai desejar saber o valor ao quadrado e ao cubo: ");
        int numero = sc.nextInt();

        System.out.println("O resultado do numero " + numero + " será:");
        System.out.println("Quadrado    : " + func.quadrado(numero));
        System.out.println("Cubo        : " + func.cubo(numero));

        sc.close();
    }

    // METODOS / FUNÇÕES
    double quadrado (int numero){
        return Math.pow(numero, 2);
    }
    double cubo (int numero) {
        return  Math.pow(numero, 3);
    }
}
