import javax.swing.*;

public class optionPane {
    public static void main(String[] args) {
        Integer num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o primeiro numero", "entrada", JOptionPane.QUESTION_MESSAGE));
        System.out.println(num1);

        Integer num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o segunod numero: ", "Entrada", JOptionPane.QUESTION_MESSAGE));
        System.out.println(num2);

        Integer soma = num1 + num2;
        JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + soma, "Calculadora", JOptionPane.INFORMATION_MESSAGE);

    }
}
