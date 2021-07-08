package br.com.alura.escola.academico.dominio.aluno;

public class Email {
    private String endereco;

    public Email(String endereco) {
//        if (endereco == null || !endereco.matches("^[a-z0-9.]+@[a-z0-9]+\\.[a-z]+\\.([a-z]+)?$")) {
        if (endereco == null) {
            throw new IllegalArgumentException("Email inválido!");
        }
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }
}
