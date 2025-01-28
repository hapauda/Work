import java.util.ArrayList;
import nomes.we; // Certifique-se de que a classe nomes.we exista

public class de {
    public static void main(String[] args) {
        // Criação da lista para armazenar Strings
        ArrayList<String> animal = new ArrayList<>();

        // Adicionando elementos à lista
        animal.add("cat");
        
        // Supondo que nomes.we tem um método que retorna um nome
        nomes.we no = new nomes.we();
        animal.add(no.getNome()); // Chamar um método que retorna uma String

        animal.add("elefante");
        animal.add("fish");
        animal.add("Man");

        // Iterando sobre os elementos da lista
        for (String i : animal) {
            System.out.println(i);

            switch (i) {
                case "cat":
                    System.out.println("Its a cat");
                    break;
                default:
                    System.out.println("I have animals");
                    break;
            }
        }
    }
}