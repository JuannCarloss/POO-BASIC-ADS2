import javax.swing.*;

public class exercicio5 {
    public static void main(String[] args) {


        System.out.println("iniciando programa");

        Integer num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro numero", "numero 1", JOptionPane.QUESTION_MESSAGE ));
        System.out.println(num1);

        Integer num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo numero", "numero 2", JOptionPane.QUESTION_MESSAGE ));
        System.out.println(num2);

        try {
            int calc = (((num1 + num2) - 1) * num2) / num1;
            JOptionPane.showMessageDialog(null, calc);
        } catch (Exception e){
           JOptionPane.showMessageDialog(null, "ERRO: A divisão por zero é impossível!");
        }

        System.out.println("finalizando programa");

    }
}
