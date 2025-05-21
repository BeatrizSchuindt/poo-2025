package br.com.compracerta.sistema;

import br.com.compracerta.modelo.Produto;
import br.com.compracerta.util.Teclado;

public class SistemaProduto {
	public static void main(String[] args) {
		Produto[] produtos = new Produto[10];
	    int totalProdutos = 0;
	    int opcao;
		
	    do {
	        System.out.println("---- SISTEMAS DE PRODUTOS ----");
	        System.out.println("1 - Inserir Produto");
	        System.out.println("2 - Alterar Produto");
	        System.out.println("3 - Excluir Produto");
	        System.out.println("4 - Consultar Produtos");
	        System.out.println("5 - Calcular Valor Total em Estoque");
	        System.out.println("0 - Sair");
	        opcao = Teclado.lerInteiro("Digite uma opção: ");
	        
	        switch (opcao) {
	        case 1:
	        	totalProdutos = FuncoesSistema.inserirProduto(produtos, totalProdutos);
	            break;
	        
	        case 2:
	            FuncoesSistema.alterarProduto(produtos, totalProdutos);
	            break;
	            
	        case 3:
	            totalProdutos = FuncoesSistema.excluirProduto(produtos, totalProdutos);
	            break;
	            
	        case 4:
	            FuncoesSistema.consultarProdutos(produtos, totalProdutos);
	            break;
	            
	        case 5:
	            double total = Produto.calcularValorTotalEstoque(produtos, totalProdutos);
	            System.out.printf("Valor total em estoque: R$ %.2f\n", total);
	            System.out.println("\n");
	            break;
	        
	        case 0:
	            System.out.println("Saindo... Xauuu");
	            break;
	        
	        default:
	            System.out.println("Opção inválida.");
	        }    
	    } while (opcao != 0);
	}
}