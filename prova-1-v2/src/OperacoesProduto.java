
public class OperacoesProduto {
	Produto[] produto = new Produto[3];
	int contador_produto=0, contador_id=0;
	
	//função de cadastrar
	public void cadastrarProduto() {
	
		//verifica limite
		if (contador_produto >= 3) {
			System.out.println("O sistema está no LIMITE!\n");
		} else {
			contador_id++;
			
			int id = contador_id;
			String nome = Teclado.lerString("Digite o NOME do produto: ");
			double preco = Teclado.lerDouble("Digite o PREÇO do produto");
			
			for (int i=0; i<3; i++) {
				if (produto[i] == null) {
					
					Produto produto = new Produto(id, nome, preco);
					contador_produto++;
					System.out.println("\nO produto " + contador_id + " foi CADASTRADO com sucesso!\n");
					
					return;
				}
			}
		}
	}
	
	//função de consultar geral
	public void consultarProdutos() {
		//verificar se não tá vazio
		if (contador_produto == 0) {
			System.out.println("NENHUM produto cadastrado... Cadastre algum!\n");
		} else {
			for (int i=0; i<3; i++) {
				if (produto[i] == null) {
					continue;
				} else {
					System.out.println("-------------------------------");
					System.out.println("ID: " + produto[i].getId());
					System.out.println("NOME: " + produto[i].getNome());
					System.out.println("PREÇO: " + produto[i].getPreco());
				}
			}
			System.out.println("\n");
		}
	}
	
	//função de excluir geral
	public void excluirProduto() {
		int busca_id=0;
		
		if (contador_produto == 0) {
			System.out.println("NENHUM produto cadastrado... Cadastre algum!\n");
		} else {
			busca_id = Teclado.lerInteiro("Digite o ID do produto que será EXCLUÍDO: ");
			
			for (int i=0; i<3; i++) {
				if (busca_id == produto[i].getId()) {
					
					produto[i] = null;
					contador_produto--;
					
					System.out.println("O produto " + busca_id + " foi EXCLUÍDO com sucesso!\n");
					return;
				} 
			}
			System.out.println("\nNenhum produto com esse ID foi encontrado... Tente novamente.\n");
		}
	}
}
