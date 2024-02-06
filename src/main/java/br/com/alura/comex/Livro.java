package br.com.alura.comex;
import br.com.alura.comex.interfaces.Identificavel;

public class Livro extends Produto implements Identifical{
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

    @Override
    public String identificar() {
        return "Livro: Nome - " + nome + ", ISBN - " + isbn;
    }
}

