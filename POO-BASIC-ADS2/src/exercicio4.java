import javax.swing.JOptionPane;

public class exercicio4 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "digite seu nome", "nome", JOptionPane.QUESTION_MESSAGE);
        System.out.println(nome);

        String sobrenome = JOptionPane.showInputDialog(null, "digite seu sobrenome", "sobrenome", JOptionPane.QUESTION_MESSAGE);
        System.out.println(sobrenome);

        JOptionPane.showMessageDialog(null, "seu nome completo é: " + nome + " " + sobrenome,"nome completo", JOptionPane.INFORMATION_MESSAGE);
    }
}
