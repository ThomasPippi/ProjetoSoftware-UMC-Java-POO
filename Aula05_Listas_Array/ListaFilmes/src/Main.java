import entidades.Filme;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Filme> filmes = new ArrayList<Filme>();
        Scanner input = new Scanner(System.in);
        while (true){

            System.out.println("=== LISTA DE OPÇÕES ===");
            System.out.println("1 - Adicionar Filme");
            System.out.println("2 - Listar Filmes");
            System.out.println("0 - Sair do programa");

            int opcao = input.nextInt();
            switch(opcao){
                case 1:
                    System.out.print("Digite o nome do filme: ");
                    String nome = input.nextLine();

                    System.out.print("Digite o gênero do filme: ");
                    String genero = input.nextLine();

                    System.out.print("Digite o diretor do filme: ");
                    String diretor = input.nextLine();

                    System.out.print("Digite a duração do filme: ");
                    int duracao = input.nextInt();
                    input.nextLine();

                    System.out.print("Digite o valor do filme: ");
                    double valor = input.nextDouble();

                    System.out.print("Digite quantos ingressos disponíveis: ");
                    int qtde = input.nextInt();

                    filmes.add(new Filme(nome, genero, diretor, duracao, valor, qtde));
                break;
                case 2:
                    System.out.println("Filmes: " + filmes);
                    break;
                case 0:
                    return;
            }

        }
    }
}
