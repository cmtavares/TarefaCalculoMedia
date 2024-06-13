package ListaDeAlunos;
import java.util.ArrayList;
import java.util.List;

public class ArrayListAluno {
    public static void main(String[] args) {
        exemploArrayAluno();
        exemploArrayAluno2();
    }

    private static void exemploArrayAluno() {
        List<Aluno> lista = new ArrayList<Aluno>();
        
        Aluno a = new Aluno("João da Silva", "Administração", 8);
        Aluno b = new Aluno("Adriana Gomes", "Marketing", 6.5);
        Aluno c = new Aluno("Fernando Rodrigues", "Programação", 9);

        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println(lista);
    }

    private static void exemploArrayAluno2(){
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno(null, null, 0, null);
        Aluno b = new Aluno(null, null, 0, null);
        Aluno c = new Aluno(null, null, 0, null);

        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println(lista);
    }
}
