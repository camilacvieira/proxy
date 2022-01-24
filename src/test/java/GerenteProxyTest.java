import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GerenteProxyTest {

    @BeforeEach
    void setUp() {
        BD.addGerente(new Gerente(1, "João", "Juiz de Fora", 8.0f, 9.0f));
        BD.addGerente(new Gerente(2, "Maria", "Juiz de Fora", 10.0f, 10.0f));
    }

    @Test
    void deveRetornarDadosPessoaisGerente() {
        GerenteProxy gerente = new GerenteProxy(1);

        assertEquals(Arrays.asList("João", "Juiz de Fora"), gerente.obterDadosPessoais());
    }

    @Test
    void deveRetonarExcecaoUsuarioNaoAutorizadoConsultarDadosGerente() {
        try {
            Funcionario funcionario = new Funcionario("Joana", false);
            GerenteProxy gerente = new GerenteProxy(2);

            gerente.obterFeedback(funcionario);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Funcionário não autorizado", e.getMessage());
        }
    }
}