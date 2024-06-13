package Trabalhos;
public class CalculoMedia{
    public static void main(String[] args){
        calculomedia();
    }

    public static void calculomedia(){
        double nota1 = 8.5;
        double nota2 = 6.0;
        double nota3 = 7.5;
        double nota4 = 9.0;

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println(media);
    }
}