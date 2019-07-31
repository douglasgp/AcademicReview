package br.com.review.controller;

import java.util.Scanner;

import br.com.review.model.Disciplinas;

public class GeraArqDisciplina {
	public static Scanner scan = new Scanner(System.in);
	
	public static int TAMANHO;
	
	
	public static void main(String[] args) {
		System.out.println("Informe o semestre: ");
		int semestre = scan.nextInt();
		int qtdDisc = MethodsReview.retornaTotalDisciplinas(semestre);
		
		// int[] referencia = {00+semestre, 01+semestre};
		String[] sigla = MethodsReview.siglaDisc(semestre, qtdDisc);
		String[] denominacao = MethodsReview.denominacaoDisc(semestre, qtdDisc);
		int[] cargaHs = MethodsReview.cargaHorariaSemestre(semestre, qtdDisc);
				
		}
}
