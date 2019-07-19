package br.com.review.controller;

import java.util.Scanner;

import br.com.review.model.Disciplinas;

public class GeraArqDisciplina {
	public static Scanner scan = new Scanner(System.in);
	public static Disciplinas disc = new Disciplinas();
	public static int TOTAL_DISC_SEMESTRE = 0;
	public static String[] OBJ_DISC = new String[TOTAL_DISC_SEMESTRE];
	public static String[] EMENTA_DISC = new String[TOTAL_DISC_SEMESTRE];
	public static String[] BIBLIO_DISC = new String[TOTAL_DISC_SEMESTRE];
	
	public static int[] CARGA_DISC = new int[TOTAL_DISC_SEMESTRE];
	public static String[] NOME_DISC = new String[TOTAL_DISC_SEMESTRE];
	
	public static void disciplinaSemestre() {
		System.out.println("Informe o semestre: ");
		int numSem = scan.nextInt();
		disc.setSemestre(numSem);
		
		// Variável para armazenar o total de disciplinas do semestre escolhido.
		TOTAL_DISC_SEMESTRE = GeradorDatas.retornaTotalDisciplinas(disc.getSemestre());
		System.out.println("Total disciplinas: " + TOTAL_DISC_SEMESTRE);
		// Vetor contendo as cargas horárias de cada disciplina do semestre escolhido
		int cargaDisciplina[] = GeradorDatas.cargaHorariaSemestre(disc.getSemestre());
		System.out.println("Tamanho vetor CARGA DISCIPLINA: " + cargaDisciplina.length);
		// Vetor contendo o nome de cada disciplina do semestre escolhido.
		//-- String nomeDisciplina[] = GeradorDatas.disciplinasSemestral(disc.getSemestre());
		/*
		System.out.println("= = = = = = " + disc.getSemestre() + " = = = = = = = = ");
		System.out.println(" = = = = = = = = = = = = = = = = = = = = = = = = = = = ");
		for (int i = 0; i < disc.getSemestre(); i++) {
			// System.out.println((i+1)+"º Disciplina:" + nomeDisciplina[i]);
			System.out.println("Carga horária: " + cargaDisciplina[i]);
			System.out.println("Informe OBJETIVO: ");
			OBJ_DISC[i] = scan.next();
			System.out.println("Informe EMENTA: ");
			EMENTA_DISC[i] = scan.next();
			System.out.println("Informe BIBLIOGRAFIA: ");
			BIBLIO_DISC[i] = scan.next();
		}*/
		
		
	}
}
