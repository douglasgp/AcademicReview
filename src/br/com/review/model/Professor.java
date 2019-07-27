package br.com.review.model;

public class Professor {
	
	private int id;
	private String nomeProfessor;
	private Disciplinas disciplina;
	private String email;
	
	public Professor(String nomeProf, String eMail) {
		nomeProfessor = nomeProf;
		email = eMail;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public Disciplinas getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplinas disciplina) {
		this.disciplina = disciplina;
	}

}
