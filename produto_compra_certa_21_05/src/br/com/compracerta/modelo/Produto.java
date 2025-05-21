package br.com.compracerta.modelo;

public class Produto { 
	private int id;
	private static int proximoId = 1;
    private String descricao;
    private double preco;
    private int quantidade;
    
    public Produto(String descricao, double preco, int quantidade) {
    	this.id = proximoId++;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public static double calcularValorTotalEstoque(Produto[] produtos, int total) {
        double totalEstoque = 0.0;
        for (int i = 0; i < total; i++) {
            totalEstoque += produtos[i].getPreco() * produtos[i].getQuantidade();
        }
        return totalEstoque;
    }
}
