package br.com.alura.comex;

import java.util.Objects;

public class Produto {
    private String nome;
    private String descricao;
    private double precoUnitario;
    private int quantidade;

    // Construtor que exige o nome como argumento
    public Produto(String nome, String descricao, double precoUnitario, int quantidade) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do produto não pode ser nulo ou vazio.");
        }

        this.nome = nome;
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Produto produto = (Produto) obj;
        return Double.compare(produto.precoUnitario, precoUnitario) == 0 &&
                quantidade == produto.quantidade &&
                nome.equals(produto.nome) &&
                descricao.equals(produto.descricao);
    }

    public void imprimirDadosDoProduto() {
        System.out.println(">> Dados do produto");
        System.out.println(":: Nome: " + nome);
        System.out.println(":: Descrição: " + descricao);
        System.out.println(":: Preço Unitário: R$" + precoUnitario);
        System.out.println(":: Quantidade: " + quantidade);
    }
}

