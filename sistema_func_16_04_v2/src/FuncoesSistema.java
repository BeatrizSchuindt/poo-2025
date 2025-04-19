
public class FuncoesSistema {
	int contador_func=0;
	int contador_matricula=0;
	//CRIAR VETOR COM 10 FUNCIONÁRIOS
	Funcionario[] funcionario = new Funcionario[10];
	
	//função de cadastrar
	public void cadastrarFuncionario() {
		//instanciar/criar objeto novo
		Funcionario f = new Funcionario();
		
		//verificação de espaço livre no array
		for (int i=0; i<10; i++) {
			if (contador_func == 10) {
				System.out.println("O sistema chegou ao LIMITE!\n");
				break;
			} else {
				if (funcionario[i] == null) {
					contador_func++;
					contador_matricula++;
					
					f.matricula = contador_matricula;
					f.nome = Teclado.lerString("Digite o nome do funcionário " + contador_matricula + ": ");
					f.salario = Teclado.lerDouble("Digite o salário do funcionário " + contador_matricula + ": ");
					
					funcionario[i] = f;
					
					System.out.println("Funcionário " + contador_matricula + " CADASTRADO com sucesso!\n");
					break;
				}
			}
		}
	}
	
	//função de atualizar
	public void atualizarFuncionario() {
		//perguntar qual funcionario quer mexer através do número de matrícula
		int busca_mat=0;
		
		System.out.println("DEBGUG -> CONTADOR DE FUNCIONÁRIO " + contador_func);
		
		if(contador_func == 0) {
			System.out.println("Nenhum funcionário foi cadastrado... CADASTRE ALGUM FUNCIONÁRIO!\n\n");
		} else {
			busca_mat = Teclado.lerInteiro("Digite a MATRÍCULA do funcionário que deseja ATUALIZAR: ");
			
			for (int i=0; i<10; i++) {
				if (funcionario[i].matricula == busca_mat) {
					funcionario[i].nome = Teclado.lerString("Digite o novo NOME do funcionário " + busca_mat + ": ");
					funcionario[i].salario = Teclado.lerDouble("Digite o novo SALÁRIO do funcionário " + busca_mat + ": ");
					
					System.out.println("Funcionário " + busca_mat + " foi ATUALIZADO com sucesso!\n");

					return;
				}
			}
			
			System.out.println("Nenhum funcionário encontrado... Tente novamente!");
		}
	}
	
	//função de imprimir
	public void imprimirFuncionarios() {
		if(contador_func == 0) {
			System.out.println("Nenhum funcionário foi cadastrado... CADASTRE ALGUM FUNCIONÁRIO!\n\n");
		} else {
			for (int i=0; i<10; i++) {
				if (funcionario[i] == null) {
					continue;
				} else {
					System.out.println("Matrícula: " + funcionario[i].matricula);
					System.out.println("Nome: " + funcionario[i].nome);
					System.out.println("Salário: " + funcionario[i].salario);
					System.out.println("--------------------------------");
				}
			}
			System.out.println("\n");
		}
	}
	
	//função de deletar
	public void excluirFuncionario() {
		//perguntar qual funcionario quer mexer através do número de matrícula
		int busca_mat=0;
		
		if(contador_func == 0) {
			System.out.println("Nenhum funcionário foi cadastrado... CADASTRE ALGUM FUNCIONÁRIO!\n\n");
		} else {
			busca_mat = Teclado.lerInteiro("Digite a MATRÍCULA do funcionário que deseja EXCLUIR: ");
				
			for (int i=0; i<10; i++) {
				if (funcionario[i].matricula == busca_mat) {
					
					funcionario[i] = null;
					contador_func--;
							
					System.out.println("Funcionário " + busca_mat + " foi REMOVIDO com sucesso!\n");
					return;
				}
			}
			
			System.out.println("Nenhum funcionário encontrado... Tente novamente!\n");
		}
	}
}
