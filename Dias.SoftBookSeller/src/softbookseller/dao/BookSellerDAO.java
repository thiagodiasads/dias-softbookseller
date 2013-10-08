package softbookseller.dao;


import softbookseller.pojo.Cliente;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class BookSellerDAO {

	public Cliente buscaClientePorNome(String name) {

		Cliente cliente = null;

		String cmd = "select * from clientes where nome= ?";

		Connection db = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {

			Properties props = new Properties();
			props.load(new FileInputStream("softbookseller.properties"));
			String url = props.getProperty("url");

			db = DriverManager.getConnection(url, props);

			st = db.prepareStatement(cmd);
			st.setString(1, name);
			rs = st.executeQuery();

			while (rs.next())  {
				// copiar dados para POJO
				
				String nome = rs.getString(1);
				String cpf = rs.getString(2);
				String email = rs.getString(3);
				cliente = new Cliente(nome, cpf, email);
			}
			rs.close();
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {

					st.close();
				}
				if (db != null) {

					db.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return cliente;
	}
	
	public void insertCliente(Cliente cliente) {
		String cmd = "insert into clientes (Nome, CPF, Email) values (?, ?, ?)";

		Connection db = null;
		PreparedStatement st = null;

		try {
			// abrir conexão
			Properties props = new Properties();
			props.load(new FileInputStream("softbookseller.properties"));
			String url = props.getProperty("url");

			db = DriverManager.getConnection(url, props);

			st = db.prepareStatement(cmd);
			st.setString(1, cliente.getNome());
			st.setString(2, cliente.getCpf());
			st.setString(3, cliente.getEmail());
			int r = st.executeUpdate();

			if (r != 1) {
				throw new RuntimeException("Erro ao inserir cliente!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null) {
					st.close();
				}
				if (db != null) {
					db.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}


