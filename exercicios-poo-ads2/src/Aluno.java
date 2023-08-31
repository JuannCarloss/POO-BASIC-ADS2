import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Aluno {
    Integer codigo;
    String matricula;
    String nome;
    LocalDate dataNascimento;
    String telefone;
    String endereco;
    Character sexo;
    Byte idade;
    Integer alturaCm;
    Double peso;
    String cpf;
    Map<String, List<Integer>> disciplinasNotas;

    public void imprimirDadosAluno() {
        System.out.println("Código: " + codigo + ", Nome: " + nome + ", Data Nascimento: " + dataNascimento);
    }

    public void calcularMediaPorMaterial() {
        for (Map.Entry<String, List<Integer>> entry : disciplinasNotas.entrySet()) {
            String nomeDisciplina = entry.getKey();
            List<Integer> notas = entry.getValue();

            System.out.println("Disciplina: " + nomeDisciplina);
            Integer somaNotas = 0;
            for (Integer nota : notas) {
                somaNotas = somaNotas + nota;
            }

            System.out.println("Média: " + (somaNotas / notas.size()));
        }
    }

        public void calcularMediaGeral () {
            Integer media = 0;

            for (Map.Entry<String, List<Integer>> entry : disciplinasNotas.entrySet()) {
                List<Integer> notas = entry.getValue();

                Integer somaNotas = 0;
                for (Integer nota : notas) {
                    somaNotas += nota;
                }

                media += (somaNotas / notas.size()) / disciplinasNotas.size();
            }

            System.out.println(media);
        }
}