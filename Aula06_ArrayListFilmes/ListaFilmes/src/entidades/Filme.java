package entidades;

public class Filme {
    private String titulo;
    private String genero;
    private int duracao;
    private String clasificacao;

    // Construtor
    public Filme(String titulo, String genero, int duracao, String clasificacao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
        this.clasificacao = clasificacao;
    }

    // --- Getters e Setters ---

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

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getClasificacao() {
        return clasificacao;
    }

    public void setClasificacao(String clasificacao) {
        this.clasificacao = clasificacao;
    }

    @Override
    public String toString() {
        return  titulo + "   |  " +  genero + "    |   " + duracao + "   |      " + clasificacao + "       |";
    }
}
