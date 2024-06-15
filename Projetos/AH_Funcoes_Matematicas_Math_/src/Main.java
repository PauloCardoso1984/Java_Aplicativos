public class Main {
    public static void main(String[] args) {

        // Verificar qual número é o maior
        System.out.println("Maior número entre 10 e 19 : " + Math.max(10, 19));

        // Verificar qual é o menor
        System.out.println("Menor número entre 99 e 88 : " + Math.min(99,88));

        // Raiz quadrada
        System.out.println("Raiz quadrada de 81 : " + Math.sqrt(81.0));

        // Logaritmo na base 10
        System.out.println("Logaritimo de 100 na base 10 : " + Math.log10(100));

        // Potência
        System.out.println("Potência de a elevado por b : " + Math.pow(5,3));

        // Valor de PI
        System.out.println("Número PI : " + Math.PI);

        // Constante de Euler
        System.out.println("Constante de Euler : " + Math.E);

        // Arrendondar um numero
        System.out.println("Arredondar um núemro : " + Math.round(544666.55878889));

        // Gerando número aleatório
        System.out.println("Gerando número aleatório : " + Math.random());

        // USANDO FUNÇÕES DE ESCOLHER UM NUEMRO ALEATÓRIO E CON ARREDONDAMENTO
        System.out.println("Número : " + Math.round(Math.random()*100));

    }
}
