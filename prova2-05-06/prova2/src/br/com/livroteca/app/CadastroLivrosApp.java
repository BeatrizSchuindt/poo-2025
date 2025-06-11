package br.com.livroteca.app;

import br.com.livroteca.modelo.Livro;
import br.com.livroteca.modelo.LivroDigital;
import br.com.livroteca.modelo.LivroFisico;
import br.com.livroteca.util.Teclado;

public class CadastroLivrosApp {
	public static void main(String[] args) {
		Livro[] livro = new Livro[10]; //MUDAR PARA 10
		int opcao=0;
		
		do {
			System.out.println("===== SISTEMA LIVROTECA =====");
			System.out.println(" 1- INSERIR livro (físico ou digital)");
			System.out.println(" 2- CONSULTAR livros");
			System.out.println(" 3- Mostrar VALOR TOTAL do ESTOQUE");
			System.out.println(" 4- ALTERAR livro");
			System.out.println(" 5- EXCLUIR livro");
			System.out.println(" 0- SAIR");
			opcao = Teclado.lerInteiro("\nDigite uma opção: ");
			
			switch (opcao) {
			case 0:
				System.out.println("\nSaindo... Xau!");
				break;
	
			case 1:
				System.out.println("\n----- INSERIR LIVRO -----");
				Livro novoLivro;
				
				if (!Livro.temEspacoDisponivel(livro)) {
					System.out.println("Não tem mais espaço! Libere alguns livros...\n");
					break;
				}
				
				int tipoLivro = Teclado.lerInteiro("Digite: \n 1- Livro Fisico \n 2- Livro Digital ");
				
				int id = Teclado.lerInteiro("Digite o ID:");
				String titulo = Teclado.lerString("Digite o NOME:");
				double precoBase = Teclado.lerDouble("Digite o VALOR: ");
				int quantidadeEstoque = Teclado.lerInteiro("Digite a QUANTIDADE em estoque: ");
				
				if (tipoLivro == 1) {
					double custoImpressao = Teclado.lerDouble("Digite o VALOR do CUSTO DE IMPRESSÃO: ");
					novoLivro = new LivroFisico(id, titulo, precoBase, quantidadeEstoque, custoImpressao);
				} else {
					double percentualDesconto = Teclado.lerDouble("Digite o PERCENTUAL DE DESCONTO: ");
					novoLivro = new LivroDigital(id, titulo, precoBase, quantidadeEstoque, percentualDesconto);
				}
				
				for (int i=0; i<livro.length; i++) {
					if (livro[i] == null) {
						livro[i] = novoLivro;
						System.out.println("Novo livro CADASTRADO com sucesso! \n");
						break;
					}
				}
				
				break;
			
			case 2:
				System.out.println("\n----- CONSULTAR LIVROS -----");
				for (int i=0; i<livro.length; i++) {
					if (livro[i] != null) {
						System.out.println(livro[i]);
					}
				}
				
				System.out.println("\n");
				break;
				
			case 3: 
				System.out.println("\n----- VALOR TOTAL do ESTOQUE -----");
				System.out.println("O valor total do estoque é R$" + Livro.calcularValorTotalEstoque(livro) + "\n");
				break;
				
			case 4: 
				System.out.println("\n----- ALTERAR LIVRO -----");
				int idAlterar = Teclado.lerInteiro("Digite o ID do livro que será ALTERADO: ");
				boolean encontradoAlterar = false;
				
				for (int i=0; i<livro.length; i++) {
					if (livro[i] != null && livro[i].getId() == idAlterar) {
						encontradoAlterar = true;
						//não faz muito sentido para mim trocar o id
						//livro[i].setId(Teclado.lerInteiro("Digite o NOVO id: "));
						livro[i].setTitulo(Teclado.lerString("Digite o NOVO título:"));
						livro[i].setPrecoBase(Teclado.lerDouble("Digite o NOVO preço base: "));
						livro[i].setQuantidadeEstoque(Teclado.lerInteiro("Digite a NOVA quantidade no estoque: "));
						System.out.println("O livro foi ALTERADO com sucesso!\n");
						break;
					}
				}
				
				if (!encontradoAlterar) {
					System.out.println("Livro não encontrado...\n");
				}
				
				break;
				
			case 5: 
				System.out.println("\n----- EXCLUIR LIVRO -----");
				int idExcluir = Teclado.lerInteiro("Digite o ID do livro que será EXCLUÍDO: ");
				boolean encontrado = false;
				
				for (int i=0; i<livro.length; i++) {
					if (livro[i] != null && livro[i].getId() == idExcluir) {
						encontrado = true;
						livro[i] = null;
						System.out.println("O livro foi EXCLUÍDO com sucesso!\n");
						break;
					}
				}
				
				if (!encontrado) {
					System.out.println("Livro não encontrado...\n");
				}
				break;
				
			default:
				System.out.println("\nOpção INVÁLIDA! Tente novamente...");
				break;
			}
		} while (opcao != 0);
	}
}
