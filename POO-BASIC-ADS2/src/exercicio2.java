public class exercicio2 {
    public static void main(String[] args) {
            int dia = 4;

            switch (dia) {
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Segunda-feira");
                    break;
                case 3:
                    System.out.println("Terça-feira");
                    break;
                case 4:
                    System.out.println("Quarta-feira");
                    break;
                case 5:
                    System.out.println("Quinta-feira");
                    break;
                case 6:
                    System.out.println("Sexta-feira");
                    break;
                case 7:
                    System.out.println("Sábado");
                default:
                    System.out.println("número fora do alcance");
            }

            int x = 10;
            while (x < 30) {
                System.out.println(x);
                x++;
            }

            System.out.println("****************");

            int y = 0;
            do {
                System.out.println("item " + y);
                y++;
            } while (y <= 30);

            double h = 1, bMenor = 1, bMaior = 1, area;

            System.out.println("a altura do trapézio é: " + h);
            System.out.println("a base menor é: " + bMenor);
            System.out.println("a base maior é: " + bMaior);
            area = (h / (bMenor + bMaior) / 2);
            System.out.println("e a sua area é: " + area);
        }
    }

