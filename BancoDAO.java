package br.com.unifacisa.bd2;

public interface BancoDAO {
	double calculaTaxaChequeEspecial(int dias, double valor);
	void cadastra(Aluno aluno);
	
}
