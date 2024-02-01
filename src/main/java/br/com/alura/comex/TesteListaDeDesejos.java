package br.com.alura.comex;

public class TesteListaDeDesejos {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Violão", "Instrumento musical com 6 cordas", 800.00, 1);
        Produto produto2 = new Produto("Fones de Ouvido", "Fones de ouvido sem fio", 120.00, 2);
        Produto produto3 = new Produto("LP Iron Maiden", "Álbum clássico em vinil", 49.90, 3);

        ListaDeDesejos listaDeDesejos = new ListaDeDesejos();

        listaDeDesejos.adicionaProduto(produto1);
        listaDeDesejos.adicionaProduto(produto2);
        listaDeDesejos.adicionaProduto(produto3);

        listaDeDesejos.imprimeProdutos();
    }
}

