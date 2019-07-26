package br.com.review.test;

import java.util.Scanner;

import br.com.review.model.Disciplinas;

public class TestaObjetoVetor {
	public static Scanner scan = new Scanner(System.in);
	public static Disciplinas dis = new Disciplinas();
	
	public static void main(String[] args) {
		System.out.println("Semestre?");
		dis.setSemestre(scan.nextInt());
	}

}
