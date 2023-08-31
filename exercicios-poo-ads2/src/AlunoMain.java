import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlunoMain {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno();
        Map<String, List<Integer>> disciplinas = new HashMap<>();
        List<Integer> notasMatematica = new ArrayList<>();
        List<Integer> notasPortugues = new ArrayList<>();

        aluno01.codigo = 123;
        aluno01.matricula = "321";
        aluno01.nome = "Juan";
        aluno01.dataNascimento = LocalDate.of(2000, 8, 2);
        aluno01.endereco = "Rua etc";
        aluno01.telefone = "1111";
        aluno01.idade = 23;
        aluno01.alturaCm = 180;
        aluno01.sexo = 'M';
        aluno01.peso = 72.0;
        aluno01.cpf = "9999";


        notasMatematica.add(10);
        notasMatematica.add(9);
        notasPortugues.add(7);
        notasPortugues.add(6);
        disciplinas.put("Matemática", notasMatematica);
        disciplinas.put("Português", notasPortugues);
        aluno01.disciplinasNotas = disciplinas;

        aluno01.imprimirDadosAluno();
        aluno01.calcularMediaPorMaterial();
        aluno01.calcularMediaGeral();

    }
}
