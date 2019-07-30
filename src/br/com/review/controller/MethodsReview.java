package br.com.review.controller;

import br.com.review.model.Bibliografia;

public class MethodsReview {
	public static int contBibli = 0;

	// Retorna total de disciplinas do semestre selecionado
	public static int retornaTotalDisciplinas(int opcao) {
		int totalDisciplina = 0;
		if (opcao == 1) {
			totalDisciplina = 8;
		} else if (opcao == 2) {
			totalDisciplina = 9;
		} else if (opcao == 3) {
			totalDisciplina = 9;
		} else if (opcao == 4) {
			totalDisciplina = 8;
		} else if (opcao == 5) {
			totalDisciplina = 7;
		} else if (opcao == 6) {
			totalDisciplina = 6;
		} else {
			System.out.println("Opção inválida!");
		}

		return totalDisciplina;
	}

	// Método retorna vetor com carga horária de disciplinas do semestre informado
	public static int[] cargaHorariaSemestre(int semestre, int qtdDisc) {
		int totalDisciplina = 0;
		int mHoraAula[] = new int[qtdDisc];
		if (semestre == 1) {
			int horasSem1[] = { 80, 80, 80, 80, 80, 80, 80, 40 };
			for (int i = 0; i < mHoraAula.length; i++) {
				mHoraAula[i] = horasSem1[i];
			}
		} else if (semestre == 2) {
			int vetorSem2[] = { 80, 80, 80, 40, 80, 80, 80, 40, 40 };
			for (int i = 0; i < mHoraAula.length; i++) {
				mHoraAula[i] = vetorSem2[i];
			}
		} else if (semestre == 3) {
			int vetorSem3[] = { 80, 80, 40, 80, 80, 80, 80, 40, 40 };
			for (int i = 0; i < mHoraAula.length; i++) {
				mHoraAula[i] = vetorSem3[i];
			}
		} else if (semestre == 4) {
			int vetorSem4[] = { 80, 80, 80, 80, 80, 40, 40, 40 };
			for (int i = 0; i < mHoraAula.length; i++) {
				mHoraAula[i] = vetorSem4[i];
			}
		}
		return mHoraAula;
	}

	// Método retorna sigas das disciplinas do semestre selecinado
		public static String[] disciplinasSemestral(int semestre, int qtdDisc) {
			String disciplinas[] = new String[qtdDisc];
			if (semestre == 1) {
				String disciplinaSem1[] = { "ILM001", "ISI002", "IAL002", "IAC001", "AAG001", "MMD001", "LPO001","LIN100" };
				for (int i = 0; i < disciplinaSem1.length; i++) {
					disciplinas[i] = disciplinaSem1[i];
				}
			} else if (semestre == 2) {
				String disciplinaSem2[] = { "IES100", "ILP010", "ILP502", "IHW100", "ISO100", "MET100", "MCA002", "CCG006","LIN200" };
				for (int i = 0; i < disciplinaSem2.length; i++) {
					disciplinas[i] = disciplinaSem2[i];
				}
			} else if (semestre == 3) {
				String disciplinaSem3[] = { "IES200", "IED001", "IHC001", "ILP503", "ISO200", "IBD002", "MPL001", "CEF100","LIN300" };
				for (int i = 0; i < disciplinaSem3.length; i++) {
					disciplinas[i] = disciplinaSem3[i];
				}
			} else if (semestre == 4) {
				String disciplinaSem4[] = { "IES300", "ILP007", "IBD100", "IRC008", "AGO006", "ISG003", "HST002","LIN400" };
				for (int i = 0; i < disciplinaSem4.length; i++) {
					disciplinas[i] = disciplinaSem4[i];
				}
			} else if(semestre == 5) {
				String disciplinaSem5[] = { "IES301", "ESCOLHA II", "AGR101", "CEE002", "TTG001", "LIN500", "TTG003"};
				for (int i = 0; i < disciplinaSem5.length; i++) {
					disciplinas[i] = disciplinaSem5[i];
				}
			} else if(semestre == 6) {
				String disciplinaSem6[] = {"ESCOLHA III", "ITI003","HS001","LIN600","TTH002","TES001"};
				for (int i = 0; i < disciplinaSem6.length; i++) {
					disciplinas[i] = disciplinaSem6[i];
				}
			}
			return disciplinas;
		}

	// Método retorna nome das disciplinas do semestre selecionado
	public static String[] denominacaoDisc(int semestre, int qtdDisc) {
		String disciplinas[] = new String[qtdDisc];
		if (semestre == 1) {
			String disciplinaSem1[] = { "Programação em Microinformática", "Sistemas de Informação", "Algorítmos e Lógica de Programação", 
					"Arquitetura e Organização de Computadores", "Administração Geral","Matemática Discreta", "Comunicação e Expressão","Inglês I" };
			for (int i = 0; i < disciplinaSem1.length; i++) {
				disciplinas[i] = disciplinaSem1[i];
			}
		} else if (semestre == 1) {
			String disciplinaSem2[] = { "Engenharia de Software", "Linguagem de Programção", "Programação de Scripts", "Laboratório de Hardware", 
					"Sistemas Operacionais I", "Estatística Aplicada", "Cálculo","Contabilidade","Inglês II" };
			for (int i = 0; i < disciplinaSem2.length; i++) {
				disciplinas[i] = disciplinaSem2[i];
			}
		} else if (semestre == 3) {
			String disciplinaSem3[] = { "Engenharia de Software II", "Estruturas de Dados", "Interação Humano Computador", "Eletiva II", 
					"Sistemas Operacionais II", "Banco de Dados", "Programação Linear e Aplicações", "Economia e Finanças","Inglês III" };
			for (int i = 0; i < disciplinaSem3.length; i++) {
				disciplinas[i] = disciplinaSem3[i];
			}
		}else if (semestre == 4) {
			String disciplinaSem4[] = { "Engenharia de Software III", "Programação Orientada a Objetos", "Escolha I", "Redes de Computadores", 
					"Gestão de Projetos", "Segurança da Informação", "Cosiedade e Tecnologia","Ingles IV" };
			for (int i = 0; i < disciplinaSem4.length; i++) {
				disciplinas[i] = disciplinaSem4[i];
			}
		} else if(semestre == 5) {
			String disciplinaSem5[] = { "Laboratório de Engenharia de Software", "ESCOLHA II", "Gestão de Equipes", "Empreendedorismo", 
					"Metodologia da Pesquisa Científico-Tecnológica", "Inglês V", "Trabalho de Graduação I"};
			for (int i = 0; i < disciplinaSem5.length; i++) {
				disciplinas[i] = disciplinaSem5[i];
			}
		} else if(semestre == 6) {
			String disciplinaSem6[] = {"ESCOLHA III", "Gestão e Governança da Tecnologia da Informação","Ética e Responsabilidade Profissional",
					"Inglês VI","Trabalho de Graduação II","Estágio Supervisionado"};
			for (int i = 0; i < disciplinaSem6.length; i++) {
				disciplinas[i] = disciplinaSem6[i];
			}
		}
		return disciplinas;
	}

	// Método retorna descrição das disciplinas
	public static Bibliografia[] descricaoDisciplinas(int semestre, int qtdDisc) {

		Bibliografia[] biblio = new Bibliografia[contBibli];
		
		return biblio;
		
	}

}