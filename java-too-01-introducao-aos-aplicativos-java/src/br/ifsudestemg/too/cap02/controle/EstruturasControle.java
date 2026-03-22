package br.ifsudestemg.too.cap02.controle;

public class EstruturasControle {
    public static void main(String[] args) {
        double nota = 8.5;
        int frequencia = 80; // em porcentagem

        // Estrutura de Seleção
        if (nota >= 6.0 && frequencia >= 75) {
            System.out.println("Status: Aprovado!");
        } else {
            System.out.println("Status: Reprovado ou em Recuperação.");
        }

        // Estruturas de Repetição
        System.out.println("CONTTAGEM REGRESSIVA (for)");
        for (int i = 3; i > 0; i--) {
            System.out.println("Iniciando em... " + i);
        }

        System.out.println("\nVALIDANDO DADOS (while)");
        int tentativas = 1;
        while (tentativas <= 2) {
            System.out.println("Tentativa de login número: " + tentativas);
            tentativas++;
        }
    }
}
