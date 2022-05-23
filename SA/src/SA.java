import java.util.Scanner;

public class SA {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String situacao, professor, turma, disciplina;
		int numAluno, numNota, i = 0, contNota = 0;
		double media;

		System.out.print("Diga o nome do professor: ");
		professor = sc.next();

		System.out.print("Diga o nome/sigla da turma: ");
		turma = sc.next();

		System.out.print("Diga a disciplina que leciona para esta turma: ");
		disciplina = sc.next();

		System.out.print("Informe o número de alunos: ");
		numAluno = sc.nextInt();

		System.out.print("Informe o número de avaliações aplicadas: ");
		numNota = sc.nextInt();

		double notas[] = new double[(numAluno * numNota)];
		String alunos[] = new String[numAluno];

		while (true) {

			System.out.print("\nNome do " + (i + 1) + "° aluno: ");
			alunos[i] = sc.next();

			i++;

			for (int x = 1; x <= numNota; x++) {
				System.out.print(x + "° nota: ");
				notas[contNota] = sc.nextDouble();
				contNota++;
			}

			if (i == numAluno) {
				break;
			}

		}

		System.out.println("\nProfessor: " + professor);
		System.out.println("Disciplina: " + disciplina);
		System.out.println("Turma: " + turma);

		i = 0;
		contNota = 0;

		while (true) {
			System.out.println("-------------");
			System.out.println("Aluno " + (i + 1) + ": " + alunos[i]);

			i++;
			media = 0;

			for (int x = 1; x <= numNota; x++) {
				System.out.println("Nota " + x + ": " + notas[contNota]);
				media += notas[contNota];
				contNota++;
			}

			media /= numNota;

			if (media < 5) {
				situacao = "Reprovado";
			} else if (media < 7) {
				situacao = "Em exame";
			} else {
				situacao = "Aprovado";
			}

			System.out.printf("Média: %.2f", media);
			System.out.println("\nSituação: " + situacao);

			if (i == numAluno) {
				break;
			}

		}

	}

}
