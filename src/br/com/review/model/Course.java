package br.com.review.model;

public class Course {
	
	private String courseName;
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setNomeCurso() {
		this.courseName = courseName;
	}
	
	public String toString() {
		return this.courseName;
	}
	
	public boolean equals(Object o) {
		Course outro = (Course)o;
		return this.courseName.contentEquals(outro.courseName);
	}

	public static int TOTAL_DISCIPLINA = 0;
	public static int LISTA_DISCIPLINA[] = new int[TOTAL_DISCIPLINA];

	public int[] getLISTA_DISCIPLINA() {
		return LISTA_DISCIPLINA;
	}

	public static void setLISTA_DISCIPLINA(int[] lISTA_DISCIPLINA) {
		LISTA_DISCIPLINA = lISTA_DISCIPLINA;
	}

	public int getTOTAL_DISCIPLINA() {
		return TOTAL_DISCIPLINA;
	}

	public void setTOTAL_DISCIPLINA(int TOTAL_DISCIPLINA) {
		Course.TOTAL_DISCIPLINA = TOTAL_DISCIPLINA;
	}

}
