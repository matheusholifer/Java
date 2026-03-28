package br.ifsudestemg.too.cap02.referencia;

public class TesteTipos {
    public static void main(String[] args) {
        // Tipo primitivo
        int x = 10;
        int y = x; // Copia o valor 10
        y = 20; // Altera apenas y
        System.out.println("Primitivo: x = " + x + ", y = " + y); // x continua 10

        // Tipo por referência
        // String é um objeto (Tipo por refêrencia)
        String nome1 = new String("Java");
        String nome2 = nome1; // Copia o ENDEREÇO de memória

        // Em Java, Strings são imutáveis, mas como arrays ou objetos
        // de classes próprias (cap3), a mudança em um afetaria o outro;
        System.out.println("Referência: nome1 = " + nome1 + ", nome2 = " + nome2);
    }
}
