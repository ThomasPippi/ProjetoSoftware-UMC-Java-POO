package entidades;

public class Ebook extends ItemBiblioteca{
    private double tamanhoArquivoMb;

    public Ebook(String titulo, String autor, int anoPublicacao, double tamanhoArquivoMb) {
        super(titulo, autor, anoPublicacao);
        this.tamanhoArquivoMb = tamanhoArquivoMb;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivoMb;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivoMb = tamanhoArquivo;
    }
    @Override
    public String exibirInformacoes() {
        return "\nEbook:" + super.exibirInformacoes() +  "\nTamanho do Arquivo: " + tamanhoArquivoMb + " Mb";
    }
}
