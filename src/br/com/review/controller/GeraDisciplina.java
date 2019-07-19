package br.com.review.controller;

import java.util.Scanner;

import br.com.review.model.Curso;

public class GeraDisciplina {
	public static Scanner scan = new Scanner(System.in);
	public static int SEMESTRE = 0;
	public static int CURSO = 0;
	public static int[] LISTA_DISCIPLINA;
	
	public static int escolheListaDisciplinas(int opcao) {
		
		
		Curso.TOTAL_DISCIPLINA = GeradorDatas.retornaTotalDisciplinas(SEMESTRE);
		System.out.println("Total de disciplinas: " + Curso.TOTAL_DISCIPLINA);
		
		//-- LISTA_DISCIPLINA = GeradorDatas.cargaHorariaSemestre(SEMESTRE);
		
		String listaDisciplina[] = GeradorDatas.disciplinasSemestral(SEMESTRE);
		
		System.out.println("Informe o curso: ");
		for (int i = 0; i < listaDisciplina.length; i++) {
			System.out.println((i+1)+". " + listaDisciplina[i]);
		}
		CURSO = scan.nextInt();
		
		return CURSO;
	}
}
