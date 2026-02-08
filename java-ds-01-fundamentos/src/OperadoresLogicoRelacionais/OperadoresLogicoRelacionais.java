package OperadoresLogicoRelacionais;

import java.util.Scanner;
import java.util.Random;

public class OperadoresLogicoRelacionais {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Gera um número entre 1 e 10 (inclusive
        int resposta = random.nextInt(10) + 1;

        int chute = 0;

        while (chute != resposta) {
            System.out.println("\n\nInsira um número inteiro entre 1 e 10: ");
            chute = scanner.nextInt();

            if (chute < 1 || chute > 10) {
                System.out.println("\n\tAVISO: Você chutou fora do intervalo de 1 a 10!");
            }

            if (chute < resposta) {
                System.out.printf("\n\tTente um número maior que %d.", chute);
            } else if (chute > resposta){
                System.out.printf("\n\tTente um número menor que %d.", chute);
            } else{
                System.out.println("\n\tVocê acertou!");
            }
        }


    }
}
