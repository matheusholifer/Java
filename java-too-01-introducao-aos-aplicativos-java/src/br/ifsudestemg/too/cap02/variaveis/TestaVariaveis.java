package br.ifsudestemg.too.cap02.variaveis;

public class TestaVariaveis {
    public static void main(String[] args) {
        // Declaração e Inicialização de Variáveis
        int idade = 20; // Tipo inteiro
        double preco = 29.99; // Tipo real
        char inicial = 'M'; // Tipo caractere
        boolean estaMatriculado = true; // Tipo booleano

        // Declaração de uma constante (final)
        final double PI = 3.14159;
        final int HORAS_NO_DIA = 24;

        // Exibindo os valores
        System.out.println("Idade: " + idade);
        System.out.println("Preço: R$" + preco);
        System.out.println("Constante PI: " + PI);

        // Se tentar fazer PI = 3.0; -> O Java dará um erro de compilação
    }
}
