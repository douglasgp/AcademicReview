package br.com.review.controller;

import java.util.Scanner;

import br.com.review.model.Disciplinas;

public class GeraArqDisciplina {
	public static Scanner scan = new Scanner(System.in);

	public static int TAMANHO;
	
	public static void geraArgBibliografia() {
		int opcao = 0;
		do {
			System.out.println("Informe uma opção: ");
			System.out.println(" = = = = = = = = = = = = = = = MENU - BIBLIOGRAFIA = = = = = = = = = = = = = = = \n");
			System.out.printf("%14.18s | %-14.18s | %-20.25s | %-17.20s | %-17.10s | %s\n", "1. Adicionar disciplina",
					"2. Consultar Semestre ", "3. NÃO CONFIGURADO", "4. NÃO CONFIGURADO", "5. NÃO CONFIGURADO",
					"0. Voltar");
			opcao = scan.nextInt();

			System.out.println("Informe o semestre: ");
			int semestre = scan.nextInt();
			int qtdDisc = MethodsReview.retornaTotalDisciplinas(semestre);

			// int[] referencia = {00+semestre, 01+semestre};
			String[] sigla = MethodsReview.siglaDisc(semestre, qtdDisc);
			String[] denominacao = MethodsReview.denominacaoDisc(semestre, qtdDisc);
			int[] cargaHs = MethodsReview.cargaHorariaSemestre(semestre, qtdDisc);
		} while (opcao == 0);
	}
}
