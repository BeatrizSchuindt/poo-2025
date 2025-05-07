
public class OperacoesAnimal {
	//criar o vetor de animal
	Animal[] animal = new Animal[5];
	int contador_animal=0, contador_codigo=0;
	
	//função de cadastrar
	public void cadastrarAnimal() {
		Animal a = new Animal();
		
		if (contador_animal == 5) {
			System.out.println("O sistema chegou ao LIMITE!\n");
		} else {
			contador_codigo++;
			
			a.codigo = contador_codigo;
			a.nome = Teclado.lerString("Digite o NOME do animal: ");
			a.especie = Teclado.lerString("Digite a ESPECIE do animal: ");
			
			animal[contador_animal] = a;
			contador_animal++;
			
			System.out.println("O animal " + contador_codigo + " foi CADASTRADO com sucesso!\n");
		}
	}
	
	//função de atualizar
	public void atualizarAnimal() {
		int busca_cod=0;
		
		if (contador_animal == 0) {
			System.out.println("NENHUM animal cadastrado... Cadastre algum!\n");
		} else {
			busca_cod = Teclado.lerInteiro("Digite o CÓDIGO do animal que você deseja ATUALIZAR: ");
		
			for (int i=0; i<5; i++) {
				if(busca_cod == animal[i].codigo) {
					animal[i].nome = Teclado.lerString("Digite o NOME do animal: ");
					animal[i].especie = Teclado.lerString("Digite a ESPECIE do animal: ");
				}
			}
			
			System.out.println("O animal " + contador_codigo + " foi ATUALIZADO com sucesso!\n");
		}
	}
	
	//função de imprimir
	public void imprimirAnimais() {
		if (contador_animal == 0) {
			System.out.println("NENHUM animal cadastrado... Cadastre algum!\n");
		} else {
			for (int i=0; i<5; i++) {
				if (animal[i] == null) {
					continue;
				} else {
					System.out.println("--------------------------");
					System.out.println("CÓDIGO: " + animal[i].codigo);
					System.out.println("NOME: " + animal[i].nome);
					System.out.println("ESPÉCIE: " + animal[i].especie);
				}
			}
			System.out.println("\n");
		}
	}
	
	//função de excluir
	public void excluirAnimal() {
		int busca_cod=0;
		
		if (contador_animal == 0) {
			System.out.println("NENHUM animal cadastrado... Cadastre algum!\n");
		} else {
			busca_cod = Teclado.lerInteiro("Digite o CÓDIGO do animal que você deseja EXCLUIR: ");
		
			for (int i = 0; i < 5; i++) {
			    if (animal[i] != null && busca_cod == animal[i].codigo) {
			        animal[i] = null;
			        contador_animal--;
			        System.out.println("O animal " + busca_cod + " foi EXCLUÍDO com sucesso!\n");
			        return;
			    }
			}
			System.out.println("Nenhum animal com o código " + busca_cod + " foi encontrado.\n");
		}
	}
}
