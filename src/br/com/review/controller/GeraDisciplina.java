package br.com.review.controller;

import java.util.Scanner;

import br.com.review.model.Curso;

public class GeraDisciplina {
	public static Scanner scan = new Scanner(System.in);
	public static int SEMESTRE = 0;
	public static int CURSO = 0;
	public static int[] LISTA_DISCIPLINA;
	
	public static void escolheListaDisciplinas() {
		
		GeradorDatas.escolheDisciplinas();
		System.out.println("Escrever disciplinas em arquivo?\n"
				+ "1. Sim\n"
				+ "2. Não");
		int opcao = scan.nextInt();
		if(opcao == 1) {
			System.out.println("As seguintes disciplinas serão escritas no arquivo!");
		}else if(opcao == 2) {
			System.out.println("Disciplinas não serão gravadas em arquivo!");
		}else {
			System.out.println("Opção inválida!");
		}
		
		
	}
}
