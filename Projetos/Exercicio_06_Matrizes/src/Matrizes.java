public class Matrizes {
    public static void main(String[] args) {
        /* Considere a seguinte matriz quadrada que representa as notas de 4 alunos em 4 matérias
        float matriz[][]= {{8.8f, 9, 7, 4},{8.8f, 9.4f, 8, 8.9f}, {4.7f, 5, 6.8f, 9.9f}};
        Qual a média da sala?
        */

        float matriz[][]= {{8.8f, 9, 7, 4},{8.8f, 9.4f, 8, 8.9f}, {4.7f, 5, 6.8f, 9.9f}};

        float soma = 0;
        for (int i = 0; i < matriz.length; i ++){
            for (int j = 0; j < matriz[i].length; j ++){
                soma += matriz[i][j];

            }
        }
        System.out.println("Média da sala é: " + soma / (matriz.length * matriz[0].length));
    }
}
