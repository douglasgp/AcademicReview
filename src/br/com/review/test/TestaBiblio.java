package br.com.review.test;

import java.util.Scanner;

import br.com.review.controller.MethodsReview;
import br.com.review.model.ArqDados;
import br.com.review.model.Bibliografia;

public class TestaBiblio {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
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
