
public class Funcionario {
	String nome;
	String departamento;
	double salario;
	double dt_admissao;
	String rg;
	
	void recebeAumento(double aumento) {
		salario += aumento;
	}
	
	double calculaGanhoAnual() {
		return salario*12;
	}
}
