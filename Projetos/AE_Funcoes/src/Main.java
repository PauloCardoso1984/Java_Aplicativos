/* Tipos de retornos de Funções
- void = sem retorno
- Double, Float, Long, Int, Short, Byte, Boolean, String e Char
- Instâncias de classes (criar uma classe)
*/

import java.util.Scanner;
public class Main {

    // MÉTODOS

    void hello_0(){
        System.out.println("Olá mundo");
    }
    void hello_1(){
        System.out.println("Olá mundo");
    }

    String hello_2(){
        return "Olá mundo...";
    }

    int soma(int n1, int n2){
        hello_0();
        return n1 + n2;
    }

    public static void main(String[] args) {

        // Chamando a função
        new Main().hello_1();
        System.out.println(new Main().hello_2());

        // Outra forma de usar o hello_2
        String abc = new Main().hello_2();
        System.out.println(abc + "\n");


        // ==============================
        // Chamando a função soma
        int n1 = 8, n2 = 9;
        System.out.println(new Main().soma(n1, n2) + "\n");

        int soma = new Main().soma(88, 99);
        System.out.println(soma);



    }
}
