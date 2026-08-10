import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Filme filme = new Filme(
                "Homem Aranha - Sem casa",
                "Ação",
                200,
                35,
                2026,
                90
        );

//        System.out.println(filme.toString());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = scanner.next();
        System.out.print("Quantos ingressos você deseja?: ");
        int qtdIngressos = scanner.nextInt();
        boolean canBuy = filme.hasEnoughTickes(qtdIngressos);
        if (canBuy) {
            System.out.println("Bem-vindo, " + nome + "!\nValor total: R$ " + filme.buyTickets(qtdIngressos));
        } else {
            System.out.println("Não há ingressos suficientes.");
        }
    }
}
