
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.nome = "Ana Beatriz";
		f1.salario = 10000;
		
		System.out.println("O salário de " + f1.nome + " é " + f1.salario);
		
		f1.recebeAumento(500);
		
		System.out.println("O salário com AUMENTO de " + f1.nome + " é " + f1.salario);
		
		double ganho_anual = f1.calculaGanhoAnual();
		
		System.out.println("O ganho anual de " + f1.nome + " é " + ganho_anual);
	}
}
