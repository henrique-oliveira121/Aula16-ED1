package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite uma palavra, número, data ou frase para verificar (ou 'sair' para encerrar):");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            if (VerificadorPalindromo.ehPalindromo(entrada)) {
                System.out.println("Resultado: É um palíndromo!\n");
            } else {
                System.out.println("Resultado: NÃO é um palíndromo.\n");
            }
        }

        scanner.close();
    }
}