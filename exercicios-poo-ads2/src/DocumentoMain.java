import java.time.LocalDate;

public class DocumentoMain {
    public static void main(String[] args) {
        Documento doc1 = new Documento();
        doc1.nome = "Alfredo";

        Documento doc2 = doc1;
        doc2.nome = "Juan";

        System.out.println(doc1);
        System.out.println(doc2);
    }
}
