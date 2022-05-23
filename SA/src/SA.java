import java.util.Scanner;

public class SA {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String situacao,professor, turma, disciplina;
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
		
		double notas[] = new double[(numAluno*numNota)];
		String alunos[] = new String[numAluno];
		
		while(true) {
			
		
		System.out.print("\nNome do " + (i + 1) + "° aluno: ");
		alunos[i] = sc.next();
		
		i++;
		
		for(int x = 1; x <= numNota; x++){
			System.out.print(x + "° nota: ");
			notas[contNota] = sc.nextDouble();
			contNota++;
		}
		
		if(i == numAluno) {
			break;
		}
		}
		
		
	}

}
