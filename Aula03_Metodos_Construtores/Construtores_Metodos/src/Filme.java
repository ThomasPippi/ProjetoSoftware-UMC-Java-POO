public class Filme {
    String titulo;
    String genero;
    int duracao;
    double valor;
    int anoLancamento;
    int qtdeIngressos;

    public Filme(String titulo, String genero, int duracao, double valor, int anoLancamento, int qtdeIngressos) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
        this.valor = valor;
        this.anoLancamento = anoLancamento;
        this.qtdeIngressos = qtdeIngressos;
    }

    @Override
    public String toString() {
        return "Filme { \n" +
                " Título: " + titulo +
                "\n Gênero: " + genero +
                "\n Lançamento: " + anoLancamento +
                "\n Duração: " + duracao + " minutos" +
                "\n Quantidade de Ingressos: " + qtdeIngressos +
                "\n Preço do Ingresso: R$ " + valor +
                "\n }";

    }

    public boolean hasEnoughTickes(int qtde){
        return qtdeIngressos >= qtde && qtde > 0;
    }

    public double buyTickets(int qtde) {
        this.qtdeIngressos -= qtde;
        return this.valor * qtde;
    }

}
