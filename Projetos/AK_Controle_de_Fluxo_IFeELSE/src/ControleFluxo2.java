public class ControleFluxo2 {
    public static void main(String[] args) {

        ControleFluxo2 cont = new ControleFluxo2();
        cont.bonus(0);  // 0
        cont.bonus(1);  // 500,00
        cont.bonus(5);  // 1000,00
    }

    // METODO - FUNÇÃO
    void bonus(int experiencia){
        if(experiencia == 0 ) {
            System.out.println("R$ 0,00");
        } else if (experiencia == 1) {
                System.out.println("R$ 500,00");
            } else {
                System.out.println("R$ 1000,00");
        }
    }
}
