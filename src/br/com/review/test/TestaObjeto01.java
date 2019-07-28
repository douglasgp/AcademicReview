package br.com.review.test;

import java.util.Scanner;

import br.com.review.controller.GeradorDatas;
import br.com.review.controller.MethodsReview;
import br.com.review.model.Bibliografia;
import br.com.review.model.Disciplinas;

public class TestaObjeto01 {
	public static Scanner scan = new Scanner(System.in);
	public static int contBiblio = 0;
	public static void main(String[] args) {
		System.out.println("Informe o semestre: ");
		int semestre = scan.nextInt();

		int totalDiscSemestre = MethodsReview.retornaTotalDisciplinas(semestre);

		int horasDiscSemestre[] = MethodsReview.cargaHorariaSemestre(semestre, totalDiscSemestre);
		
		String[] nomesDisc = MethodsReview.disciplinasSemestral(semestre, totalDiscSemestre);
		
		Bibliografia[] biblio = new Bibliografia[contBiblio];
		
		
		System.out.println("Qtd disciplinas: " + totalDiscSemestre);
		for (int i = 0; i < horasDiscSemestre.length; i++) {
			System.out.println((i + 1) + ". " + nomesDisc[i] + " - "+ horasDiscSemestre[i]);
		}

	}

}
