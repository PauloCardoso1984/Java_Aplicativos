// Crie un novo arquivo com uma função main

public class Main {

    // Função main
    public static void main(String[] args) {

        // Declare uma variavél capaz de armazenar seu nome completo
        String nomeComplero = "Paulo Reginaldo Cardoso";

        // Declare uma variável de texto sem valor algum;
        String semValor = "";

        // Declare uma variável com o menor tipo de dado possível capaz de armazenar o número que você calça
        byte calcado = 42;

        // Declare uma variável capaz de armazenar o PIB do Brasil (1.869.000.000.000)
        Long numeroPib = 1869000000000L;

        // Declare uma variável capaz de armazenar o PIB do Brasil (1.869.000.000.000) com ponto flutuante
        float numeroPib1 = 1869000000000f;

        // Declare uma variável capaz de armazenar a população do Brasil (209.500.000)
        int numeroPopulacao = 209500000;

        // Imprima o valor do PIB para cada pessoa
        Long numeroPibPessoa = numeroPib / numeroPopulacao;
        System.out.println(numeroPibPessoa);

        // Imprima o valor do PIB para cada pessoa com ponto flutuante
        Float numeroPibPessoa1 = numeroPib1 / numeroPopulacao;
        System.out.println(numeroPibPessoa1);

        // Rode seu programa de maneira que não tenha erros de compilação ou execução

    }
}
