import java.lang.annotation.Annotation;

@Tabela(nome = "Tabela 1")
public class UsoAnotacao {
    static Annotation anno = Tabela.getClass().getAnnotation("Tabela 1");

    public static void main(String[] args) {
        System.out.println(anno);
    }
}



