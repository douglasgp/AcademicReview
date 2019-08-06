package br.com.review.model;

public class Bibliografia {

	private String[][] autor;
	private String[][] titulo;
	private String[][] editora;
	private int[][] ano;
	
	

	public String[][] getTitulo() {
		return titulo;
	}

	public void setTitulo(String[][] titulo) {
		this.titulo = titulo;
	}

	public String[][] getAutor() {
		return autor;
	}

	public void setAutor(String[][] matAutor) {
		this.autor = matAutor;
	}

	public String[][] getEditora() {
		return editora;
	}

	public void setEditora(String[][] editora) {
		this.editora = editora;
	}

	public int[][] getAno() {
		return ano;
	}

	public void setAno(int[][] ano) {
		this.ano = ano;
	}

}
