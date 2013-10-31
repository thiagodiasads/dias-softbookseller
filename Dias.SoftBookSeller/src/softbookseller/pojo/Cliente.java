package softbookseller.pojo;

/**
 * 
 * @author Dias
 *
 */

public class Cliente {
	private int cliente_id;
	private String nome;
	private String cpf;
	private String email;
	
	public Cliente(int cliente_id, String nome, String cpf, String email) {
		super();
		this.cliente_id = cliente_id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}
	
		
	public Cliente(String nome, String cpf, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}



	public int getCliente_id() {
		return cliente_id;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Cliente [cliente_id=" + cliente_id + ", nome=" + nome
				+ ", cpf=" + cpf + ", email=" + email + "]";
	}
	
	
	
	
	
	

}
