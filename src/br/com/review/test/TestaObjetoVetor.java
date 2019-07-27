package br.com.review.test;

import java.util.Scanner;

import br.com.review.controller.GeradorDatas;
import br.com.review.model.*;

public class TestaObjetoVetor {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Semestre?");
		// Variável armazena num do semestre
		int semestre = scan.nextInt();
		
		int totalDisciplina = GeradorDatas.retornaTotalDisciplinas(semestre);
		int[] cargaHoraria = GeradorDatas.cargaHorariaSemestre(semestre);
		String[] nomeDisciplinas = GeradorDatas.disciplinasSemestral(semestre);
		
		System.out.println(semestre + "º Semestre");
		System.out.println("Qtd disciplinas: " + totalDisciplina);
		
		for (int i = 0; i < cargaHoraria.length; i++) {
			System.out.println((i+1) + "º. " + nomeDisciplinas[i] + " - " + cargaHoraria[i]);
		}
	}
}
