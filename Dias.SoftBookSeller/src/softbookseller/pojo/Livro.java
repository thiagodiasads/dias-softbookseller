package softbookseller.pojo;

public class Livro {
	
	private String titulo;
	private String editora;
	private String edicao;
	private int quant;
	private double valor;
	private String autor;
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
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", editora=" + editora + ", edicao="
				+ edicao + ", quant=" + quant + ", valor=" + valor + ", autor="
				+ autor + "]";
	}
	
	

}
