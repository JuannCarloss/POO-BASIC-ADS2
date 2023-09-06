

public class Boletim {
    String aluno;

    public String verificaAlunoAprovado(String aluno, Integer frequencia, Integer mediaGeral) {
        if (frequencia < 70) {
            return "O aluno " + aluno + " foi REPROVADO";
        }else if (mediaGeral >= 7){
            return "O aluno "+ aluno +" está APROVADO";
        }else {
            return "O aluno " + aluno + " está em RECUPERAÇÃO";
        }
    }
}
