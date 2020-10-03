package br.com.alura.algoritmos;

public class TestaOrdenacao {

    public static void main(String[] args) {
        Produto produtos[] = {
                new Produto("Lamborguini", 1000000),
                new Produto("Jipe", 46000),
                new Produto("Brasília", 16000),
                new Produto("Smart", 46000),
                new Produto("Fusca", 17000),
        };

//        selectionSort(produtos, produtos.length);
        insertionSort(produtos, produtos.length);

        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " custa " + produto.getPreco());
        }
    }

    private static void insertionSort(Produto[] produtos, int quantidadeDeElementos) {
        for (int atual = 1; atual < quantidadeDeElementos; atual++) {
            System.out.println("Estou na casinha " + atual);

            int analise = atual;
            while (analise > 0 && produtos[analise].getPreco() < produtos[analise - 1].getPreco()) {
                System.out.println("Estou trocando " + analise + " com " + (analise - 1));
                troca(produtos, analise, analise - 1);
                analise--;
            }
        }
    }

    private static void troca(Produto[] produtos, int primeiro, int segundo) {
        System.out.println("Estou trocando " + primeiro + " com " + segundo);

        Produto primeiroProduto = produtos[primeiro];
        Produto segundoProduto = produtos[primeiro - 1];
        System.out.println("Estou trocando " + primeiroProduto.getNome() + " com " + segundoProduto.getNome());

        produtos[primeiro] = segundoProduto;
        produtos[primeiro - 1] = primeiroProduto;
    }

    private static void selectionSort(Produto[] produtos, int quantidadeDeElementos) {
        for (int atual = 0; atual < quantidadeDeElementos - 1; atual++) {
            System.out.println("Estou na casinha " + atual);

            int menor = buscaMenor(produtos, atual, quantidadeDeElementos - 1);
            System.out.println("Trocando " + atual +  " com o " + menor);
            troca(produtos, atual, menor);
        }
    }


    private static int buscaMenor(Produto[] produtos, int inicio, int termino) {
        int maisBarato = inicio;

        for (int atual = inicio; atual <= termino; atual++) {
            if (produtos[atual].getPreco() < produtos[maisBarato].getPreco())  {
                maisBarato = atual;
            }
        }
        return maisBarato;
    }
}
