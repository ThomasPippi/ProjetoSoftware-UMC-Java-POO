package entidades;

public class Filme {
    private String titulo;
    private String genero;
    private String diretor;
    private int duracao;
    private double valor;
    private int qtdIngressos;

    public Filme(String titulo, String genero, String diretor, int duracao, double valor, int qtdIngressos) {
        this.titulo = titulo;
        this.genero = genero;
        this.diretor = diretor;
        this.duracao = duracao;
        this.valor = valor;
        this.qtdIngressos = qtdIngressos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtdIngressos() {
        return qtdIngressos;
    }

    @Override
    public String toString() {
        return  " Título: " + titulo +
                "\n Gênero: " + genero +
                "\n Diretor: " + diretor +
                "\n Duração: " + duracao + " minutos" +
                "\n Quantidade de Ingressos: " + qtdIngressos +
                "\n Preço do Ingresso: R$ " + valor;
    }
}

