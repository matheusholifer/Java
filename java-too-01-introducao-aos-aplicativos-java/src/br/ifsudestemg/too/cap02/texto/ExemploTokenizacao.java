package br.ifsudestemg.too.cap02.texto;

import java.util.Scanner;

public class ExemploTokenizacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase e pressione enter: ");
        String frase = scanner.nextLine();

        // O método splitutiliza o delimitador (neste caso o espaço " ")
        // Para dividir a frase em um array de tokens (palavras).
        String[] tokens = frase.split(" ");

        System.out.printf("Número de elementos: %d%nOs tokens são: %n", tokens.length);

        // Exibe cada token individualmente
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
