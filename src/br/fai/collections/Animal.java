package br.fai.collections;

public abstract class Animal {
	
	public void som() {
	 System.out.println("Este é o som padrão de um animal" + "de um animal: zzzz ");
		
	}
	public void dizerMeuNome() {
		System.out.println("O nome do animel eh: xxx");
	}
	private void dizerMinhaIdade() {
		System.out.println("Minha idade eh: xxxx");
	}
	
	private String cor;
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}

	private int idade = 5;
	private String nome = "não definido";
}
