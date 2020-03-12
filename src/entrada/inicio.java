package entrada;

import java.util.Locale;
import java.util.Scanner;

import entidade.cadastro;

public class inicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("digite a quantidade de alunos:");
		int n = scan.nextInt();

		cadastro[] vect = new cadastro[n];

		for (int i = 0; i < vect.length; i++) {
			scan.nextLine();
			System.out.println("digite o nome do aluno:");
			String nome = scan.nextLine();
			System.out.println("digite a nota do aluno:");
			double nota = scan.nextDouble();

			vect[i] = new cadastro(nome, nota);

			if (nota <= 6) {
				// visualização do vetor caso reprovado.
				System.out.println(vect[i]);
				System.out.println("situação:" + "reprovado");

			} else {
				// visualização do vetor caso aprovado.
				System.out.println(vect[i]);
				System.out.println("situação:" + "aprovado");

			}

			

		}
		scan.close();
	}

}
