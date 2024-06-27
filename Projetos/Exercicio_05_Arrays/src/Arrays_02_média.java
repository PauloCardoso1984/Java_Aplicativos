public class Arrays_02_média {
    public static void main(String[] args) {

        /* Escreva uma função capaz de receber um array de float e retornar a média dos valores.
        *  Se o array for vazio ou nulo, retornar 0. */

        float valores1[] = {14f, 5.3f, 63.5f, 34f, 15f};
        float valores2 [] = {};
        float valores3[] = null;

        Arrays_02_média arrays = new Arrays_02_média();
        System.out.println(arrays.media(valores1));
        System.out.println(arrays.media(valores2));
        System.out.println(arrays.media(valores3));

    }
    // MÉTODO
    private float media (float valores[]) {
        if (valores == null || valores.length == 0)
            return 0;

        float media = 0;
        for (int i = 0; i < valores.length; i ++){
            media += valores[i];
        }
        return media / valores.length;
    }
}

