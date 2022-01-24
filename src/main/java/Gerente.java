import java.util.Arrays;
import java.util.List;

public class Gerente implements IGerente {

    private Integer cpf;
    private String nome;
    private String cidade;
    private Float feedback1;
    private Float feedback2;

    public Gerente(int cpf) {
        this.cpf = cpf;
        Gerente objeto = BD.getGerente(cpf);
        this.nome = objeto.nome;
        this.cidade = objeto.cidade;
        this.feedback1 = objeto.feedback1;
        this.feedback2 = objeto.feedback2;
    }

    public Gerente(Integer cpf, String nome, String cidade, Float nota1, Float nota2) {
        this.cpf = cpf;
        this.nome = nome;
        this.cidade = cidade;
        this.feedback1 = feedback1;
        this.feedback2 = feedback2;
    }

    public Integer getCpf() {
        return cpf;
    }

    @Override
    public List<String> obterDadosPessoais() {
        return Arrays.asList(this.nome, this.cidade);
    }

    @Override
    public List<Float> obterFeedback(Funcionario funcionario) {
        return Arrays.asList(this.feedback1, this.feedback2);
    }

}
