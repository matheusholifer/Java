package br.ifsudestemg.too.cap02.operadores;

public class CalculadoraOperadores {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // Aritméticos
        int soma = a + b;
        int resto = a % b; // Resultado será 1 (10 dividido por 3 sobra 1)

        // Relacionais e Lógicos
        boolean resultadoLogico = (a > b) && (b > 0); // true E true = true

        // Atribuição Composta
        int c = 5;
        c *= 2; // c agora vale 10

        // Operador condicional (Ternário)
        // Se 'a' for maior que 'b', retorna "Maior", senão retorna "Menor"
        String status = (a > b) ? "Maior":"Menor";

        // Exibindo os resultados
        System.out.println("Soma: " + soma);
        System.out.println("Resto: " + resto);
        System.out.println("Lógico: " + resultadoLogico);
        System.out.println("Status: " + status);
    }
}
