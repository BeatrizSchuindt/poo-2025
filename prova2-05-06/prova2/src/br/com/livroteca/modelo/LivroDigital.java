package br.com.livroteca.modelo;

public class LivroDigital extends Livro {
	private double percentualDesconto;
	
	public LivroDigital(int id, String titulo, double precoBase, int quantidadeEstoque, double percentualDesconto) {
		super(id, titulo, precoBase, quantidadeEstoque);
		
		this.percentualDesconto = percentualDesconto;
	}

	public double getPercentualDesconto() {
		return percentualDesconto;
	}

	public void setPercentualDesconto(double percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}
	
	public double calcularPrecoFinal() {
		return getPrecoBase() - (getPrecoBase() * percentualDesconto / 100);
	}
	
	@Override
	public String toString() {
		return super.toString() + " [percentualDesconto=" + percentualDesconto + "]";
	}
	
	
}
