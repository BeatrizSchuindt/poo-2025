
public class Menu {
	
	public void opcoes() {
		OperacoesProduto sistema = new OperacoesProduto();
		int op=0;
		
		do {
			// apresentação do menu
			System.out.println("-------- GESTÃO DE PRODUTOS --------");
			System.out.println("1- CADASTRAR um produto");
			System.out.println("2- CONSULTAR produtos cadastrados");
			System.out.println("3- EXCLUIR produto cadastrado");
			System.out.println("0- SAIR do sisteminha");
			
			op = Teclado.lerInteiro("\nDigite sua opção: "); 
			
			switch(op) {
				case 0:
					System.out.println("\nSaindo... Xau!");
					break;
				case 1:
					System.out.println("\n****** CADASTRO DE PRODUTO ******");
					sistema.cadastrarProduto();
					break;
				case 2:
					System.out.println("\n****** CONSULTA DE PRODUTOS ******");
					sistema.consultarProdutos();
					break;
				case 3:
					System.out.println("\n****** EXCLUIR PRODUTO ******");
					sistema.excluirProduto();
					break;
				default:
					System.out.println("\nVocê digitou uma opção INVÁLIDA! Tente novamente!\n");
					break;
			}
			
		} while (op != 0);
		
	}
}
