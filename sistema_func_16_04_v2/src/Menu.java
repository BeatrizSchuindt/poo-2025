
public class Menu {
	
	public void opcoes() {
		int op=0;
		FuncoesSistema funcao = new FuncoesSistema();
		
		do {
			System.out.println("------- SISTEMA DE FUNCIONÁRIOS -------");
			System.out.println("1- CADASTRAR um funcionário");
			System.out.println("2- ATUALIZAR o cadastro de um funcionário");
			System.out.println("3- IMPRIMIR relação de funcionários cadastrados");
			System.out.println("4- EXCLUIR o cadastro de um funcionário");
			System.out.println("0- SAIR");
			
			op = Teclado.lerInteiro("Digite sua opção: ");
			
			//usar switch case
			switch(op) {
				case 0:
					System.out.println("Saindo...");
					break;
			
				case 1:
					System.out.println("\n***** CADASTRO DE FUNCIONÁRIO *****");
					funcao.cadastrarFuncionario();
					
					break;
			
				case 2:
					System.out.println("\n***** ATUALIZAÇÃO DE FUNCIONÁRIO *****");
					funcao.atualizarFuncionario();
					
					break;
			
				case 3:
					System.out.println("\n***** RELATÓRIO DE FUNCIONÁRIOS *****");
					funcao.imprimirFuncionarios();
					
					break;
			
				case 4:
					System.out.println("\n***** EXCLUSÃO DE FUNCIONÁRIO *****");
					funcao.excluirFuncionario();
					
					break;
			
				default:
					System.out.println("Você digitou uma OPÇÃO INVÁLIDA! Tente novamente...");
					break;
			}
			
		} while (op != 0);
		
	}
}
