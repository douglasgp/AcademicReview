package br.com.review.test;

import java.util.Scanner;

import br.com.review.controller.GeradorDatas;
import br.com.review.controller.MethodsReview;
import br.com.review.model.Bibliografia;
import br.com.review.model.Disciplinas;

public class TestaObjeto01 {
	public static Scanner scan = new Scanner(System.in);
	public static int TOTAL_HORAS_SEMESTRE = 0;
	
	public static void main(String[] args) {
		menuPrincipal();
	}
	
	public static void carregaSemestre() {
		System.out.println("Informe o semestre: ");
		int semestre = scan.nextInt();

		int totalDiscSemestre = MethodsReview.retornaTotalDisciplinas(semestre);

		int horasDiscSemestre[] = MethodsReview.cargaHorariaSemestre(semestre, totalDiscSemestre);
		
		String[] nomesDisc = MethodsReview.disciplinasSemestral(semestre, totalDiscSemestre);
		
		System.out.println("Qtd disciplinas: " + totalDiscSemestre);
		for (int i = 0; i < horasDiscSemestre.length; i++) {
			System.out.println((i + 1) + ". " + nomesDisc[i] + " - " + horasDiscSemestre[i]);
			TOTAL_HORAS_SEMESTRE += horasDiscSemestre[i];
		}
	}
	
	public static void menuPrincipal() {
		int opcao = 0;
		do {
			System.out.println(" = = = = = = = = = = = = = = = MENU PRINCIPAL = = = = = = = = = = = = = = = ");
			System.out.printf("%14.12s | %-14.13s | %-20.25s | %-17.20s | %-17.10s | %s\n", "1. Registrar Aula","2. NÃO CONFIGURADO ", "3. NÃO CONFIGURADO", "4. NÃO CONFIGURADO", "5. NÃO CONFIGURADO", "0. Finalizar");
			opcao = scan.nextInt();
			switch (opcao) {
			case 1:
				carregaSemestre();
				break;
			case 2:
				System.out.println("Não configurado");
				break;
			default:
				break;
			}
		} while (opcao == 0);
	}

}
