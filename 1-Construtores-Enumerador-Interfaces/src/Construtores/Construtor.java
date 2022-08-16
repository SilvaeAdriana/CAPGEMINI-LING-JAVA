package Construtores;

import Construtores.Aluno.STATUS;

public class Construtor {

	public static void main(String[] args) {
		// passando os dados atraves do construtor com sobrecarga
		Aluno alu = new Aluno( 8,  8,  8);
		// calculando a media
		double mediaAlunoFinal = alu.calcularMediaAluno();
		
		// definindo situacao do aluno
		if (mediaAlunoFinal < 6 ) {
			alu.situacaoAluno = STATUS.REPROVADO;
		} else {
			alu.situacaoAluno = STATUS.APROVADO;
		}
		
		// imprimindo situacao do aluno
		System.out.println("A media do aluno eh : " + alu.calcularMediaAluno() + " e o aluno esta " + alu.situacaoAluno);
	}
}