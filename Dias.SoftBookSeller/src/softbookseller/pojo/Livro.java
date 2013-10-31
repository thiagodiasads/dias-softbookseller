package softbookseller.pojo;

/**
 * 
 * @author Dias
 *
 */

public class Livro {
	
	private int livro_id;
	private String titulo;
	private String editora;
	private String edicao;
	private int quant;
	private double valor;
	private String autor;
	
	
	public Livro(int livro_id, String titulo, String editora, String edicao,
			int quant, double valor, String autor) {
		super();
		this.livro_id = livro_id;
		this.titulo = titulo;
		this.editora = editora;
		this.edicao = edicao;
		this.quant = quant;
		this.valor = valor;
		this.autor = autor;
	}

	public Livro(String titulo, String editora, String edicao, int quant,
			double valor, String autor) {
		super();
		this.titulo = titulo;
		this.editora = editora;
		this.edicao = edicao;
		this.quant = quant;
		this.valor = valor;
		this.autor = autor;
	}

	public int getLivro_id() {
		return livro_id;
	}


	public String getTitulo() {
		return titulo;
	}


	public String getEditora() {
		return editora;
	}


	public String getEdicao() {
		return edicao;
	}


	public int getQuant() {
		return quant;
	}


	public double getValor() {
		return valor;
	}


	public String getAutor() {
		return autor;
	}


	@Override
	public String toString() {
		return "Livro [livro_id=" + livro_id + ", titulo=" + titulo
				+ ", editora=" + editora + ", edicao=" + edicao + ", quant="
				+ quant + ", valor=" + valor + ", autor=" + autor + "]";
	}

	
	

}
