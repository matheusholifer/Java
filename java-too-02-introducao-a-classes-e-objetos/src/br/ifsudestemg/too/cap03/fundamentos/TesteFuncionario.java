package br.ifsudestemg.too.cap03.fundamentos;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();

        func.setNome("Matheus");

        // Tentando definir um salário inválido
        func.setSalario(-500.00);
        System.out.printf("Salário de %s após erro: R$%.2f%n",
                func.getNome(), func.getSalario());

        // Definindo um salário válido
        func.setSalario(3500.00);
        System.out.printf("Salário de %s corrigido: R$%.2f%n",
                func.getNome(), func.getSalario());
    }
}