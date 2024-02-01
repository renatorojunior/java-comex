package br.com.alura.comex;

public class TesteImprimirDadosDoProduto {
    public static void main(String[] args) {

        Produto livro = new Produto("Harry Potter e a Pedra Filosofal", "Harry Potter é um garoto órfão.", 39.64, 10);

        // Imprimindo os dados do produto antes da modificação
        livro.imprimirDadosDoProduto();

        livro.setPrecoUnitario(45.56);
        livro.setQuantidade(15);

        // Imprimindo os dados do produto após a modificação
        livro.imprimirDadosDoProduto();
    }
}
