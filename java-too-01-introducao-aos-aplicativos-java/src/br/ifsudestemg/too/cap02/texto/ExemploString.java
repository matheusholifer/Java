package br.ifsudestemg.too.cap02.texto;

public class ExemploString {
    public static void main(String[] args) {
        String curso = "Bacharelado em Administração";
        String campus = "Barbacena";

        // Concatenação
        String infoCompleta = curso + " - " + campus;
        System.out.println("Info: " + infoCompleta);

        // Verificando o tamanho
        System.out.println("Tamanho do texto: " + curso.length());

        // Pegando um caractere específico
        char primeiraLetra = campus.charAt(0);
        System.out.println("A primeira letra de '" + campus + "' é: " + primeiraLetra);

        // Comparação
        // Nunca use '==' para comparar strings. Use .equals()
        String s1 = new String("Java");
        String s2 = "Java";

        if (s1.equals(s2)){
            System.out.println("As strings tem o mesmo conteúdo!");
        }
    }
}
