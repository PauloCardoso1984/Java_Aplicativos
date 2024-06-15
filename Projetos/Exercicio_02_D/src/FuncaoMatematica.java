import java.util.Scanner;

public class FuncaoMatematica {
    public static void main(String[] args) {
        /*Escreva uma função capaz de receber milhas e converte em KM (i milha = 1,6km */

        Scanner sc = new Scanner(System.in);
        FuncaoMatematica func = new FuncaoMatematica();

        System.out.print("Quantas milhas quer transformar em KM : ");
        double milhas = sc.nextDouble();

        System.out.println("A distância em Km é : " + func.km(milhas));

        sc.close();
    }
    
    // METODO / FUNÇÃO
    double km (double milhas){
        return milhas * 1.6;
    }
}
