package filmes;

public class Principal {
    public static void main(String[] args) {
        Filme homemAranha = new Filme();
        homemAranha.titulo = "Homem Aranha - Não tenho mais casa";
        homemAranha.genero = "Ação";
        homemAranha.anoLancamento = 2021;
        homemAranha.duracao = 100;
        homemAranha.qtdIngressos = 3;
        homemAranha.precoIngresso = 34.90;

        Filme oMaskara = new Filme();
        oMaskara.titulo = "O Máskara";
        oMaskara.genero = "Comédia";
        oMaskara.anoLancamento = 1994;
        oMaskara.duracao = 95;
        oMaskara.qtdIngressos = 2;
        oMaskara.precoIngresso = 28.90;

        System.out.println(oMaskara.toString());
        System.out.println(homemAranha.toString());
    }
}
