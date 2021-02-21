package br.com.alura.escola.academico.Aluno;

import br.com.alura.escola.academico.dominio.aluno.Email;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmailTest {

    @Test
    public void naoDeveriaCriarEmailsComEndercosInvalidos() {
       assertThrows(IllegalArgumentException.class, () -> new Email(null));
       assertThrows(IllegalArgumentException.class, () -> new Email(""));
       assertThrows(IllegalArgumentException.class, () -> new Email("emailInvalido"));
    }

}
