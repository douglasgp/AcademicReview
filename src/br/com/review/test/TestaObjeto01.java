package br.com.review.test;

import java.util.Scanner;

import br.com.review.controller.GeradorDatas;
import br.com.review.controller.MethodsReview;
import br.com.review.model.Bibliografia;
import br.com.review.model.Disciplinas;

public class TestaObjeto01 {
	public static Scanner scan = new Scanner(System.in);
	public static int TOTAL_HORAS_SEMESTRE = 0;
	public static int TOTAL_DISCIPLINAS = 0;
	public static String[] NOMES_DISCIPLINAS = new String[TOTAL_DISCIPLINAS];
	public static int[] DISC_SEM_ATUAL = new int[TOTAL_DISCIPLINAS];
	
	public static void main(String[] args) {
		menuPrincipal();
	}
	public static void exibeSemestre() {
		if(NOMES_DISCIPLINAS.length > 0) {
			for (int i = 0; i < DISC_SEM_ATUAL.length; i++) {
				System.out.println((i+1)+". " + NOMES_DISCIPLINAS[i]);
			}
		}else {
			System.out.println("Semestre vazio!\nAdicione alguma disciplina ao Semestre!");
			menuPrincipal();
		}
	}
	public static void carregaSemestre() {
		System.out.println("Informe o semestre: ");
		int semestre = scan.nextInt();

		TOTAL_DISCIPLINAS = MethodsReview.retornaTotalDisciplinas(semestre);

		int horasDiscSemestre[] = MethodsReview.cargaHorariaSemestre(semestre, TOTAL_DISCIPLINAS);
		
		String[] nomesDisc = MethodsReview.disciplinasSemestral(semestre, TOTAL_DISCIPLINAS);

		System.out.println("Qtd disciplinas: " + TOTAL_DISCIPLINAS);
		
		for (int i = 0; i < horasDiscSemestre.length; i++) {
			System.out.println((i + 1) + ". " + nomesDisc[i] + " - " + horasDiscSemestre[i] + " hs");
			TOTAL_HORAS_SEMESTRE += horasDiscSemestre[i];
		}
		System.out.println("Total Horas: " + TOTAL_HORAS_SEMESTRE);
		int opcao = 0;
		int selecionaDisc = 0;
		int cont = 0;
		do {
			System.out.println(" = = = = = = = = = = = = = = = MENU 2 - SEMESTRE = = = = = = = = = = = = = = = \n");
			System.out.printf("%14.18s | %-14.18s | %-20.25s | %-17.20s | %-17.10s | %s\n", "1. Adicionar disciplina","2. Consultar Semestre ", "3. NÃO CONFIGURADO", "4. NÃO CONFIGURADO", "5. NÃO CONFIGURADO", "0. Voltar");
			
			System.out.println("Escolha a " + (cont+1)+"ª disciplina:");
			selecionaDisc = scan.nextInt();
			NOMES_DISCIPLINAS[cont] = nomesDisc[selecionaDisc];
			
			// DISC_SEM_ATUAL[cont] = scan.nextInt();
			cont++;
		} while (opcao == 0);
		menuPrincipal();
	}
	
	public static void menuPrincipal() {
		int opcao = 0;
		do {
			System.out.println(" = = = = = = = = = = = = = = = MENU 1 - PRINCIPAL = = = = = = = = = = = = = = = \n");
			System.out.printf("%14.18s | %-14.18s | %-20.25s | %-17.20s | %-17.10s | %s\n", "1. Gerir Semestre","2. Consultar Registro ", "3. NÃO CONFIGURADO", "4. NÃO CONFIGURADO", "5. NÃO CONFIGURADO", "0. Finalizar");
			opcao = scan.nextInt();
			switch (opcao) {
			case 1:
				carregaSemestre();
				break;
			case 2:
				exibeSemestre();
				// System.out.println("Não configurado");
				break;
			default:
				break;
			}
		} while (opcao == 0);
	}

}
