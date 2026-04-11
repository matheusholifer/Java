package br.ifsudestemg.too.cap03.fundamentos;

import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um objeto da classe Conta
        Conta minhaConta = new Conta();

        // Exibindo o valor inicial (deve ser null)
        System.out.printf("Nome inicial da conta: %s%n", minhaConta.getNome());

        System.out.println("Digite o nome da conta:");
        String nome = scanner.nextLine();

        // Chamando o método setNome() para modificar a váriavel de instância
        minhaConta.setNome(nome);

        // Chamando o método getNome para exibir o novo nome
        System.out.printf("O nome da conta agora é: %s%n", minhaConta.getNome());
    }
}
