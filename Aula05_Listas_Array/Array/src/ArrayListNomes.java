import java.util.ArrayList;

public class ArrayListNomes {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Pedro");
        nomes.add("Tiago");
        nomes.add("João");

        // Posição específica:
        nomes.add(3,"Maria");
        System.out.println(nomes.get(1));

        // Tamanho
        System.out.println(nomes.size());

        // Alterar valor
        nomes.set(1, "Marcos");

        // Encontrar a partir do valor
        System.out.println(nomes.indexOf("João"));

        // Remover
        nomes.remove(1); //Pela posição
        nomes.remove("Marcos"); //Pelo valor

        //Função Anonima
        nomes.removeIf(nome -> nome.toLowerCase().contains("a"));

        for(String nome : nomes) {
            System.out.println(nome);
        }

    }
}
