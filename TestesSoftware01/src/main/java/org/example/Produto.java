package org.example;

public class Produto {
    private String nomeProduto;
    private String descricao;
    private String categoria;
    private double preco;
    private int qtdEstoque;

    public Produto(String nomeProduto, String descricao, String categoria, double preco, int qtdEstoque) {
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.categoria = categoria;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }


}

