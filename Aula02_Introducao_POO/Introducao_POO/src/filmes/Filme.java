package filmes;

public class Filme {
    String titulo;
    String genero;
    int anoLancamento;
    int duracao;
    int qtdIngressos;
    double precoIngresso;

    @Override
    public String toString() {
        return "Filme { \n" +
                " Título: " + titulo +
                "\n Gênero: " + genero +
                "\n Lançaamento: " + anoLancamento +
                "\n Duração: " + duracao + " minutos" +
                "\n Ingressos: " + qtdIngressos +
                "\n Preço do Ingresso: R$ " + precoIngresso +
                "\n }";
    }
}
