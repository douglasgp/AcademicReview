package br.com.review.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class GeradorDatas {
	public static Scanner scan = new Scanner(System.in);
	
	public static int TAMANHO = 0;
	public static int CARGA_TOTAL_SEMESTRE = 0;
	public static int SEMESTRE = 0;
	public static int TOTAL_DISCIPLINA = 0;
	public static int OPCAO_DISCIPLINA = 0;
	public static String NOME_DISCIPLINA;
	public static String vetorDataStr[] = new String[TAMANHO];
	public static Calendar TODAY = Calendar.getInstance();
	
	
	public static int totalAula = 0;
	public static int NUM_DISCIPLINA = 3;
	public static int NUM_LIN = NUM_DISCIPLINA;
	public static int NUM_COL = 3;
	public static int dataAulas[][] = new int[NUM_LIN][NUM_COL];

	public static void menuPrincipal() throws Exception {
		
		int opcao = 0;
			// mostra menu de opões

			System.out.println(" = = = = = = = = = = = = = = = = = = = = =  MENU 1 - PRINCIPAL  = = = = = = = = = = = = = = = = = = = = = = = = = =  ");
			System.out.printf("%8.28s | %-14.17s | %-20.25s | %-17.20s | %-17.10s |%s\n","1. Gerencimento ", "2. Consultar datas ", "3. Gerar datas","4. Registrar datas ", "5. Sair da ", "0. Finalizar");
			System.out.printf("%8.28s | %-11.19s | %-20.25s | %-17.18s | %-17.12s |%s\n","   de datas    ", "  de aulas          ", "   de revisão        ","    de aulas   ", "   aplicação", " Compra");
			System.out.println(" = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = ");
			
			opcao = scan.nextInt();
			// processa opção escolhida no menu
			switch (opcao) {
			case 1: //
				menuDatas();
				break;
			case 2:
				menuPrincipal();
				break;
			case 3:
				criaDatasDisciplina();
				break;
			case 4:
				registraDataAula();
				break;
			case 5:
				abandonarNavio();
				break;
			default:
				System.out.println("Operação Inválida!");
			}
	}

	public static void criaDatasDisciplina() {
		System.out.println("Informe o nome da Disciplina: ");
		String disciplina = scan.nextLine();
		System.out.println("Informe o total de aulas: ");
		int totalAula = scan.nextInt();
		System.out.println("Informe a data da 1º aula dd - mm - yyy: ");
		int dia = scan.nextInt();
		int mes = scan.nextInt();
		int ano = scan.nextInt();

		for (int i1 = 0; i1 < totalAula; i1++) {
			for (int i2 = 0; i2 < i1; i2++) {
				for (int i3 = 0; i3 < i1; i3++) {

				}
			}
		}

		for (int i1 = 0; i1 < totalAula; i1++) {
			for (int i2 = 0; i2 < i1; i2++) {
				for (int i3 = 0; i3 < i1; i3++) {
					System.out.println(i3 + " - ano");
					dataAulas[i3][i3] = scan.nextInt();
				}
				System.out.println(i2 + " - mês");
			}
			System.out.println(i1 + " - dia");
		}
	}
	
	public static void menuDatas() {
		int opcao = 0;
			// Exibe menu de opções
			
			System.out.println(" = = = = = = = = = = = = = = = = = = = = =  MENU 2 - Gerador Datas  = = = = = = = = = = = = = = = = = = = = = = = = = =  ");
			System.out.printf("%14.31s | %-14.35s |%s\n","1. Carregar disciplinas    ", " 3. Consultar Carrinho de Compras", "5. Sair da aplicação");
			System.out.printf("%11.31s | %-11.35s |%s\n","2. Consultar datas de aulas", " 4. Retornar ao Menu Principal   ", "6. Ajuda ");
			System.out.println(" = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = ");
			opcao = scan.nextInt();
			switch (opcao) {
			case 1:
				carregarSemestre();
				break;
			case 2:
				registraDataAula();
				break;
			case 5:
				abandonarNavio();
				break;
			default:
				break;
			}
		
	}
	
	public static void registraDataAula() {
		if(SEMESTRE == 0) {
			System.out.println("Semestre ainda não foi carregado!\nSelecione '1. CARREGAR DISCIPLINAS'");
			menuDatas();
		}
	}
	
	public static void carregarSemestre() {
		String dataStr;
		// Solicita o nome da disciplina
		//-- System.out.println("Informe nome disciplina: ");
		//-- NOME_DISCIPLINA = scan.next();
		
		// Solicita do usuário o semestre a consultar
		System.out.println("Informe o semestre: ");
		SEMESTRE = scan.nextInt();
		
		// Invoca o método para retornar o total de disciplinas
		TOTAL_DISCIPLINA = retornaTotalDisciplinas(SEMESTRE);
		// Invoca método para retornar VETOR com carga horária cada disciplina do semestre informado
		int cargaHorariaSemestre[] = cargaHorariaSemestre(SEMESTRE);
		// Invoca método para retornar VETOR com nomes das disciplinas do semestre informado.
		String nomesDisciplinas[] = disciplinasSemestral(SEMESTRE);
		
		// Exibe resultado
		System.out.println("Total de disciplinas: " + TOTAL_DISCIPLINA);
		
		// Inicializa variável TAMANHO
		TAMANHO = TOTAL_DISCIPLINA;
		//System.out.printf("%8.4s | %-14.17s | %-20.25s | %-17.20s | %-17.10s |%s\n","1. COD ", "2. Consultar datas ", "3. Consultar Carrinho","4. Retornar ao ", "5. Sair da ", "0. Finalizar");
		for (int i = 0; i < cargaHorariaSemestre.length; i++) {
			System.out.println((i+1)+". " + nomesDisciplinas[i] + " - " + cargaHorariaSemestre[i]);
		}
		// Exibe carga/hora total do semestre
		System.out.println("Total horas: " + CARGA_TOTAL_SEMESTRE);
		
		menuDatas();
		
	}

	public static void abandonarNavio() {
		System.out.println("Saindo da aplicação ... ");
		System.exit(0);		
	}

	
	// Retorna total de disciplinas do semestre selecionado
	public static int retornaTotalDisciplinas(int opcao) {
		int totalDisciplina = 0;
		if(opcao == 1) {
			totalDisciplina = 8;
		}else if(opcao == 2) {
			totalDisciplina = 9;
		}else if(opcao == 3) {
			totalDisciplina = 9;
		}else if(opcao == 4) {
			totalDisciplina = 8;
		}else if(opcao == 5) {
			totalDisciplina = 7;
		}else if(opcao == 6) {
			totalDisciplina = 6;
		}else {
			System.out.println("Opção inválida!");
		}
		
		return totalDisciplina;
	}

	
	public static int[] cargaHorariaSemestre(int opcao) {
		int mHoraAula[] = new int[TOTAL_DISCIPLINA];
		if (opcao == 1) {
			int horasSem1[] = { 80, 80, 80, 80, 80, 80, 80, 40 };
			for (int i = 0; i < mHoraAula.length; i++) {
				mHoraAula[i] = horasSem1[i];
				CARGA_TOTAL_SEMESTRE += mHoraAula[i];
			}
		} else if (opcao == 2) {
			int vetorSem2[] = { 80, 80, 80, 40, 80, 80, 80, 40, 40 };
			for (int i = 0; i < mHoraAula.length; i++) {
				mHoraAula[i] = vetorSem2[i];
				CARGA_TOTAL_SEMESTRE += mHoraAula[i];
			}
		} else if (opcao == 3) {
			int vetorSem3[] = { 80, 80, 40, 80, 80, 80, 80, 40, 40 };
			for (int i = 0; i < mHoraAula.length; i++) {
				mHoraAula[i] = vetorSem3[i];
				CARGA_TOTAL_SEMESTRE += mHoraAula[i];
			}
		} else if(opcao == 4) {
			int vetorSem4[] = { 80, 80, 80, 80, 80, 40, 40, 40 };
			for (int i = 0; i < mHoraAula.length; i++) {
				mHoraAula[i] = vetorSem4[i];
				CARGA_TOTAL_SEMESTRE += mHoraAula[i];
			}
		}
		return mHoraAula;
	}
	
	// Método retorna total de aulas da disciplina selecinada
	public static String[] disciplinasSemestral(int opcao) {
		String disciplinas[] = new String[TOTAL_DISCIPLINA];
		if (opcao == 1) {
			String disciplinaSem1[] = { "ILM001", "ISI002", "IAL002", "IAC001", "AAG001", "MMD001", "LPO001","LIN100" };
			for (int i = 0; i < disciplinaSem1.length; i++) {
				disciplinas[i] = disciplinaSem1[i];
			}
		} else if (opcao == 2) {
			String disciplinaSem2[] = { "IES100", "ILP010", "ILP502", "IHW100", "ISO100", "MET100", "MCA002", "CCG006","LIN200" };
			for (int i = 0; i < disciplinaSem2.length; i++) {
				disciplinas[i] = disciplinaSem2[i];
			}
		}else if(opcao == 3) {
			String disciplinaSem3[] = { "IES200", "IED001", "IHC001", "ILP503", "ISO200", "IBD002", "MPL001", "CEF100","LIN300" };
			for (int i = 0; i < disciplinaSem3.length; i++) {
				disciplinas[i] = disciplinaSem3[i];
			}
		} else if(opcao == 4) {
			String disciplinaSem3[] = { "IES300", "ILP007", "IBD100", "IRC008", "AGO006", "ISG003", "HST002", "LIN400"};
			for (int i = 0; i < disciplinaSem3.length; i++) {
				disciplinas[i] = disciplinaSem3[i];
			}
		}
		return disciplinas;
	}
	
}
