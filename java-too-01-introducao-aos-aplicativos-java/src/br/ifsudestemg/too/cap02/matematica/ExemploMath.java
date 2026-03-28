package br.ifsudestemg.too.cap02.matematica;

public class ExemploMath {
    public static void main(String[] args) {
        double raio = 5.0;

        // Cálculando a área de um círculo: PI * r²
        double area = Math.PI * Math.pow(raio, 2);

        System.out.printf("Área do círculo: %.2f%n", area);

        // Outros exemplos úteis
        System.out.println("Raiz quadrada de 25: " + Math.sqrt(25));
        System.out.println("Maior entre 10 e 20: " + Math.max(10, 20));
        System.out.println("Arredondar 7.1 para cima: " + Math.ceil(7.1));
    }
}
