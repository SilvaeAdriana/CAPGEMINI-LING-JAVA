import javax.swing.JOptionPane;

public class Matrizes {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo que solicite ao usuario a entrada de 4 notas 
		 * para cada aluno, calcular a media dos alunos e exibir em tela. 
		 * Ao final mostrar a media da turma. 
		 * Ao lado da media do aluno deve seguir a seguinte regra de neg�cio.
		 * Se media >= 7,5               Aluno Aprovado
		 * Se media >= 5,5 e <7,5   Aluno em Recuperacao
		 * Se media  < 5,5                Aluno Reprovado
		*/
		// Vetor dos alunos
		String [] alunos = {"JOAO","JOSE","MARIA"};
	
		// Matriz das notas
		float [][] notas = new float[3][4];

		//cada linha representa um aluno e suas notas
		
		// para controlar o somatorio das notas de cada aluno
		// para calcular a media do aluno
		float somaNotas, mediaAluno;
		// par armazenar o status do aluno e usar para imprimir o boletim depois
		String statusAluno;
		
		// informar as notas dos alunos
		// laco externo para associar aluno a nota
		for (int i = 0; i < 3; i++) {
			System.out.println("Aluno : " + alunos[i]);
			// laco interno para informar as notas de cada aluno
			somaNotas = 0;
			mediaAluno = 0;
			for (int j = 0; j < 4; j++) {
				notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota numero " + (j+1) + " do aluno " + alunos[i]));
			    somaNotas = somaNotas + notas[i][j];
			}
			mediaAluno = somaNotas / 4;
			if	(mediaAluno < 5.5) {
				statusAluno = "REPROVADO";
			} else if (mediaAluno >= 5.5 && mediaAluno <= 7.5) {
				statusAluno = "EM RECUPERA��O";
			} else {
				statusAluno = "APROVADO";
			}
			// impress�o do boletim
			System.out.println("\n************ BOLETIM *************");
			System.out.println("Aluno.: " + alunos[i]);
			System.out.println("Notas");
			for (int j1 = 0; j1 < 4; j1++) {
				System.out.println((j1+1) + " - " + notas[i][j1]);
			}
			System.out.println("M�dia ..: " + mediaAluno + " - " + statusAluno);
			System.out.println("");
		}
	}
}
