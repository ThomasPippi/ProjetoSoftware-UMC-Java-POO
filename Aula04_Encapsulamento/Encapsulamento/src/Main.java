import entidades.Conta;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(
                "Thomas Pippi",
                0,
                "0001",
                "12345-6"
        );

        conta.setSaldo(10000);

        conta.setNome("Thomas Victor Pippi");

        System.out.println(conta.toString());
    }
}
