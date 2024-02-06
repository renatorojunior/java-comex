package br.com.alura.comex;

public class Livro extends Produto {
    private String isbn;
    private int totalPaginas;

    public Livro(String nome, String descricao, double precoUnitario, int quantidade, String isbn, int totalPaginas) {
        super(nome, descricao, precoUnitario, quantidade);
        this.isbn = isbn;
        this.totalPaginas = totalPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    @Override
    public void imprimirDadosDoProduto() {
        super.imprimirDadosDoProduto();
        System.out.println(":: ISBN: " + isbn);
        System.out.println(":: Total de Páginas: " + totalPaginas);
    }
}

