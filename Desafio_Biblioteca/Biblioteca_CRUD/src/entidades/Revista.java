package entidades;

public class Revista extends ItemBiblioteca implements Emprestavel {
    private int numeroEdicao;
    private boolean disponivel = true;

    public Revista(String titulo, String autor, int anoPublicacao, int numeroEdicao, boolean disponivel) {
        super(titulo, autor, anoPublicacao);
        this.numeroEdicao = numeroEdicao;
        this.disponivel = disponivel;
    }

    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public void setNumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public void emprestar() {

    }

    @Override
    public void devolver() {

    }

    @Override
    public boolean estaDisponivel() {
        return false;
    }

    @Override
    public String exibirInformacoes() {
        return "\nRevista:" + super.exibirInformacoes() +  "\nNúmero da Edição: " + numeroEdicao + "\nDisponível: " + disponivel;
    }
}
