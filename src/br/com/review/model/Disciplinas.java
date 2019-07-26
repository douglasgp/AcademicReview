package br.com.review.model;

public class Disciplinas {

	public int id;
	public String nomeDisciplina;
	public int semestre;
	public Professor professor;
	public int totalHoras;
	public int totalDiscSemestre;
	
	public int[] cargaHoraria = new int[totalDiscSemestre];

	public int[] getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int[] cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public int getTotalDiscSemestre() {
		return totalDiscSemestre;
	}

	public void setTotalDiscSemestre(int totalDiscSemestre) {
		this.totalDiscSemestre = totalDiscSemestre;
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

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
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
