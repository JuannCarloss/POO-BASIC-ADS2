import javax.swing.JOptionPane;

public class exercicio4 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "digite seu nome", "nome", JOptionPane.QUESTION_MESSAGE);
        System.out.println(nome);

        String sobrenome = JOptionPane.showInputDialog(null, "digite seu sobrenome", "sobrenome", JOptionPane.QUESTION_MESSAGE);
        System.out.println(sobrenome);

        JOptionPane.showMessageDialog(null, "seu nome completo é: " + nome + " " + sobrenome,"nome completo", JOptionPane.INFORMATION_MESSAGE);


        Integer dia = Integer.parseInt(JOptionPane.showInputDialog(null, "informe o dia da semana", "Dia", JOptionPane.QUESTION_MESSAGE));

        switch (dia) {

            case 1: JOptionPane.showMessageDialog(null, "Domingo");
            break;

            case 2: JOptionPane.showMessageDialog(null, "Segunda-feira");
            break;

            case 3: JOptionPane.showMessageDialog(null, "Terça-feira");
            break;

            case 4: JOptionPane.showMessageDialog(null, "Quarta-feira");
            break;

            case 5: JOptionPane.showMessageDialog(null, "Quinta-feira");
            break;

            case 6: JOptionPane.showMessageDialog(null, "Sexta-feira");
            break;

            case 7: JOptionPane.showMessageDialog(null, "Sábado");
            break;

            default: JOptionPane.showMessageDialog(null, "valor de entrada inválido");
            break;
        }
    }


}
