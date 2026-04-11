package br.ifsudestemg.too.cap03.fundamentos;

public class TesteProduto {
    public static void main(String[] args) {
        // Tentativa de criar sem dados daria ERRO de compilação:
        // Produto p1 = new Produto(); // Erro!

        // Criando objetos e inicializando via CONSTRUTOR
        Produto p1 = new Produto("Notebook", 3500.00);
        Produto p2 = new Produto("Mouse", -15.00); // Preço inválido

        System.out.printf("Produto 1: %s - Preço: R$%.2f%n",
                p1.getNome(), p1.getPreco());

        System.out.printf("Produto 2: %s - Preço: R$%.2f%n",
                p2.getNome(), p2.getPreco());
    }
}