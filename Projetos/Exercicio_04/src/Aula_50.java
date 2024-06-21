import java.util.Scanner;

public class Aula_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aula_50 exa = new Aula_50();

        /* Considere uma caixa d'água de 2000 litros. Para encher a caixa d'agua com balões de água
        * de  7 litros. Quantos balões cabem na caixa d'agua sem que o volume seja excexido */
        exa.exA();
        System.out.println();


        /* Imprima os numeros de 1 a 50 em ordem crescente de acordo com a regra abaixo:
        * Quando um número for divisivel por 3, imprimir Buzz;
        * Quando um número for divisivel por 5, imprimir Fizz;
        * Quando um número for divisível por 3 e 5 imprimir FizzBuzz;
        * */
        exa.exB();
        System.out.println(); System.out.println();


        /* Escreva um programa capaz de receber um texto e imprimi-lo invertido. */
        System.out.print("Qual a palavra/texto: ");
        exa.exC(sc.nextLine());
        System.out.println();


        /* Escreva uma função que recebe uma string, verifica se existe a mesma quantidade de caracteres 'x' e 'o' e retorne
        * true ou flae. Caso não exista retornar false. Não diferencie maiusculas e minusculas*/
        System.out.println();
        System.out.println(exa.exD("xXooox"));
        System.out.println(exa.exD("xxxxo"));

    }

    void exA(){
        int caixa = 2000;
        int volumeBalao = 7;

        int preencher = 0;
        int numBaloes = 0;

        while((preencher + volumeBalao) < caixa){
            preencher += volumeBalao;
            numBaloes ++;
        }
        System.out.println("Cabem " + numBaloes + " balões");
    }

    void exB(){
        int contador = 1;
        while(contador <= 50){
            if (contador %  15 == 0)  {
                System.out.print(" FizzBuzz ");
            }
            else if (contador % 3 == 0 ){
                System.out.print(" Buzz ");
            }
            else if (contador % 5 == 0){
                System.out.print(" Fizz ");
            } else {
                System.out.print(contador + " ");
            }
            contador ++;
        }
    }

    void exC(String texto){
        int tamanho = texto.length();
        while(tamanho > 0){
            System.out.print(texto.charAt(tamanho - 1));
            tamanho--;
        }
    }

    boolean exD(String str){
        String texto2 = str.toLowerCase();
        int i = 0;
        int contaX = 0;
        int contaO = 0;

        while(i < str.length()){
            if(texto2.charAt(i) == 'x') {
                contaX++;
            }
            else if(texto2.charAt(i) == 'o') {
                contaO++;
            }
            i++;
        }
        return (contaX == contaO) && (contaO != 0);
    }
}
