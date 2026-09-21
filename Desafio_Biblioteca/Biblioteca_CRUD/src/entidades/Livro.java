package entidades;

public class Livro extends ItemBiblioteca implements Emprestavel{
    private String ISBN;
    private boolean disponivel;

    public Livro(String titulo, String autor, int anoPublicacao, String ISBN, boolean disponivel) {
        super(titulo, autor, anoPublicacao);
        this.ISBN = ISBN;
        this.disponivel = disponivel;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String exibirInformacoes() {
        return "\nLivro:" + super.exibirInformacoes() +  "\nISBN: " + ISBN + "\nDisponível: " + disponivel;
    }

    @Override
    public void emprestar() {
        if (this.disponivel) {
            System.out.println("Item emprestado com sucesso");
        } else {
            System.out.println("Item indisponível para empréstimo");
        }
    }

    @Override
    public void devolver() {
        if(!this.disponivel) {
            System.out.println("Item devolvido com sucesso");
        } else {
            System.out.println("O item já está disponível");
        }
    }

    @Override
    public boolean estaDisponivel() {
        return this.disponivel;
    }


}
