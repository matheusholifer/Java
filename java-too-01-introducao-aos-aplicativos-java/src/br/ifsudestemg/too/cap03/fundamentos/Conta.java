package br.ifsudestemg.too.cap03.fundamentos;

public class Conta {
    private String nome; // Variável de instância

    // O método deve atribuir o valor do parâmetro à variável de instância
    public void setNome(String nome) {
        this.nome = nome; // 'this.nome' é a variável de instância; 'nome' é o parâmetro
    }

    public String getNome() {
        return nome; // Retorna o valor atual guardado no objeto
    }
}