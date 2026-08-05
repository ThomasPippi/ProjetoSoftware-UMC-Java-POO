import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Digite o nome do produto: ");
       String nomeProduto = scanner.nextLine();
       System.out.print("Digite o valor do produto: ");
       double valorProduto = scanner.nextDouble();
       System.out.print("Digite o quantidade de produtos no estoque: ");
       int quantidadeProdutos = scanner.nextInt();
       System.out.println("Produto cadastrado com sucesso!: ");
       System.out.println("Nome: " + nomeProduto);
       System.out.println("Valor: " + valorProduto);
       System.out.println("Estoque: " + quantidadeProdutos);
       System.out.println("Valor em Estoque: " + quantidadeProdutos * valorProduto);
   }
}
