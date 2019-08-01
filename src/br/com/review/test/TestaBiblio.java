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
		
		if(semestre == 1) {
			for (int i = 0; i < totalDisc; i++) {
				int contRef = totalRefBiblio[i];
				System.out.println("= = = " + (i+1) + ". "+ siglaDisc[i] + " = = = ");
				for (int j = 0; j < totalRefBiblio[i]; j++) {
					System.out.println((j+1)+"º bibliografia");
				}
				contRef = 0;
			}
		}
		
		
		// Bibliografia[] biblio = {"Alberto", bTitulo, bEditora, bAno};
	}

}
