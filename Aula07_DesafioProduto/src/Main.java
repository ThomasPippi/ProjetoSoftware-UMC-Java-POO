import entidades.GerenciarProduto;
import entidades.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        GerenciarProduto produto = new GerenciarProduto();

        while (true) {
            System.out.println("\n1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Atualizar Produto");
            System.out.println("4 - Excluir Produto");
            System.out.println("0 - Sair do Programa");
            System.out.print("\nEscolha uma opcao: ");
            String opcao = input.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Digite o nome do produto: ");
                    String nome = input.nextLine();

                    System.out.print("Digite o valor do produto: R$ ");
                    double valor = input.nextDouble();


                    System.out.print("Digite a quantidade em estoque: ");
                    int estoque = input.nextInt();
                    input.nextLine();

                    System.out.println(produto.cadastrarProduto(new Produto(nome, valor, estoque)));
                break;
                case "2":
                    if(!produto.temProdutos()){
                        System.out.println("Nenhum produto cadastrado!");
                    } else {
                        System.out.println("\nProdutos cadastrados:\n");
                        System.out.println("| ID | NOME   | PREÇO | QUANTIDADE | VALOR EM ESTOQUE R$ |");

                        for (int i = 0; i < produto.tamanhoProdutos(); i++) {
                            System.out.println("| " + i + "  | " + produto.getProduto(i));
                        }
                    }

                    break;
                case "3":
                    if(!produto.temProdutos()){
                        System.out.println("Nenhum produto cadastrado!");
                    } else {
                        System.out.print("Digite o ID do produto que deseja atualizar: ");
                        int id = input.nextInt();
                        input.nextLine();
                        if(produto.validIdProduto(id)){

                            System.out.print("Novo nome: ");
                            String novoNome = input.nextLine();

                            System.out.print("Novo preço: ");
                            double novoPreco = input.nextDouble();

                            System.out.print("Nova quantidade: ");
                            int novaQuantidade = input.nextInt();

                            System.out.println(produto.atualizarProduto(id, novoNome, novoPreco, novaQuantidade));
                        } else {
                            System.out.println("Nenhum produto cadastrado com esse ID!");
//                            return;
                        }
                    }
                    break;

                case "4":
                    if(!produto.temProdutos()){
                        System.out.println("Nenhum produto cadastrado!");
                    } else {
                        System.out.print("Digite o ID do produto a ser removido: ");
                        int idToRemove = input.nextInt();
                        input.nextLine();
                        if(produto.validIdProduto(idToRemove)){
                            System.out.println(produto.removerProduto(idToRemove));
                        } else {
                            System.out.println("Nenhum produto cadastrado com esse ID!");
//                            return;
                        }
                    }
                    break;
                case "0":
                    return;
            }
        }

    }
}
