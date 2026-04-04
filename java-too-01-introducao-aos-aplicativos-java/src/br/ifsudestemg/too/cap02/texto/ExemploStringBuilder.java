package br.ifsudestemg.too.cap02.texto;

public class ExemploStringBuilder {
    public static void main(String[] args) {
        // Afirmação de positividade
        System.out.println("I'm going to become a great entrepreneur.");

        // Criando um StringBuilder com conteúdo inicial
        StringBuilder sb = new StringBuilder("Java");

        // Usando append para concatenar o texto
        sb.append(" Como Programar");
        System.out.printf("Após o Append: %s%n", sb.toString());

        // Usando inset para adicionar texto no meio
        // Insere " - Deitel" na posição 4
        sb.insert(4, " - Deitel");
        System.out.printf("Após o insert: %s%n", sb.toString());

        // Usando delete para remover parte do texto
        // Removendo do índice 4 ao 13 (" - Deitel")
        sb.delete(4, 13);
        System.out.printf("Após o delete: %s%n", sb.toString());

        // Usando reverse para inverter a String
        sb.reverse();
        System.out.printf("Após o reverse: %s%n", sb.toString());

        // Retornando ao normal para mostrar o resultado final
        sb.reverse();

        // Exibindo capacidade e comprimento
        System.out.printf("Comprimento atual: %d%n", sb.length());
        System.out.printf("Capacidade atual: %d%n", sb.capacity());
    }
}
