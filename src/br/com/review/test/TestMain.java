package br.com.review.test;

import java.util.Scanner;

import br.com.review.controller.GeradorDatas;
import br.com.review.model.Disciplinas;

public class TestMain {
	
	public static Scanner scan =new Scanner(System.in);
	public static Disciplinas dis = new Disciplinas();
	
	public static void main(String[] args) {
		System.out.println("Informe semestre: ");
		dis.setSemestre(scan.nextInt());
		
		int totalDisciplina = GeradorDatas.retornaTotalDisciplinas(dis.getSemestre());
		dis.setTotalDiscSemestre(totalDisciplina);
		
		int cargaHoraria[] = GeradorDatas.cargaHorariaSemestre(dis.getSemestre());
				
		System.out.println("Semestre: " + dis.getSemestre());
		System.out.println("Qtd disciplinas: " + dis.getTotalDiscSemestre());
		System.out.println("Carga horária");
		for (int i = 0; i < dis.getTotalDiscSemestre(); i++) {
			System.out.println(cargaHoraria[i]);
		}
	}
}
