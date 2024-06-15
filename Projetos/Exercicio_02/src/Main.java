import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* escreva um programa que seja capaz de receber a quantidade de anos e transformar
        em meses dias, horas minutos e segundos como saida */

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos anos deseja de verificar : ");
        int anos = sc.nextInt();

        int meses = anos * 12;
        int dias = anos * 365;
        int horas = dias * 24;
        int minutos = horas * 60;
        long segundos = (long) minutos * 60;

        System.out.println("O ano digitado " + anos + " é igual a:");
        System.out.println("Meses   : " + meses);
        System.out.println("Dias    : " + dias);
        System.out.println("Horas   : " + horas);
        System.out.println("Minutos : " + minutos);
        System.out.println("Segundos : " + segundos);
    }
}
