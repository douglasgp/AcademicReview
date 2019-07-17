package br.com.review.model;

public class Aluno {

	private int id;
	private int nomeAluno;
	private String email;
	private String nomeCurso;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(int nomeAluno) {
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

}
