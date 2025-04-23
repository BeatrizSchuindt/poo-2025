
public class Menu {
	//pegar operações de OperacoesSistema
	OperacoesSistema sistema = new OperacoesSistema();
	
	//fazer função de menu com as opções
	public void opcoes() {
		int op=1;
		
		do {
			System.out.println("****** SISTEMA DA BIBLIOTECA *******");
			System.out.println("1- CADASTRAR um livro");
			System.out.println("2- ATUALIZAR um livro");
			System.out.println("3- IMPRIMIR livros cadastrados");
			System.out.println("4- EXCLUIR um livro");
			System.out.println("0- SAIR do sisteminha");
			
			op = Teclado.lerInteiro("\nDigite sua opção: ");
			
			switch(op) {
			case 0:
				System.out.println("Saindo...");
				break;
			
			case 1:
				System.out.println("\n+++++ CADASTRAR LIVRO +++++");
				sistema.cadastrarLivro();
				break;
			
			case 2:
				System.out.println("\n+++++ ATUALIZAR LIVRO +++++");
				sistema.atualizarLivro();
				break;
			
			case 3:
				System.out.println("\n+++++ IMPRIMIR LIVROS +++++");
				sistema.imprimirLivros();
				break;
				
			case 4:
				System.out.println("\n+++++ EXCLUIR LIVRO +++++");
				sistema.excluirLivro();
				break;
			}
			
		} while (op != 0);
	}
}
