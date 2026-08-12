package entidades;

public class Conta {
    private String nome;
    private double saldo;
    private String agencia;
    private String conta;

    public Conta(String nome, double saldo, String agencia, String conta) {
        this.nome = nome;
        this.saldo = saldo;
        this.agencia = agencia;
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "Conta:" +
                "\nNome: " + nome +
                "\nSaldo: R$ " + saldo +
                "\nAgencia: " + agencia +
                "\nConta: " + conta;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
