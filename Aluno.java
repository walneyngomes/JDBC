package br.com.unifacisa.bd2;

public class Aluno {
	private long id;
	private String nome;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double simulaATaxaDoChequeEspecial(int dias, double valor, BancoDAO banco) {
		return banco.calculaTaxaChequeEspecial(dias, valor);
	}

}
