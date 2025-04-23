
public class OperacoesSistema {
	//criação do vetor livro
	Livro[] livro = new Livro[4];
	int contador_livro=0, contador_codigo=0;
	
	//função de cadastrar livro
	public void cadastrarLivro() {
		Livro l = new Livro();
		
		if (contador_livro >= 4) {
			System.out.println("A biblioteca chegou ao LIMITE!\n");
		} else {
			contador_codigo++;
		
			l.codigo = contador_codigo;
			l.titulo = Teclado.lerString("Digite o TÍTULO do livro: ");
			l.autor = Teclado.lerString("Digite o nome do AUTOR do livro: ");
			
			livro[contador_livro] = l;
			contador_livro++;
			
			System.out.println("O livro " + contador_codigo + " foi CADASTRADO com sucesso!\n");
		}
		
	}
	
	//função de atualizar livro
	public void atualizarLivro() {
		int busca_codigo=0;
		
		if (contador_livro == 0) {
			System.out.println("NENHUM livro cadastrado... Cadastre algum livro!\n");
		} else {
			busca_codigo = Teclado.lerInteiro("Digite o nº do código do livro que deseja ATUALIZAR:");
		
			for (int i=0; i<4; i++) {
				if (busca_codigo == livro[i].codigo) {
					livro[i].titulo = Teclado.lerString("Digite o novo TÍTULO do livro: ");
					livro[i].autor = Teclado.lerString("Digite o nome do novo AUTOR do livro: ");
					
					System.out.println("O livro " + busca_codigo + " foi ATUALIZADO com sucesso!\n");
				}
			}
		}
	}
	
	//função de imprimir livros
	public void imprimirLivros() {
		if (contador_livro == 0) {
			System.out.println("NENHUM livro cadastrado... Cadastre algum livro!\n");
		} else {
			for (int i=0; i<4; i++) {
				if (livro[i] == null) {
					continue;
				} else {
					System.out.println("-----------------------------");
					System.out.println("CÓDIGO: " + livro[i].codigo);
					System.out.println("TÍTULO: " + livro[i].titulo);
					System.out.println("AUTOR: " + livro[i].autor);
				}
			}
			System.out.println("\n");
		}
	}
	
	//função de excluir livros
	public void excluirLivro() {
		int busca_codigo=0;
		
		if (contador_livro == 0) {
			System.out.println("NENHUM livro cadastrado... Cadastre algum livro!\n");
		} else {
			busca_codigo = Teclado.lerInteiro("Digite o nº do código do livro que deseja EXCLUIR:");
			
			for (int i=0; i<4; i++) {
				if (busca_codigo == livro[i].codigo) {

					livro[i] = null;
					contador_livro--;
					
					System.out.println("O livro " + busca_codigo + " foi EXCLUÍDO com sucesso!\n");
				}
			}
		}
	}
}
