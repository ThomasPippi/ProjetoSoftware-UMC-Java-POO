import entidades.*;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Buracos Negros", "Stephen Hawking", 2016, "978-85-510-0098-4", true);
        Livro livro2 = new Livro("Uma Breve História do Tempo", "Stephen Hawking", 1988, "978-8580576467", true);
        Revista revista = new Revista("ISS - Maravilha da Humanidade", "Escriba de Cristo", 2023, 14, true);
        Ebook ebook = new Ebook("Use a Cabeça Java", " Kathy Sierra", 2024, 56.6);

        System.out.println(livro1.exibirInformacoes());
        System.out.println(livro2.exibirInformacoes());
        System.out.println(revista.exibirInformacoes());
        System.out.println(ebook.exibirInformacoes());

        
    }
}
