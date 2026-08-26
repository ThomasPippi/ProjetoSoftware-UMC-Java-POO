import entidades.Filme;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Filme> filmes = new ArrayList<Filme>();

        while (true) {
            System.out.println("\n1 - Cadastrar Filme");
            System.out.println("2 - Listar Filmes");
            System.out.println("3 - Atualizar Filme");
            System.out.println("4 - Excluir Filme");
            System.out.println("0 - Sair do Programa");
            System.out.print("\nEscolha uma opcao: ");
            String opcao = input.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Digite o nome do filme: ");
                    String nome = input.nextLine();

                    System.out.print("Digite o gênero do filme: ");
                    String genero = input.nextLine();

                    System.out.print("Digite a duração do filme: ");
                    int duracao = input.nextInt();
                    input.nextLine();

                    System.out.print("Digite a classificação do filme: ");
                    String classificacao = input.nextLine();

                    filmes.add(new Filme(nome, genero, duracao, classificacao));

                    System.out.println("Filme cadastrado com sucesso!");
                break;
                case "2":
                    if(filmes.isEmpty()){
                        System.out.println("Nenhum filme cadastrado!");
                    } else {
                        System.out.println("\nFilmes cadastrados: \n");
                        System.out.println("|  ID  |  TITULO         |  GENERO  | DURACAO | CLASSIFICACAO |");
                        //for(Filme filme : filmes) {
                        //    System.out.println(filme.toString());
                        //}

                        for (int i = 0; i < filmes.size(); i++) {
                            System.out.println("|  " + i + "   |  " + filmes.get(i).toString());
                        }
                    }
                break;
                case "3":
                    System.out.print("Digite o ID do filme: ");
                    int id = input.nextInt();
                    input.nextLine();

                    if (id > filmes.size()) {
                        System.out.println("Nenhum filme cadastrado com esse ID!");
                        return;
                    } else {
                        Filme filmeToUpdate = filmes.get(id);
                        System.out.print("Qual informação você deseja alterar?");
                        System.out.println("\n1 - Título");
                        System.out.println("2 - Gênero");
                        System.out.println("3 - Duração");
                        System.out.println("4 - Classificação");
                        System.out.println("0 - Sair do Programa");
                        String editOption = input.nextLine();
                        switch (editOption) {
                            case "1":
                                System.out.print("Digite o novo nome do filme: ");
                                String newName = input.nextLine();
                                filmeToUpdate.setTitulo(newName);
                                break;
                            case "2":
                                System.out.print("Digite o novo gênero do filme: ");
                                String newGenero = input.nextLine();
                                filmeToUpdate.setGenero(newGenero);
                                break;
                            case "3":
                                System.out.print("Digite a nova duração do filme: ");
                                int newDuracao = input.nextInt();
                                input.nextLine();
                                filmeToUpdate.setDuracao(newDuracao);
                                break;
                            case "4":
                                System.out.print("Digite a nova classificação do filme: ");
                                String newClassificacao = input.nextLine();
                                filmeToUpdate.setClasificacao(newClassificacao);
                                break;
                        }
                        System.out.println("Filme alterado com sucesso!");
                        System.out.println("|  ID  |  TITULO         |  GENERO  | DURACAO | CLASSIFICACAO |");
                        System.out.println("|  " + id + "   |  " +filmeToUpdate.toString());
                    }
                break;
                case "4":
                    System.out.print("Digite o ID do filme a ser removido: ");
                    int idToRemove = input.nextInt();
                    input.nextLine();
                    filmes.remove(idToRemove);
                    System.out.println("Filme removido com sucesso!");
                break;
                case "0":
                    return;
            }
        }
    }
}
