package br.com.review.test;

import java.util.Scanner;

import br.com.review.controller.GeradorDatas;
import br.com.review.model.*;

public class TestaObjetoVetor {
	public static Scanner scan = new Scanner(System.in);
	public static Disciplinas dis = new Disciplinas();
	
	public static void main(String[] args) {
		System.out.println("Semestre?");
		// Variável armazena num do semestre
		dis.setSemestre(scan.nextInt());
		// Variável armazena a quantidade de disciplinas do semestre informado
		dis.setTotalDiscSemestre(GeradorDatas.retornaTotalDisciplinas(dis.getSemestre()));
				
		dis.setCargaHoraria(GeradorDatas.cargaHorariaSemestre(dis.getSemestre()));
		
		for (int i = 0; i < dis.getTotalDiscSemestre(); i++) {
			dis.getCargaHoraria();
		}
		System.out.println(dis.getSemestre() + "º Semestre");
		System.out.println("Qtd disciplinas: " + dis.getTotalDiscSemestre());
		
		for (int i = 0; i < dis.getTotalDiscSemestre(); i++) {
			System.out.println((i+1) + "º ");
		}
	}
}
