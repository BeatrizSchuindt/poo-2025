package br.com.livroteca.modelo;

public class LivroFisico extends Livro {
	private double custoImpressao;
	
	public LivroFisico(int id, String titulo, double precoBase, int quantidadeEstoque, double custoImpressao) {
		super(id, titulo, precoBase, quantidadeEstoque);
		
		this.custoImpressao = custoImpressao;
	}

	public double getCustoImpressao() {
		return custoImpressao;
	}

	public void setCustoImpressao(double custoImpressao) {
		this.custoImpressao = custoImpressao;
	}
	
	public double calcularPrecoFinal() {
		return getCustoImpressao() + getPrecoBase();
	}

	@Override
	public String toString() {
		return super.toString() + " [custoImpressao=" + custoImpressao + "]";
	}
}
