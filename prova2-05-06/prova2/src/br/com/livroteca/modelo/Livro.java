package br.com.livroteca.modelo;

public class Livro {
	private int id;
	private String titulo;
	private double precoBase;
	private int quantidadeEstoque;
	
	public Livro(int id, String titulo, double precoBase, int quantidadeEstoque) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.precoBase = precoBase;
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecoBase() {
		return precoBase;
	}

	public void setPrecoBase(double precoBase) {
		this.precoBase = precoBase;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public double calcularPrecoFinal() {
		return this.precoBase;
	}
	
	@Override
	public String toString() {
		return "Livro [id=" + id + ", titulo=" + titulo + ", precoBase=" + precoBase + ", quantidadeEstoque="
				+ quantidadeEstoque + "]";
	}

	public static double calcularValorTotalEstoque(Livro[] livros) {
		double valor = 0.0;
		
		for (Livro l : livros) {
			if (l != null) {
				valor += l.calcularPrecoFinal() * l.getQuantidadeEstoque();
			}
		}
		
		return valor;
	}
	
	public static boolean temEspacoDisponivel(Livro[] livros) {
		for (Livro l : livros) {
			if (l == null) return true;
		}
		return false;
	}
}
