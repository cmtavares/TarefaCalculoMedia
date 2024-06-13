package Trabalhos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NomesOrdenados {
    public static void main(String[] args) {
        NomesOrdenados();
    }

    private static void NomesOrdenados() {
        String nomesString = "carlos,pedro,ignacio,diego,rodrigo";

        String[] nomesArray = nomesString.split(",");
        List<String> nomesLista = new ArrayList<String>();
        Collections.addAll(nomesLista, nomesArray);
        Collections.sort(nomesLista);

        for (String nome : nomesLista){
            System.out.println(nome);
        }       
    }


}
