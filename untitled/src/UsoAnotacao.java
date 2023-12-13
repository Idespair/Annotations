import java.lang.annotation.Annotation;

@Tabela(nome = "Tabela 1")
public class UsoAnotacao {
    public static void main(String[] args) {
        Class<UsoAnotacao> classe = UsoAnotacao.class;
        Tabela tabela = classe.getAnnotation(Tabela.class);

        String answer = tabela.nome();

        System.out.println(answer);
    }
}



