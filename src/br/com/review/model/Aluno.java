package br.com.review.model;

public class Aluno {

	private int id;
	private String nomeAluno;
	private String email;
	private String nomeCurso;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	/* Exibe alunos */
	public String toString() {
		return this.nomeAluno;
	}

	/* Compara objetos utilizando nome do aluno como critério */
	public boolean equals(Object o) {
		Aluno outro = (Aluno) o;
		return this.nomeAluno.contentEquals(outro.nomeAluno);
	}

}
