package br.com.alura.escola.shared.evento;
import java.util.List;

import java.util.ArrayList;

public class PublicadorDeEventos {

    private List<Ouvinte> ouvintes = new ArrayList<>();

    public void adicionar(Ouvinte ouvinte) {
        this.ouvintes.add(ouvinte);
    }

    public void publicar(Evento evento) {
        ouvintes.forEach(o -> o.processa(evento));
    }
}
