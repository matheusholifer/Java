package br.ifsudestemg.too.cap02.texto;

import java.util.Scanner;

public class ExemploCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um caractere: ");
        String entrada = scanner.next();

        // Obtém o primeiro caractere
        char c = entrada.charAt(0);

        // Demonstrando métodos da classe caracter
        System.out.printf("É digito: %b%n", Character.isDigit(c));
        System.out.printf("É letra: %b%n", Character.isLetter(c));
        System.out.printf("É maiúscula: %b%n", Character.isUpperCase(c));
        System.out.printf("É minúscula: %b%n", Character.isLowerCase(c));

        if (Character.isLetter(c)) {
            System.out.printf("Versão oposta: %c%n",
                    Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c));
        }
    }
}
