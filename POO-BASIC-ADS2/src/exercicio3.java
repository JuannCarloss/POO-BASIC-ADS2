public class exercicio3 {
    public static void main(String[] args) {
        String frase = "Frase teste";
        int qntChar = frase.length();
        System.out.println("a quantidade de caracteres desta frase é: " + qntChar);

        if (qntChar > 50){
            System.out.println("frase muito longa");
        }else {
            System.out.println("frase curta");
        }

        String dev = "Desenvolvimento é muito legal";
        System.out.println(dev);

        String newDev = dev.replace("Desenvolvimento", "Programação");
        System.out.println(newDev);

        String maiuscula = newDev.toUpperCase();

        System.out.println(maiuscula);
    }
}
