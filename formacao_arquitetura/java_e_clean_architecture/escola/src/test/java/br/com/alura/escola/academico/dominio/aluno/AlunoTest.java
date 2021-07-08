package br.com.alura.escola.academico.dominio.aluno;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AlunoTest {

    private Aluno aluno;

    @BeforeEach
    public void beforeEach() {
        this.aluno = new Aluno(
                new CPF("123.456.789-00"),
                "Fulano da Silva",
                new Email("fulano@email.com")
        );
    }

    @Test
    public void deveriaPermitirAdicionar1Telefone() {
       this.aluno.adicionarTelefone("11", "99999999");
       assertEquals(1, this.aluno.getTelefones().size());
    }

    @Test
    public void deveriaPermitirAdicionar2Telefone() {
        this.aluno.adicionarTelefone("11", "99999999");
        this.aluno.adicionarTelefone("11", "88888888");
        assertEquals(2, this.aluno.getTelefones().size());
    }

    @Test
    public void naoDeveAdicionar3Telefones() {
        assertThrows(IllegalArgumentException.class, () -> {
            this.aluno.adicionarTelefone("11", "99999999");
            this.aluno.adicionarTelefone("11", "88888888");
            this.aluno.adicionarTelefone("11", "77777777");
        });
    }
}
