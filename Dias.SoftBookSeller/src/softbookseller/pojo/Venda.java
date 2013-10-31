package softbookseller.pojo;

import java.util.Date;

/**
 * 
 * @author Dias
 *
 */

public class Venda {

	private int venda_id;
	private int cliente_id;
	private int livro_id;
	private Date data;
	private double valor;
	
	public Venda(int venda_id, int cliente_id, int livro_id, Date data,
			double valor) {
		super();
		this.venda_id = venda_id;
		this.cliente_id = cliente_id;
		this.livro_id = livro_id;
		this.data = data;
		this.valor = valor;
	}

	public Venda(int cliente_id, int livro_id, Date data, double valor) {
		super();
		this.cliente_id = cliente_id;
		this.livro_id = livro_id;
		this.data = data;
		this.valor = valor;
	}

	public int getVenda_id() {
		return venda_id;
	}

	public int getCliente_id() {
		return cliente_id;
	}

	public int getLivro_id() {
		return livro_id;
	}

	public Date getData() {
		return data;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "Venda [venda_id=" + venda_id + ", cliente_id=" + cliente_id
				+ ", livro_id=" + livro_id + ", data=" + data + ", valor="
				+ valor + "]";
	}
	
	
	
	}
