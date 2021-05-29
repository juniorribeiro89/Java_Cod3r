package modulodois;

import java.util.Scanner;

public class AlunosNotasExercicio {

	public static void main(String[] args) {

		System.out.print("Quantidade de Alunos? ");
		Scanner entrada = new Scanner(System.in);
		int qntAlunos = entrada.nextInt();

		System.out.print("Quantida de Notas: ");
		int qntNotas = entrada.nextInt();
		
		double totalNota = 0;
		double[][] notasTurma = new double[qntAlunos][qntNotas];
		for (int a = 0; a< notasTurma.length; a++) {	// Percorre o array
			for (int n = 0; n < notasTurma[a].length; n++) { // percorre cada elemento
				
				System.out.printf("Informe o Aluno %d, e a nota %d ",a+1,n+1);
				notasTurma[a][n] = entrada.nextDouble();
				totalNota = totalNota + notasTurma[a][n]; 
			}
		}
		
		double media = totalNota / (qntAlunos * qntNotas);
		System.out.println("Media da Turma; " + media);

		/*
		 * for(double[] notasAluno: notasTurma) {
		 * System.out.println(Arrays.toString(notasAluno));
		 * 
		 * }
		 */
		entrada.close();
	}

}
