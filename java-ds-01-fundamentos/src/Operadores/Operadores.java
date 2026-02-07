package Operadores;

public class Operadores {
    public static void main(String[] args) {
        // Operadores de atribuição
        String nome = "Matheus Henrique de Oliveira Ferreira";
        int idade = 20;

        System.out.printf("\nOlá " + nome + ". Você tem " + idade + " anos.\n");

        // Operadores aritmeticos
        int soma = 2 + 2;
        int subtracao = 2 - 2;
        float multiplicacao = 2.0f * 2;
        float divisao = 2 / 2.0f;
        byte resto = 2 % 2;

        System.out.printf("\n\tA soma de 2 + 2 = %d\n\tA subtração de 2 - 2 = %d\n\tA multiplicação de 2 * 2 = %.1f\n\tA divisão de 2 / 2 = %.1f\n\tO resto da divisão de 2 %% 2 = %d%n\n", soma, subtracao, multiplicacao, divisao, resto);

        // Operadores de incremento e decremento
        int x = 5;
        System.out.printf("x = %d", x);
        int y = x++; // y recebe 5, depois x vira 6
        System.out.printf("\ny = %d", y);

        x = 5;
        y = ++x; // x vira 6, depois y recebe 6
        System.out.printf("\ny = %d", y);
    }
}
