public class Main {
    public static void main(String[] args) {

        String str = "Programação Java!";

        // Verificando o tamanho da String
        System.out.println("Tamanho da String   : " + str.length());

        // Verificando um caracter dentro da String
        System.out.println("Verificando a posição de uma String : " + str.charAt(8));

        // Comparando as Strings
        System.out.println("Comparando as String : " + str.equals("Java Programador"));

        // Verificando se minha String começa com um determinado caracter
        System.out.println("Procurando uma String : " + str.startsWith("P"));

        // Verificadno se termina com uma determinada letra
        System.out.println("Procurando pela final da String : " + str.endsWith("!"));

        // Recortando String
        System.out.println("Recortar String : " + str.substring(5));
        System.out.println("Recortar parte da String : " + str.substring(5, 9));

        // Substituir String
        System.out.println(str.replace("Java", "Essencial Java"));
        System.out.println(str.replace("a", "b"));

        // Converter tudo para minusculo
        System.out.println(str.toLowerCase());

        // Converter tudo para mauiscula
        System.out.println(str.toUpperCase());

        // Eliminar espaços em brancos - muito usado para cadastro e emails, mas tem que usar o trim.
        String str2 = "                pauloreginaldocardoso@gmail.com           ".trim();
        System.out.println(str2.trim());

        System.out.println(str2.equals("pauloreginaldocardoso@gmail.com"));}
}
