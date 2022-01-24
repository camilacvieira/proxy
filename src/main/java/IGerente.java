import java.util.List;

public interface IGerente {
    List<String> obterDadosPessoais();
    List<Float> obterFeedback(Funcionario funcionario);
}
