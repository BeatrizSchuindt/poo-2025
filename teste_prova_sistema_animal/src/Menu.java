
public class Menu {
	OperacoesAnimal sistema = new OperacoesAnimal();
	
	public void opcoes() {
		int op=1;
		
		do {
			System.out.println("****** SISTEMA VETERINÁRIO ******");
			System.out.println("1- CADASTRAR um animal");
			System.out.println("2- ATUALIZAR um animal");
			System.out.println("3- IMPRIMIR animais");
			System.out.println("4- EXCLUIR um animal");
			System.out.println("0- SAIR");
			
			op = Teclado.lerInteiro("\nDigite sua opção: ");
			
			switch (op) {
			case 0:
				System.out.println("Saindo...");
				break;
			case 1:
				System.out.println("\n**** CADASTRAR ANIMAL ****");
				sistema.cadastrarAnimal();
				break;
			case 2:
				System.out.println("\n**** ATUALIZAR ANIMAL ****");
				sistema.atualizarAnimal();
				break;
			case 3:
				System.out.println("\n**** IMPRIMIR ANIMAIS ****");
				sistema.imprimirAnimais();
				break;
			case 4:
				System.out.println("\n**** EXCLUIR ANIMAL ****");
				sistema.excluirAnimal();
				break;
			}
		} while (op != 0);
	}
}
