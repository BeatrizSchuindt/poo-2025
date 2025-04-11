
public class TesteVetor {
	
	public static void main(String[] args) {
		int[] vetor = new int[5];
		
		for(int i=0; i<vetor.length; i++) {
			vetor[i] = Teclado.lerInteiro("Digite um número: ");
		}
		
		int num_maior=0, num_menor=0;
		num_maior = vetor[0];
		num_menor = vetor[0];
				
		for (int i=0; i<vetor.length; i++) {
			if (vetor[i] > num_maior) {
				num_maior = vetor[i];
			} 
				
			if (vetor[i] < num_menor) {
				num_menor = vetor[i];
			}
		}
		
		System.out.println("O número maior é: " + num_maior);
		System.out.println("O número menor é: " + num_menor);
	}
}
