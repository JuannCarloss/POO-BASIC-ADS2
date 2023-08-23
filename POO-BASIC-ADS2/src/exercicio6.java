import javax.swing.*;
import java.util.ArrayList;

public class exercicio6 {
    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
        double maior = 0, menor = 999999999, media = 0, soma = 0;
        int par = 0;
        for (int i=0; i<10; i++) {
            Double num = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite os valores a serem colocados no array", "numeros", JOptionPane.QUESTION_MESSAGE));
            numeros.add(num);

        }
        for (int i=0; i<10; i++){

            soma = numeros.get(i) + soma;

            if (numeros.get(i) > maior){
                maior = numeros.get(i);
            }

            if (numeros.get(i) < menor){
                menor = numeros.get(i);
            }

            if (numeros.get(i)%2==0){

            }
        }

        media = soma / numeros.size();

        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);
        System.out.println("media: " + media);
        System.out.println("pares: " + par);

    }
}
