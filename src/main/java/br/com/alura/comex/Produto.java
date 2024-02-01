package br.com.alura.comex;

import java.util.Objects;

public class Produto {
    private String nome;
    private String descricao;
    private double precoUnitario;
    private int quantidade;

    public Produto(String nome, String descricao, double precoUnitario, int quantidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    // Métodos para acessar os atributos (getters e setters)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
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
}
