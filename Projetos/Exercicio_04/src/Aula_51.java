public class Aula_51 {
    public static void main(String[] args) {

        /* Paulo e Cardoso são dois programadores da empresa PQP. A empresa possui um beneficio para incentivar os funcionários
        a pouparem dinheiro para a aposentadoria que funciona da seguinte maneira:
        - Se o funcionário destinar 5% do seu salário para investimento, a empresa acrescenta o mesmo valor,
        ou seja, caso o funcionário invista 100 reais, a empresa investe mais 100.
        Este fundo de investimento possui rendimento de 0,2% ao mês.
        - Paulo gostou da ideia e vai investir. No entanto, Cardoso decidiu que vai investir os mesmos 5% por por copnta própria
        já que conhece investimentos que rendem mais de 0,2% ao mês. Cardoso vai escolher investimentos que rendem 0,8% ao mês.
        Considere o salário de Paulo e Cardoso iguais e no valor de 10 nil reais e que as duas estão começando com
        o saldo 0. Em quantos meses o patrimônio de Cardoso vai superar o patrimonio de Paulo       */

        float salario = 10000f;
        int mes = 1;
        float patrimonioPaulo = 0f;  // 2%
        float patrimonioCardoso = 0f; // 8%

        do {
            patrimonioPaulo += (salario * 0.05) + (salario * 0.05) + (patrimonioPaulo * 0.02);
            patrimonioCardoso += (salario * 0.05) + (patrimonioCardoso * 0.08);

            System.out.println("Paulo:      " + patrimonioPaulo);
            System.out.println("Cardoso:    " + patrimonioCardoso);
            System.out.println();

            mes ++;

        } while (patrimonioCardoso < patrimonioPaulo);

        System.out.println("Patrimonio de Paulo vai ultrapassar no mes:  " + mes);
    }
}

