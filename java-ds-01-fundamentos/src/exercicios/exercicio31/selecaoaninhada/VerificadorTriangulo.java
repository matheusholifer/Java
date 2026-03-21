package exercicio31.selecaoaninhada;

/*
*   31) Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam
*   ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma
*   dos outros 2 lados.
**/

import java.util.Scanner; // Importa a  classe Scanner

public class VerificadorTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria o objeto Scanner

        /*
        * System.out.print: Imprime sem quebra de linha
        * System.out.printf: Imprime com formatação
        * System.out.println: Imprime com quebra de linha
        * */
        System.out.println("- Programa que recebe lados (A, B e C) e determina se esses lados formam um triângulo.");

        System.out.printf("\nInsira o valor de 'A': ");
        float a = sc.nextFloat(); // Realiza leitura de um tipo float

        System.out.printf("\nInsira o valor de 'B': ");
        float b = sc.nextFloat();

        System.out.printf("\nInsira o valor de 'C': ");
        float c = sc.nextFloat();

        // Verificando se os lados inseridos formam um triângulo
        if(a < b + c && b < c + a && c < a + b) {
            System.out.print("\nOs lados inseridos formam um triângulo!");
        } else {
            System.out.print("\nOs lados inseridos não formam um triângulo.");
        }

        // Fechar o Scanner
        sc.close();
    }
}
