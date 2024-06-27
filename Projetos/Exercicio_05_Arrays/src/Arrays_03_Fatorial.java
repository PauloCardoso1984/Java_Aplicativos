public class Arrays_03_Fatorial {

    long[] fatorial = new long[10];
    public static void main(String[] args) {
        /* Considere a função abaixo responsável por calcular o fatorial de um numero: */

        Arrays_03_Fatorial arrays = new Arrays_03_Fatorial();
        System.out.println("Cálcular fatorial de 3 => " +  arrays.fatorial(3));
        System.out.println("Cálcular fatorial de 3 => " + arrays.fatorial(3));
        System.out.println("Cálcular fatorial de 5 => " + arrays.fatorial(5));
        System.out.println("Cálcular fatorial de 8 => " + arrays.fatorial(8));
        System.out.println("Cálcular fatorial de 9 => " + arrays.fatorial(9));
        System.out.println("Cálcular fatorial de 11 => " + arrays.fatorial(11));
    }

    // MÉTODO
    private long fatorial(int n){
        if (n == 0 || n == 1 || n > 10)
            return 1;

        if (fatorial[n] != 0){
            System.out.print("Calculo evitado.      ");
            return fatorial[n];
        }

        long resultado = 1;
        int numeroFatorial = n;
        while ( n > 1) {
            resultado *= n;
            n --;
        }

        fatorial[numeroFatorial] = resultado;
        System.out.print("Calculo realizado.    ");
        return resultado;
    }
}
