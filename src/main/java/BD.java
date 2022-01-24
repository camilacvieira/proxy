import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<Integer, Gerente> gerentes = new HashMap<>();

    public static Gerente getGerente(Integer cpf) {
        return gerentes.get(cpf);
    }

    public static void addGerente(Gerente gerente) {
        gerentes.put(gerente.getCpf(), gerente);
    }
}
