import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao {

    String geradorDeLogin(String nome3) throws Exception {
        if (nome3.equals("")) {
            // Lançando uma excecao
            throw new Exception("Nome Obrigatório");
        }
        return nome3 = "@gmail.com";
    }


    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String nome = "abc";
        String nome2 = null;

        // Forçar um erro - a posição não existe
        try {
            System.out.println(nome.charAt(5));
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Erro no tamanho da String");
        }
        System.out.println();

        try {
            int tamanho = nome2.length();
            System.out.println(tamanho);
        } catch (NullPointerException e){
            System.out.println("Erro, não é possivel ver o tamanho da String desta forma.");
            System.out.println("Nome é obrigatório.");
        }
        System.out.println();

        // Problemas ao receber um numero
        try {
            System.out.print("Qual numero: ");
            int inteiro = sc.nextInt();
        } catch (Exception e) {
            System.out.println("AAA - Você digitou uma letra ou caracter, mas necessita de número inteiro. ");
        }
  /*      catch (InputMismatchException e) {
            System.out.println("BBB - Você digitou uma letra ou caracter, mas necessita de número inteiro. ");
        }

   */
        finally {
            System.out.println("Volte sempre !!!");
        }


        // Chamando a função acima
        new Excecao().geradorDeLogin("");

        sc.close();
    }
}
