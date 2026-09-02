package entidades;

import java.util.ArrayList;

public class GerenciarProduto {
    ArrayList<Produto> produtos = new ArrayList<>();

    public String cadastrarProduto(Produto produto) {
        produtos.add(produto);
        return "Produto cadastrado com sucesso!";
    };

    public Produto getProduto(int indice) {
        return produtos.get(indice);
    }

    public ArrayList<Produto> listarProdutos() {
        return produtos;
    }

    public String atualizarProduto(int id, String novoNome, double novoPreco, int novaQuantidade) {
        Produto produto = produtos.get(id);

        produto.setNome(novoNome);
        produto.setPreco(novoPreco);
        produto.setQuantidade(novaQuantidade);

        return "Produto atualizado com sucesso!";
    }

    public String removerProduto(int id) {
        produtos.remove(id);
        return "Produto removido com sucesso!";
    }

    public boolean temProdutos(){
        return !produtos.isEmpty();
    }

    public int tamanhoProdutos(){
        return produtos.size();
    }

    public boolean validIdProduto(int id){
        return produtos.size() > id;
    }
}
