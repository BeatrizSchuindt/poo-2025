
public class TesteAluno {
	
    public static void main(String[] args) {
    	
        int tamanho_turma = Teclado.lerInteiro("Digite o número de alunos na turma: ");
        Aluno[] turma = new Aluno[tamanho_turma];

        for (int i = 0; i < tamanho_turma; i++) {
            turma[i] = new Aluno(); 
            turma[i].nome = Teclado.lerString("Digite o nome do aluno " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                turma[i].notas[j] = Teclado.lerDouble("Digite a nota " + (j + 1) + " do aluno " + (i + 1) + ":");
            }
        }

        Secretaria.relatorioAluno(turma);
    }
}


