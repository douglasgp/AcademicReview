package br.com.review.model;

public class Curso {

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
		Curso.TOTAL_DISCIPLINA = TOTAL_DISCIPLINA;
	}

}
