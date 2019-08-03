package br.com.review.test;

import java.util.Scanner;

import br.com.review.controller.MethodsReview;
import br.com.review.model.Bibliografia;

public class TestaBiblio {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		insereBiblio();
	}
	
	public static void insereBiblio() {
		System.out.println("Informe o semestre: ");
		int semestre = scan.nextInt();

		int totalDisc = MethodsReview.retornaTotalDisciplinas(semestre);
		String[] siglaDisc = MethodsReview.siglaDisc(semestre, totalDisc);
		int[] totalRefBiblio = MethodsReview.qtdRefBiblio(semestre, totalDisc);
		// String[][] vetAutor = new String[totalDisc][totalRefBiblio.length];
		String[][] BIBLIO_AUTOR = new String[totalDisc][totalRefBiblio.length];
		if(semestre == 1) {
			String[][] matAutor = {{"BROWN, C. E.; PETRUSCA, R.", "FERNANDES, M."},
					{"LAUDON, Kenneth C.; Laudon J.P.","TURBAN, E; POTTER, R; RAINER JR, R K."},
					{"ASCENCIO, A. F. G, CAMPOS, E. A. V.","FORBELLONE, L. V., EBERSPACHER, H. F.","ZIVIANI, Nivio."},
					{"STALLINGS, W.","TANENBAUM, A. S.","TOCCI, R. J."},
					{"BATEMAN, T. S., SNELL, S. A. A.","CARAVANTES, G. R."},
					{"SCHEINERMAN, E.R.", "SULLIVAN, Michael; MIZRAHI, Abe."},
					{"CINTRA; CUNHA.","FERREIRA, Aurélio Buarque de Holanda.","MARTINS, D S; ZILBERKNOP."},
					{"HUGES, John et al.","MURPHY, Raymond.", "POSITIVO INFORMÁTICA.", "RICHARDS, Jack C."}};
			for (int i = 0; i < totalDisc; i++) {				
				for (int j = 0; j < totalRefBiblio[i]; j++) {					
					BIBLIO_AUTOR[i][j] = matAutor[i][j];
				}
			}
		}
		
		
		for (int i = 0; i < totalDisc; i++) {
			System.out.println("= = = " + (i + 1) + "º disciplina: " + siglaDisc[i] + " = = = ");
			System.out.printf("%-1s | %10.28s   ", "> ID < ","> AUTOR <");
			System.out.println();
			for (int j = 0; j < totalRefBiblio[i]; j++) {
				System.out.printf("%7s | %14.10S ",(j + 1), BIBLIO_AUTOR[i][j]);
				System.out.println();
			}
			System.out.println();
		}
		
		/*
		for (int i = 0; i < totalDisc; i++) {
			System.out.println("Disciplina: " + siglaDisc[i]);
			for (int j = 0; j < totalRefBiblio[i]; j++) {
				System.out.println(vetAutor[i][j]);
			}
			System.out.println();
		}
		Bibliografia[] biblio = {"Alberto", bTitulo, bEditora, bAno};*/
	}

	public static void testaExibeAutor() {
		String[][] matAutor = {{"BROWN, C. E.; PETRUSCA, R.", "FERNANDES, M."},
				{"LAUDON, Kenneth C.; Laudon J.P.","TURBAN, E; POTTER, R; RAINER JR, R K."},
				{"ASCENCIO, A. F. G, CAMPOS, E. A. V.","FORBELLONE, L. V., EBERSPACHER, H. F.","ZIVIANI, Nivio."},
				{"STALLINGS, W.","TANENBAUM, A. S.","TOCCI, R. J."},
				{"BATEMAN, T. S., SNELL, S. A. A.","CARAVANTES, G. R."},
				{"SCHEINERMAN, E.R.", "SULLIVAN, Michael; MIZRAHI, Abe."},
				{"CINTRA; CUNHA.","FERREIRA, Aurélio Buarque de Holanda.","MARTINS, D S; ZILBERKNOP."},
				{"HUGES, John et al.","MURPHY, Raymond.", "POSITIVO INFORMÁTICA.", "RICHARDS, Jack C."}};
		
		for (int i = 0; i < matAutor.length; i++) {
			System.out.println((i+1)+" disciplina");
			String cont = matAutor[i][i];
			for (int j = 0; j < matAutor.length; j++) {
				System.out.println(matAutor[i][j]);
			}
		}
	}
}
