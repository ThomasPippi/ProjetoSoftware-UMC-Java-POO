import entidades.Filme;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme(
                "A Odisseia",
                "Ação/Fantasia",
                "Christopher Nolan",
                200,
                49.90,
                70
        );

        System.out.println(filme.toString());

        filme.setValor(54.70);

        System.out.println(" Valor atualizado: " + filme.getValor());
    }
}
