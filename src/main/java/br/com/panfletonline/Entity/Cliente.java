package br.com.panfletonline.Entity;

public class Cliente {
	private String nome;
	private int idade;
	private int peso;
	public String getNome() {
		return nome;
}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
