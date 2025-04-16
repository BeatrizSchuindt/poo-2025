
public class Menu {
	FuncionarioMetodos funcao = new FuncionarioMetodos();
	
	public void mostrarMenu() {
		int op=1;
		
		do {
			System.out.println("\n=== MENU ===");
	        System.out.println("1 - Cadastrar funcionário");
	        System.out.println("2 - Listar funcionários");
	        System.out.println("3 - Atualizar funcionário");
            System.out.println("4 - Excluir funcionário");
            System.out.println("0 - Sair");
            
            op = Teclado.lerInteiro("\nDigite sua opção: ");
            
            if (op == 1) funcao.cadastrarFuncionario();
            else if (op == 2) funcao.imprimirFuncionarios();
            else if (op == 3) funcao.atualizarFuncionario();
            else if (op == 4) funcao.excluirFuncionario();
            else if (op == 0) System.out.println("\nSaindo... Xau!");
            else System.out.println("\nOpção inválida.");
            
		} while (op != 0);
	}
}
