public class Main {

    public static void main(String[] args) {

        // String
        String str = "100";
        System.out.println("String : " + str + "\n");

        // Transformando String em Byte / Short / Integer / Float / Double
        System.out.println("Transformado em Byte    : " + Byte.valueOf(str));
        System.out.println("Transformado em Short   : " + Short.valueOf(str));
        System.out.println("Transformado em Integer : " + Integer.valueOf(str));
        System.out.println("Transformado em Float   : " + Float.valueOf(str));
        System.out.println("Transformado em Double  : " + Double.valueOf(str));
        System.out.println();

        // Tranformando um numero
        Byte b = 10;

        // Transformando em String / int / double / float
        System.out.println("Trasnformando em short  : " + b.shortValue());
        System.out.println("Trasnformando em int    : " + b.intValue());
        System.out.println("Trasnformando em float  : " + b.floatValue());
        System.out.println("Trasnformando em double : " + b.doubleValue());
        System.out.println("Trasnformando em String : " + b.toString());
    }
}
