package br.com.unifacisa.bd2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BancoDoBrasil implements BancoDAO {
	Connection conn;
	public BancoDoBrasil() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");// WALNEY

		String url = "jdbc:postgresql://localhost:5432/SistemaBancario"; // Nome da
																	// base de
		// dados
		String user = "postgres"; // nome do usuário do MySQL
		String password = "123"; // senha do MySQL

		conn = DriverManager.getConnection(url, user, password);
	}

	// WALNEY
	
public void cadastra(Aluno aluno) {
		
		
			PreparedStatement st = null;
			try {// WALNEY
				st = conn.prepareStatement("INSERT INTO Alunos"// WALNEY
						+ "(id_aluno,nome,matricula, valor )" + "VALUES " + "(?,?,?,?)");
				st.setLong(1, aluno.getId());
				st.setString(2, aluno.getNome());// WALNEY
				
				st.executeQuery();

			} catch (SQLException e) {

			}

		}	

	public double calculaTaxaChequeEspecial(int dias, double valor) {
		/* 
		 * Banco do Brasil
			(taxa=0.05, para 4 dias do vencimento, 
			acrescentando 0.01 por dia excedente do valor
			total)
		 */
		if (dias < 4) {
			return valor;
		}
		if (dias >= 4) {
			valor = (valor + (valor * 0.05));
			
			for (int i = 4; i < dias; i++) {
				valor =  (valor + (valor * 0.01));
			}
		}
		
		return valor;
	}

	
		
		
	}


