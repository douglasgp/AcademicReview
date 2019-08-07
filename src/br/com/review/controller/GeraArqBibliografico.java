package br.com.review.controller;

import java.util.Scanner;

import br.com.review.model.Bibliografia;

public class GeraArqBibliografico {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Informe o semestre: ");
		int semestre = scan.nextInt();

		int totalDisc = MethodsReview.retornaTotalDisciplinas(semestre);
		String[] siglaDisc = MethodsReview.siglaDisc(semestre, totalDisc);
		int[] totalRefBiblio = MethodsReview.qtdRefBiblio(semestre, totalDisc);
		// String[][] vetAutor = new String[totalDisc][totalRefBiblio.length];
		String[][] BIBLIO_AUTOR = new String[totalDisc][totalRefBiblio.length];
		String[][] BIBLIO_TITULO = new String[totalDisc][totalRefBiblio.length];
		String[][] BIBLIO_EDITORA = new String[totalDisc][totalRefBiblio.length];
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
			String[][] matEditora = {{"Alta Books","Visual Books"},
					{"LTC","Campus"},
					{"Longman","Prentice Hall","Thomson Pioneira"},
					{"Prentice-Hall Brasil","Prentice Hall","Pearson Brasil"},
					{"S P: Atlas","São Paulo: Pear"},
					{"Cengage Learning","LTC"},
					{"Lexikon","Positivo","Atlas"},
					{"Oxford Univ","Cambridge","Curitiba","Cambridge University Press"}};
			for (int i = 0; i < totalDisc; i++) {				
				for (int j = 0; j < totalRefBiblio[i]; j++) {					
					BIBLIO_AUTOR[i][j] = matAutor[i][j];
					BIBLIO_TITULO[i][j] = matTitulo[i][j];
					BIBLIO_EDITORA[i][j] = matEditora[i][j];
				}
			}
		}
		
		
		for (int i = 0; i < totalDisc; i++) {
			System.out.println("= = = " + (i + 1) + "º disciplina: " + siglaDisc[i] + " = = = ");
			System.out.printf("%2s | %16s | %14s | %15s", "ID"," AUTOR ", " TÍTULO ", " EDITORA ");
			System.out.println();
			for (int j = 0; j < totalRefBiblio[i]; j++) {
				System.out.printf("%2s | %16S | %14.310s | %15s",(j + 1), BIBLIO_AUTOR[i][j], BIBLIO_TITULO[i][j], BIBLIO_EDITORA[i][j]);
				System.out.println();
			}
			System.out.println();
		}
		
	}
	// Armazena ref. bibliográvias em variáveis para gravação em arquivo
	public static void insereBiblio1(int semestre) {
		
		int totalDisc = MethodsReview.retornaTotalDisciplinas(semestre);
		String[] siglaDisc = MethodsReview.siglaDisc(semestre, totalDisc);
		int[] totalRefBiblio = MethodsReview.qtdRefBiblio(semestre, totalDisc);
		// String[][] vetAutor = new String[totalDisc][totalRefBiblio.length];
		String[][] BIBLIO_AUTOR = new String[totalDisc][totalRefBiblio.length];
		String[][] BIBLIO_TITULO = new String[totalDisc][totalRefBiblio.length];
		Bibliografia MAT_AUTOR = new Bibliografia();
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
			String[][] matEditora = {{"Alta Books","Visual Books,"},
					{"LTC","Campus"},
					{"Longman","Prentice Hall","Thomson Pioneira"},
					{"Prentice-Hall Brasil","Prentice Hall","Pearson Brasil"},
					{"S P: Atlas","São Paulo: Pear"},
					{"Cengage Learning","LTC,"},
					{"Lexikon","Positivo","Atlas"},
					{"Oxford Univ","Cambridge","Curitiba","Cambridge University Press"}};
			int[][] matAno = {{2006, 2005},{2004, 2007},{2007,2005,2004},{2008,2007,2007},{2006,0},
					{2008,2006},{2009,2009,2009},{2009,2007,2007,2008}};
			MAT_AUTOR.setAutor(matAutor);
			MAT_AUTOR.setTitulo(matTitulo);
			MAT_AUTOR.setEditora(matEditora);
			MAT_AUTOR.setAno(matAno);
		}
		
		int pag = totalDisc;
		for (int i = 0; i < totalDisc; i++) {
			System.out.println((i + 1) + "º disciplina: " + siglaDisc[i] + " = = = ");
			System.out.printf("%2s | %-38.40S | %-46.45s | %-26.30S | %s", "ID"," AUTOR ", " TÍTULO ", " EDITORA ", " ANO ");
			System.out.println();
			for (int j = 0; j < totalRefBiblio[i]; j++) {
				System.out.printf("%2s | %-38.40S | %-46.45S | %-26.30S | %s",(j + 1), MAT_AUTOR.getAutor()[i][j], MAT_AUTOR.getTitulo()[i][j], MAT_AUTOR.getEditora()[i][j], MAT_AUTOR.getAno()[i][j]);
				System.out.println();
			}
			System.out.println();
		}
		
	}

	
}
