//CLASSE AINDA NÃO UTILIZADA EM CONTA
public class PessoaFisica {
	private String CPF;
	private String nome;
	
	PessoaFisica() {
		this.CPF = Teclado.lerString("Digite o CPF da pessoa física: ");
		
		while (!cpfValido(this.CPF)) {
			System.out.println("CPF INVÁLIDO! Tente novamente!");
			this.CPF = Teclado.lerString("Digite o CPF da pessoa física: ");
		}
		
		System.out.println("Pessoa física criada com sucesso!");
	}
	
	public String getCPF() {
		return CPF;
	}

	/*public void setCPF(String cPF) {
		CPF = cPF; //n faz sentido ter
	}*/

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean cpfValido(String cpf) {
        cpf = cpf.replaceAll("[^\\d]", ""); //caso a pessoa insista no ponto e traço

        if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) { //tem 11 numeros?
            return false;
        }

        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * (10 - i);
        }
        int digito1 = (soma * 10) % 11; //1º digito verificador
        if (digito1 == 10) digito1 = 0;

        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * (11 - i);
        }
        int digito2 = (soma * 10) % 11; //2º digito verficador
        if (digito2 == 10) digito2 = 0;

        //confirma se não tem resto, e entrega se é valdo (true) ou não valido (false)
        return digito1 == (cpf.charAt(9) - '0') && digito2 == (cpf.charAt(10) - '0');
	}
	
	public void mostrarInfo() {
		System.out.println("\nINFORMAÇÕES DA PESSOA FÍSICA:");
		System.out.println("Nome: " + getNome());
		System.out.println("CPF: " + getCPF());
	}
}
