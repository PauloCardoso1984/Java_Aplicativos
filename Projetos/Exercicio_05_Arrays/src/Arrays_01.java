public class Arrays_01 {
    public static void main(String[] args) {

        /* Considere o código abaixo para ser usado no exercicio.
        * Qual o indice que possui a maior String? */

        String nomes[]= {"Victor Cardoso", "Eduarda Cardoso", "Davi Cardoso"};

        int indice = 0;
        int tamanho = nomes[0].length();
        for (int i = 0; i < nomes.length; i ++) {
            System.out.println(nomes[i]);                   // NOME
            System.out.println(nomes[i].length() + "\n");   // NUMERO

            if (nomes[i].length() > tamanho){               // VERIFICAR QUAL É A MAIOR
                indice = i;
            }
        }
        System.out.println("\nA maior String é " + (indice + 1));
    }
}
