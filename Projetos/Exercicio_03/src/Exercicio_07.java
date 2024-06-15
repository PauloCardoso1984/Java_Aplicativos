public class Exercicio_07 {
    public static void main(String[] args) {

        /* Considere o código abaixo. Qual a saía do programa caso digitado o valor 4? */

        Exercicio_07 ex = new Exercicio_07();
        ex.qualSaida(4);

    }

    private void qualSaida(int numero){
        if (numero >= 0)
            if (numero == 0)
                System.out.println("Primeira String");
        else
                System.out.println("Segunda String");
        System.out.println("Terceira String");
    }
}
