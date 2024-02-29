package org.example;

import java.sql.SQLOutput;
import java.util.List;
import java.util.ArrayList;

public class CadastroProduto {
    private List<Produto> produtos;

    public CadastroProduto() {
        this.produtos = new ArrayList<>();
    }

    public void cadastrarProduto(Produto produto) {
        //campos obrigatórios
        if(produto.getNomeProduto().isEmpty() || produto.getDescricao().isEmpty() || produto.getCategoria().isEmpty() || produto.getPreco() <= 0 || produto.getQtdEstoque() <= 0) {
            System.out.println("Por favor, preencha todos os campos para cadastrar o produto corretamente.");
            return;
        }

        //se o preço é um número positivo
        if(produto.getPreco() <= 0) {
            System.out.println("Por favor, insira um valor diferente de 0 para o produto!");
            return;
        }

        //se a quantidade no estoque é negativa
        if(produto.getQtdEstoque() <= 0) {
            System.out.println("Por favor, insira um valor que não seja nulo para a quantidade.");
        }

        // Se passar por todas as validações, adiciona o produto à lista
        produtos.add(produto);
    }

    public void editarProdutos(String nome, Produto produtoEditado) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            if (produto.getNomeProduto().equals(nome)) {
                produtos.set(i, produtoEditado);
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public void excluirProduto(String nome) {
        produtos.removeIf(produto -> produto.getNomeProduto().equals(nome));
    }

    public List<Produto> consultarProdutos(){
        return produtos;
    }

}
