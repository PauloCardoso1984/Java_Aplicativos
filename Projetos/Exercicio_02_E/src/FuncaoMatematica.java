import java.util.Scanner;

/*Escreva um programa que seja capaz de receber uma string e fazer a troca de todas as letras
 *  (a) ou (A) por (x)
 *
 * a - Não deve existir lógica dentro da função main. Deve ser usado somente como ponto de entrada.
 * b - Escever uma função para ler a string
 * c - Escrever uma função para troca de letras e impressão do valor final.
 * d - String final deve estar com todas as letras minúsculas.
 * */
public class FuncaoMatematica {
    public static void main(String[] args) {

        FuncaoMatematica func = new FuncaoMatematica();
        func.trocaLetras(func.leituraString());
    }


    // METODOS

    // Escever uma função para ler a string
    String leituraString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva a palavra: ");
        return sc.nextLine();
    }

    // Escrever uma função para troca de letras e impressão do valor final.
    void trocaLetras(String str){
        // Transformar tudo em minusculo
        str = str.toLowerCase();
       // Trocar as letras "a" po "x"
       // String final deve estar com todas as letras minúsculas.
        System.out.println("Resultado : " + str.replace("a", "x"));
    }
}
