public class Arrays {
    public static void main(String[] args) {

        // Array vazio
        float[] notas = new float[5];

        for(int i = 0; i < notas.length; i++) {
            notas[i] = i * 2;
        }

        for(int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
        System.out.println();

        //****************************************************

        // Array com elementos
        long numeros[] = {1, 2, 3, 4, 5, 6, 7, 8};
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = i * 2;
        }

        for(int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }
}
