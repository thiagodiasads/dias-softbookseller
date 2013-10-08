package softbookseller.pojo;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String email;
	
	public Cliente(String nome, String cpf, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
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
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", email=" + email
				+ "]";
	}
	
	
	
	

}
