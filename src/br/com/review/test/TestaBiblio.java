package br.com.review.test;

import java.util.Scanner;

import br.com.review.controller.MethodsReview;
import br.com.review.model.Bibliografia;

public class TestaBiblio {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Informe o semestre: ");
		int semestre = scan.nextInt();

		int totalDisc = MethodsReview.retornaTotalDisciplinas(semestre);
		String[] siglaDisc = MethodsReview.siglaDisc(semestre, totalDisc);
		int[] totalRefBiblio = MethodsReview.qtdRefBiblio(semestre, totalDisc);
		String[][] vetAutor = new String[totalDisc][totalRefBiblio.length];
		// {{"BROWN, C. E.; PETRUSCA, R."," LAUDON, Kenneth C.; Laudon J.P.","ASCENCIO, A. F. G, CAMPOS, E. A. V."},{"FERNANDES, M","POTTER, R; RAINER JR, R K.","FORBELLONE, L. V., EBERSPACHER, H. F."},{"ZIVIANI, Nivio."},{""}};
		
		for (int i = 0; i < totalDisc; i++) {
			System.out.println("= = = " + (i + 1) + "º disciplina: " + siglaDisc[i] + " = = = ");
			for (int j = 0; j < totalRefBiblio[j]; j++) {
				System.out.println((j + 1) + "º Autor: ");
				
			}
		}
		
		for (int i = 0; i < totalDisc; i++) {
			System.out.println("Disciplina: " + siglaDisc[i]);
			for (int j = 0; j < totalRefBiblio[i]; j++) {
				System.out.println(vetAutor[i][j]);
			}
			System.out.println();
		}

		// Bibliografia[] biblio = {"Alberto", bTitulo, bEditora, bAno};
	}

}
