package br.com.caelum.contas.modelo;

public class Data {
	public int dia;
	public int mes;
	public int ano;
	
	public String dataFormatada() {
	    return String.format("%02d/%02d/%04d", dia, mes, ano);
	}
	
	//criar validações para data - ex 6
	boolean validaData() {
		if (mes < 1 || mes > 12) {
			return false;
		}
		if (dia < 1) {
			return false;
		}
		return true;
	}
}
