package Operadores;
import java.util.Scanner; // Importa a classe Scanner

public class Operadores {
    public static void main(String[] args) {
        // Criar a intância do scanner
        Scanner scanner = new Scanner(System.in);

        /**
         *  Operadores de atribuição
         *
         *  O operador de atribuição é utilizado para definir o valor inicial ou sobrescrever o valor de uma variável.
         *  Em seu uso, o operando à esquerda representa a variável para a qual desejamos atribuir o valor informado à direita.
         *
         */

        System.out.println("\nDigite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("\nDigite a sua idade: ");
        int idade = scanner.nextInt();

        // Limpa o buffer
        scanner.nextLine();

        System.out.printf("\nOlá " + nome + ". Você tem " + idade + " anos.\n");

        /**
         *  Operadores aritméticos
         *
         *  Os operadores aritméticos realizam as operações fundamentais da matemática entre duas variáveis e retornam o resultado.
         *  Caso seja necessário escrever operações maiores ou mais complexas, podemos combinar esses operadores e criar expressões,
         *  o que nos permite executar todo tipo de cálculo de forma programática.
         *
         */

        int soma = 2 + 2;
        float multiplicacao = 2 * 2;
        byte resto = 2 % 2;

        System.out.printf("\n\tA soma de 2 + 2 = %d\n\tA multiplicação de 2 * 2 = %.1f\n\tO resto da divisão de 2 %% 2 = %d%n\n", soma, multiplicacao, resto);

        /**
         *  Operadores de incremento e decremento
         *
         *  Os operadores de incremento e decremento também são bastante utilizados.
         *  Basicamente temos dois deles:++ e --, os quais podem ser declarados antes
         *  ou depois da variável e incrementam ou decrementam em 1 o valor da variável.
         *  
         */

        // Fecha o scanner
        scanner.close();
        }
}
