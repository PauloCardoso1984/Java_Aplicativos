public class Matriz_2 {
    public static void main(String[] args) {

        // Declarado somente as linhas e não as colunas
        int [][] matriz = new int [4][];

        // Instanciando as colunas
        matriz[0] = new int[5];
        matriz[1] = new int[1];
        matriz[2] = new int[3];
        matriz[3] = new int[22];

        for (int i = 0; i < matriz.length; i++ ){
            for (int j = 0; j < matriz[i].length; j++ ){
                matriz[i][j] = i * j;
            }
        }

        for (int i = 0; i < matriz.length; i++ ) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);

            }
            System.out.println();
        }
    }
}
