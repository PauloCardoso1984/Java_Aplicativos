public class ControleFluxo3 {
    public static void main(String[] args) {

        ControleFluxo3 cont = new ControleFluxo3();
        cont.bonus(0);  // 0
        cont.bonus(1);  // 500,00
        cont.bonus(5);  // 1000,00
    }

    // METODO - FUNÇÃO

    // MANEIRA 1
    float bonus(int experiencia){
        if (experiencia == 0) {
        return 0f;
        } else if (experiencia == 1) {
           return 500f;
        } else if (experiencia == 2){
            return 1000f;
        } else {
        return 1500f;
        }
    }

    // MANEIRA 2
    float bonus2(int experiencia) {
        float bonus2 = 1500f;

        if (experiencia == 0) {
            bonus2 = 0f;
        } else if (experiencia == 1) {
            bonus2 = 500f;
        } else if (experiencia == 2) {
            bonus2 = 1000f;
        }
        return bonus2;
    }

    // MANEIRA 3
    float bonus3(int experiencia) {
        float bonus3 = 1500f;

        if (experiencia == 0) {
            bonus3 = 0f;
        } if (experiencia == 1) {
            bonus3 = 500f;
        } if (experiencia == 2) {
            bonus3 = 1000f;
        }
        return bonus3;
    }
}