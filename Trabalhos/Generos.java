package Trabalhos;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Generos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<String> nomesMasculinos = Arrays.asList("Carlos", "Pedro", "Thales", "Marcelo", "Ignacio");
        List<String> nomesFemininos = Arrays.asList("Julia", "Mariana", "Andressa", "Maria", "Roberta");

        System.out.println("Digite o nome: ");
        String nome = s.nextLine();

        if(nomesMasculinos.contains(nome)){
            System.out.println(nome + " Masculino");
        } else if(nomesFemininos.contains(nome)) {
            System.out.println(nome + " Feminino");
        } else {
            System.out.println("Nome não encontrado na lista fornecida.");
        }
    }
}
