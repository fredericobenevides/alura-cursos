package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as colećões do Java", "Paulo Silveir");

//        javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula com ArrayList", 20));
        javaColecoes.adiciona(new Aula("Modelando com colećões", 22));

        List<Aula> aulasImutavel = javaColecoes.getAulas();
        ArrayList<Aula> aulas = new ArrayList<>(aulasImutavel);

        System.out.println(aulas);
    }
}
