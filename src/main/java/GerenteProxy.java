import java.util.List;

public class GerenteProxy implements IGerente {

    private Gerente gerente;

    private Integer cpf;

    public GerenteProxy(Integer cpf) {
        this.cpf = cpf;
    }

    @Override
    public List<String> obterDadosPessoais() {
        if (this.gerente == null) {
            this.gerente = new Gerente(this.cpf);
        }
        return this.gerente.obterDadosPessoais();
    }
    @Override
    public List<Float> obterFeedback(Funcionario funcionario) {
        if (!funcionario.isAdministrador()) {
            throw new IllegalArgumentException("Funcionário não autorizado");
        }
        if (this.gerente == null) {
            this.gerente = new Gerente(this.cpf);
        }
        return this.gerente.obterFeedback(funcionario);
    }




}
