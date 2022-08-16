package Construtores;

public class Aluno {
	private double nota1;
	private double nota2;
	private double nota3;
	STATUS situacaoAluno;
		
	//os construtores são os responsáveis por criar o objeto em memória,
	// ou seja, instanciar a classe que foi definida. Eles são obrigatórios
	//construtor com sobrecarga: mais de um parametro
	public Aluno(double nota1, double nota2, double nota3) {
		
		this.nota1 = nota1;//colocando em this,o conteúdo das variávies
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	// DEFININDO UM ENUMERADOR
	public enum STATUS {//enumerador, funciona no mesmo raciocinio do switch: 2 status previstos
		// em casos de opcoes com pouca diversidade
		 APROVADO,
	     REPROVADO
	}

	// Metodo para calcular media do aluno
	public double calcularMediaAluno() {//esse metodo nao recebe nada, pq utiliza os dados do this
		//como o constuttor ja foi esquematizado la em cima, aqui embaixo vai desse jeito
		double mediaAluno = 0;
		// calculo da media
		mediaAluno = (this.nota1 + this.nota2 + this.nota3) / 3;
		return mediaAluno;
	}
}
