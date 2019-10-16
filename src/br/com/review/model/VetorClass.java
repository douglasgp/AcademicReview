package br.com.review.model;

public class VetorClass {
	
	private Aluno[] alunos = new Aluno[100];
	// guarda a qtd de alunos no vetor
	private int totalDeAlunos = 0;
	
	public void adiciona(Aluno aluno) {
		this.alunos[this.totalDeAlunos] = aluno;
		this.totalDeAlunos++;
	}

}
