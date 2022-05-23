import java.util.Scanner;

public class SA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String professor, turma, disciplina;
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
		
		double notas[] = new double[numAluno*numNota];
		
		String alunos [] = new String[numAluno];
		
		
		
		sc.close();
	}

}
