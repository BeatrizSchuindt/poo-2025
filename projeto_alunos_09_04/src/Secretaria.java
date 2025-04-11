
public class Secretaria {
    public static double calculaMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public static void relatorioAluno(Aluno[] turma) {
        System.out.println("\n--- RELATÓRIO DA TURMA ---");
        for (Aluno aluno : turma) {
            System.out.println("Aluno: " + aluno.nome);
            
            System.out.print("Notas: ");
            for (double nota : aluno.notas) {
                System.out.print(nota + " ");
            }
            
            double media = calculaMedia(aluno.notas);
            System.out.printf("\nMédia: %.2f\n", media);
            System.out.println("------------------------");
        }
    }
}