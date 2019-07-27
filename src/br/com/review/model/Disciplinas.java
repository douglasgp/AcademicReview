package br.com.review.model;

public class Disciplinas {

	private int id;
	private String nomeDisciplina;
	private Professor professor;
	private int totalHoras;
	private String objetivo;
	private String ementa;
	private String Bibliografia;
	
	public Disciplinas(String nomeDisc, Professor prof, int totalHs, String obj, String emen, String biblio) {
		nomeDisciplina = nomeDisc;
		professor = prof;
		totalHoras = totalHs;
		objetivo = obj;
		ementa = emen;
		Bibliografia = biblio;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}

	public String getBibliografia() {
		return Bibliografia;
	}

	public void setBibliografia(String bibliografia) {
		Bibliografia = bibliografia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public int getTotalHoras() {
		return totalHoras;
	}

	public void setTotalHoras(int totalHoras) {
		this.totalHoras = totalHoras;
	}

}
