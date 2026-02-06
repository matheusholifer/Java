package VariaveisETiposDeDados;

public class Pessoa {
    public static void main(String[] args) {
        int idade = 20;
        char inicial = 'M';
        String nome = "Matheus Ferreira";
        float saldo = 0.0F;
        double produto = 2500.50;
        boolean comprou = (produto - saldo) <= 0;
        var hobbie = "Musculação";

        System.out.println("\n----------------------------------------");
        System.out.printf("\nNome: %s\n", nome);
        System.out.printf("\n\tInicial: %c\n\tIdade: %d\n\tHobbie: %s\n\tSaldo: %.2f\n", inicial, idade, hobbie, saldo);

        System.out.printf("\nPreço do produto desejado: %.2f", produto);
        System.out.printf("\nStatus da compra: %s\n", (comprou == true) ? "Produto comprado com sucesso!" : "Compra negada! Saldo insuficiente.");
        System.out.println("\n----------------------------------------");
    }
}
