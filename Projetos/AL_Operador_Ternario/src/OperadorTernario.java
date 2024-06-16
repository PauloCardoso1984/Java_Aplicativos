public class OperadorTernario {

    // Operador Ternário

    public static void main(String[] args) {

    }


    // METODO TRADICIONAL
    String maioIdade1(int idade){
        if (idade > 17){
            return "Maior de idade..";
        } else {
            return "Menor de idade..";
        }
    }


    // METODO COM OPERADOR TERNARIO 1
    // expressão ? true 1 instrução : 1 false
    String maioIdade2(int idade){
        return (idade > 17) ? "Maior de idade.." :  "Menor de idade..";
    }

    
    // METODO COM OPERADOR TERNARIO 2
    // expressão ? true 1 instrução : 1 false
    String maioIdade3(int idade){
        String str = (idade > 17) ? "Maior de idade.." :  "Menor de idade..";
        return str;
    }
}
