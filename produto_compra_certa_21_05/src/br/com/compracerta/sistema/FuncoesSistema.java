package br.com.compracerta.sistema;

import br.com.compracerta.modelo.Produto;
import br.com.compracerta.util.Teclado;

public class FuncoesSistema {
	
	public static boolean podeInserir(int totalProdutos) {
        return totalProdutos < 10;
    }
	
	public static int inserirProduto(Produto[] produtos, int totalProdutos) {
		if (!podeInserir(totalProdutos)) {
            System.out.println("Limite de produtos ATINGIDO!\n");
            return totalProdutos;
        }
		
        String desc = Teclado.lerString("Digite a DESCRIÇÃO do produto: ");
        double preco = Teclado.lerDouble("Digite o PREÇO do produto: ");
        int qtd = Teclado.lerInteiro("Digite a QUANTIDADE do produto no estoque: ");

        produtos[totalProdutos] = new Produto(desc, preco, qtd);
        System.out.println("Produto CADASTRADO com sucesso!\n");
        return totalProdutos + 1;
    }
	
	public static void alterarProduto(Produto[] produtos, int totalProdutos) {
        int idAlt = Teclado.lerInteiro("Digite o ID do produto a ALTERAR: ");
        
        for (int i=0; i<totalProdutos; i++) {
            if (produtos[i].getId() == idAlt) {
                produtos[i].setDescricao(Teclado.lerString("Digite uma NOVA descrição: "));
                produtos[i].setPreco(Teclado.lerDouble("Digite um NOVO preço: "));
                produtos[i].setQuantidade(Teclado.lerInteiro("Digite uma NOVA quantidade: "));
                System.out.println("Produto ATUALIZADO com sucesso.\n");
                return;
            }
        }
        System.out.println("Produto não encontrado...\n");
    }
	
	public static int excluirProduto(Produto[] produtos, int totalProdutos) {
		int idExc = Teclado.lerInteiro("Digite o ID do produto a EXCLUIR: ");
        for (int i=0; i<totalProdutos; i++) {
            if (produtos[i].getId() == idExc) {
                for (int j = i; j < totalProdutos - 1; j++) {
                    produtos[j] = produtos[j + 1];
                }
                produtos[--totalProdutos] = null;
                System.out.println("Produto EXCLUÍDO com sucesso.\n");
                return totalProdutos;
            }
        }
        System.out.println("Produto não encontrado...\n");
        return totalProdutos;
    }
	
	public static void consultarProdutos(Produto[] produtos, int totalProdutos) {
        System.out.println("\n--- Lista de Produtos ---");
        for (int i=0; i<totalProdutos; i++) {
            Produto p = produtos[i];
            System.out.printf("ID: %d | Descrição: %s | Preço: %.2f | Quantidade: %d\n",
                    p.getId(), p.getDescricao(), p.getPreco(), p.getQuantidade());
        }
        System.out.println("\n");
    }
}
