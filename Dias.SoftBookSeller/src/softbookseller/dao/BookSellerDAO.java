package softbookseller.dao;


import softbookseller.pojo.Cliente;
import softbookseller.pojo.Livro;
import softbookseller.pojo.Venda;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * 
 * @author Dias
 *
 */

public class BookSellerDAO {

	public Cliente buscaClientePorNome(String name) {

		Cliente cliente = null;
		//Comando para o BD
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
	
	public void insertLivro(Livro livro) {
		String cmd = "insert into livros (titulo, editora, edicao, quantidade, valor, autor) values (?, ?, ?, ?, ?, ?)";

		Connection db = null;
		PreparedStatement st = null;

		try {
			// abrir conexão
			Properties props = new Properties();
			props.load(new FileInputStream("softbookseller.properties"));
			String url = props.getProperty("url");

			db = DriverManager.getConnection(url, props);

			st = db.prepareStatement(cmd);
			st.setString(1, livro.getTitulo());
			st.setString(2, livro.getEditora());
			st.setString(3, livro.getEdicao());
			st.setInt(4, livro.getQuant());
			st.setDouble(5, livro.getValor());
			st.setString(6, livro.getAutor());
			
			int r = st.executeUpdate();

			if (r != 1) {
				throw new RuntimeException("Erro ao inserir livro!");
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
	
	public List<Venda> buscaVendaPorCliente(Cliente c) {
		String cmd = "select * from bs__vendas where cliente= ?";
		List<Venda> vd = new ArrayList<Venda>();

		Connection db = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			Properties props = new Properties();
			props.load(new FileInputStream("softbookseller.properties"));
			String url = props.getProperty("url");

			db = DriverManager.getConnection(url, props);

			st = db.prepareStatement(cmd);
			st.setInt(1, c.getCliente_id());
			rs = st.executeQuery();

			while (rs.next()) {
				int venda_id = rs.getInt(1);
				java.sql.Timestamp data = rs.getTimestamp(2);
				int clienteIdBD = rs.getInt(3);
				int livroIdBD = rs.getInt(4);
				double valor = rs.getDouble(5);
	
				vd.add(new Venda(venda_id,
						clienteIdBD, 
						livroIdBD,
						new java.util.Date(data.getTime()), 
						valor));
			}

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
		return vd;
	}

}


