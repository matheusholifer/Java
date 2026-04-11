package br.ifsudestemg.too.cap03.fundamentos;

public class Produto {
    private String nome;
    private double preco;

    // CONSTRUTOR: observe que não tem 'void' e tem o nome da classe
    public Produto(String nome, double preco) {
        this.nome = nome;

        // Validação simples: se o preço for negativo, mantemos 0.0
        if (preco > 0.0) {
            this.preco = preco;
        }
    }

    // Métodos para obter os valores (Getters)
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
}