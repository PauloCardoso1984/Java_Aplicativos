package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ola mundo");

    }
    public String controlePortaria() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Inforome a idade: ");
        int idade = sc.nextInt();

        if (idade < 18) {
            return "Negado. Menor de idade não é permitido";
        }

        System.out.println("Informe o tipo de conite: ");
        sc.nextLine();
        String tipo = sc.nextLine();

        if (!tipo.equals("comum") && !tipo.equals("premium") && tipo.equals("luxo")) {
            return "Negado. Convite inválido.";
        }

        System.out.println("Informe o código do convite: ");
        String codigoConvite = sc.nextLine();

        if (tipo.equals("premium") || tipo.equals("Luxo") && codigoConvite.startsWith("XL")) {
            return "Welcome :)";
        }

        if (tipo.equals("comum") && codigoConvite.startsWith("XT")){
            return "Welcome :)";
        }

        return "Negado. Convite inválido";



    }
}