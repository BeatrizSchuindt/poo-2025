
public class FuncionarioMetodos {
	//criar vetor dos funcionários
	Funcionario[] funcionario = new Funcionario[10];
	int contador=0, contador_matricula=0;
	
	/* DICA DO PROFESSOR
	 * -> Ele usou um array de 10 posições para guardar os dados de funcionários
	 * -> Ao invés dele usar a lógica de C (de reordenar o vetor passa todos os sucessores uma posição pra trás)
	 * -> Em cadastrarFuncionario dele, ele fez um for com o i de 0 até 10, fazendo um if (funcionario[i] == null)
	 * -> Por exemplo, se excluí a posição 4, essa posição fica null. Aí na próxima verificação de cadastrarFuncionário
	 * ele vai adicionar o funcionário novo na posição 4.
	 * */
	//função de ler
	public void cadastrarFuncionario() {
		//verificar se atingiu os 10
		if (contador >= funcionario.length) {
			System.out.println("Limite de funcionários atingido!\n");
			return;
		}
		
		//instância do objeto
		Funcionario f = new Funcionario();
		f.matricula = (contador_matricula + 1);
		f.nome = Teclado.lerString("Digite o nome do funcionário " + (contador_matricula + 1) + ": ");
		f.salario = Teclado.lerDouble("Digite o salário do funcionário " + (contador_matricula + 1) + ": R$");
		
		funcionario[contador] = f;
		contador++;
		contador_matricula++;
		
		System.out.println("Funcionário " + contador_matricula + " cadastrado com sucesso!\n");
	}
	
	//função de atualizar
	public void atualizarFuncionario() {
		if (contador == 0) {
			System.out.println("\nSem funcionários cadastrados... Tente adicionar um.");
			return;
		}
		
		int matricula_busca = Teclado.lerInteiro("\nDigite a matrícula do funcionário que você deseja ATUALIZAR: ");
		
		for (int i=0; i<contador; i++) {
			if(matricula_busca == funcionario[i].matricula) {
				funcionario[i].nome = Teclado.lerString("Digite o NOVO nome do funcionário " + matricula_busca + ": ");
				funcionario[i].salario = Teclado.lerDouble("Digite o NOVO salário do funcionário " + matricula_busca + ": R$");
				
				System.out.println("Funcionário " + (matricula_busca) + " atualizado com sucesso!\n");
				return;
			}
		}
		System.out.println("Funcionário não encontrado... Tente novamente!\n");
	}
	
	//função de imprimir
	public void imprimirFuncionarios() {
		if (contador == 0) {
			System.out.println("\nSem funcionários cadastrados... Tente adicionar um.");
			return;
		}
		System.out.println("----- FUNCIONÁRIOS CADASTRADOS -----");
		for (int i=0; i<contador; i++) {
			System.out.println("Matrícula: " + funcionario[i].matricula);
			System.out.println("Nome: " + funcionario[i].nome);
			System.out.println("Salário: R$" + funcionario[i].salario);
			System.out.println("----------------------------------------");
		}
	}
	
	//função de excluir
	public void excluirFuncionario() {
		if (contador == 0) {
			System.out.println("\nSem funcionários cadastrados... Tente adicionar um.");
			return;
		}
		
		int matricula_busca = Teclado.lerInteiro("\nDigite a matrícula do funcionário que você deseja EXCLUIR: ");
		
		for (int i=0; i<contador; i++) {
            if (matricula_busca == funcionario[i].matricula) {
                for (int j=i; j<contador-1; j++) {
                    funcionario[j] = funcionario[j + 1];
                }
                funcionario[contador - 1] = null;
                contador--;
                System.out.println("Funcionário removido com sucesso!\n");
                return;
            }
        }
        System.out.println("Funcionário não encontrado... Tente novamente!\n");	
	}
}
