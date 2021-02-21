package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class TestaSetPerformance {

    public static void main(String[] args) {

        Collection<Integer> numeros = new HashSet<>();

        long inicio = System.currentTimeMillis();

        long inicioAdd = System.currentTimeMillis();
        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }
        long fimAdd = System.currentTimeMillis();
        System.out.println("Tempo gasto adicionando: " + (fimAdd - inicioAdd));

        long inicioContains = System.currentTimeMillis();
        for (Integer numero : numeros) {
            numeros.contains(numero);
        }
        long fimContains = System.currentTimeMillis();
        System.out.println("Tempo gasto contains: " + (fimContains - inicioContains));

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto: " + tempoDeExecucao);

    }

}
