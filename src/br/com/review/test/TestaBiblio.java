package br.com.review.test;

import java.util.Scanner;

import br.com.review.controller.MethodsReview;
import br.com.review.model.ArqDados;
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
		String[][] BIBLIO_TITULO = new String[totalDisc][totalRefBiblio.length];
		if(semestre == 1) {
			String[][] matAutor = {{"BROWN, C. E.; PETRUSCA, R.", "FERNANDES, M."},
					{"LAUDON, Kenneth C.; Laudon J.P.","TURBAN, E; POTTER, R; RAINER JR, R K."},
					{"ASCENCIO, A. F. G, CAMPOS, E. A. V.","FORBELLONE, L. V., EBERSPACHER, H. F.","ZIVIANI, Nivio."},
					{"STALLINGS, W.","TANENBAUM, A. S.","TOCCI, R. J."},
					{"BATEMAN, T. S., SNELL, S. A. A.","CARAVANTES, G. R."},
					{"SCHEINERMAN, E.R.", "SULLIVAN, Michael; MIZRAHI, Abe."},
					{"CINTRA; CUNHA.","FERREIRA, Aurélio Buarque de Holanda.","MARTINS, D S; ZILBERKNOP."},
					{"HUGES, John et al.","MURPHY, Raymond.", "POSITIVO INFORMÁTICA.", "RICHARDS, Jack C."}};
			String[][] matTitulo = {{"Programando em ACCESS com VBA.","Desenvolvendo aplicações poderosas com Excel e VBA."},
					{"Sistemas de Informação. 5.ed. Rio de Janeiro:","Introdução a Sistemas de Informação."},					
					{"Fundamentos da Programação de Computadores: algoritmos, Pascal e C/C++ e Java.","Lógica de Programação: a construção de algoritmos e estruturas de dados.","Projeto de Algoritmos com Implementações em Pascal e C. 2.ed."},
					{"Arquitetura e organização de computadores. 5.ed.","Organização Estruturada de Computadores, 5ª Ed.","Sistemas digitais: princípios e aplicações. 10.ed."},
					{"Administração: o novo cenário competitivo.","Administração: Teoria e Processo."},
					{"Matemática Discreta: Uma Introdução. São Paulo:","Matemática Finita – Uma abordagem aplicada."},
					{"Nova gramática do Português contemporâneo de acordo com a nova ortografia.","Novo Dicionário Aurélio da Língua Portuguesa.","Português Instrumental: de acordo com as atuais normas da ABNT."},
					{"Business Result Business Result: Elementary Student Book Pack.","Essential Grammar in Use CD-Rom with answers. Third Edition.","Tell Me More – Nível Básico.","New Interchange: Student’s Book Intro. Third Edition."}};
			
			for (int i = 0; i < totalDisc; i++) {				
				for (int j = 0; j < totalRefBiblio[i]; j++) {					
					BIBLIO_AUTOR[i][j] = matAutor[i][j];
					BIBLIO_TITULO[i][j] = matTitulo[i][j];
				}
			}
		}
		
		
		for (int i = 0; i < totalDisc; i++) {
			System.out.println("= = = " + (i + 1) + "º disciplina: " + siglaDisc[i] + " = = = ");
			System.out.printf("%2s | %16s | %10.28s", "ID"," AUTOR ", " TÍTULO ");
			System.out.println();
			for (int j = 0; j < totalRefBiblio[i]; j++) {
				System.out.printf("%2s | %10S | %14.20s",(j + 1), BIBLIO_AUTOR[i][j], BIBLIO_TITULO[i][j]);
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
