package modulodois;

import java.util.Scanner;

public class DesafioNotas {

	public static void main(String[] args) {


		System.out.println("Quantidade de Notas: ");
		
		//Entrada pelo teclado
		Scanner teclado = new Scanner(System.in);
		
		//armazenamento da entrada pelo teclado em uma variavel
		int qntNotas = teclado.nextInt();
		
		//Criando um array com a variave que recebeu as notas
		double[] notas = new double[qntNotas];
		
		//for pra interação
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informa as notas " +(i + 1)+": ");
			notas[i] = teclado.nextDouble();
		}
		
		double totalNotas = 0;
		for (double nota : notas) {
			totalNotas += nota;
		}
		double media = totalNotas / notas.length;
		System.out.println("Media é : " + media);
		
		teclado.close();
	}

}
