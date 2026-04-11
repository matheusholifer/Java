package br.ifsudestemg.too.cap03.fundamentos;

public class Funcionario {
    private String nome;
    private double salario; // Variável privada (encapsulada)

    // Método SET: Inclui lógica de validação
    public void setSalario(double salario) {
        if (salario > 0.0) {
            this.salario = salario;
        } else {
            System.out.println("Erro: Salário deve ser maior que zero.");
        }
    }

    // Método GET: Apenas retorna o valor
    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}