package softbookseller.gui;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import softbookseller.action.CadastrarClienteAction;
import softbookseller.action.CadastrarClienteCancelarAction;
import softbookseller.action.CadastrarLivroAction;
import softbookseller.action.CadastrarLivroCancelarAction;
import softbookseller.pojo.Cliente;
import softbookseller.pojo.Livro;

/**
 * 
 * @author Dias
 *
 */
public class JCadastrarLivroPanel extends JPanel {
	public JFrame getFrame() {
		return frame;
	}
	
	public CardLayout getCard() {
		return card;
	}
	
	private static final long serialVersionUID = 1L;

	private JTextField titulo;
	private JTextField editora;
	private JTextField edicao;
	private JTextField quant;
	private JTextField valor;
	private JTextField autor;
	
	private JFrame frame;
	private CardLayout card;
	
	/**
	 * 
	 */
	public Livro getLivro() {
		return new Livro(titulo.getText(),editora.getText(),edicao.getText(), Integer.parseInt(quant.getText()), Double.parseDouble(valor.getText()), autor.getText());
	}
	
	public void clear() {
		titulo.setText("");
		editora.setText("");
		edicao.setText("");
		quant.setText("");
		valor.setText("");
		autor.setText("");
	}

	public JCadastrarLivroPanel(JFrame frame, CardLayout card) {
		JLabel label;
		
		this.frame = frame;
		this.card = card;
		
		setLayout(new FlowLayout());

		label = new JLabel("Titulo");
		add(label);
		titulo = new JTextField(50);
		label.setLabelFor(titulo);
		add(titulo);

		label = new JLabel("Editora");
		add(label);
		editora = new JTextField(30);
		label.setLabelFor(editora);
		add(editora);

		label = new JLabel("Edicao");
		add(label);
		edicao = new JTextField(10);
		label.setLabelFor(edicao);
		add(edicao);
		
		label = new JLabel("Quantidade");
		add(label);
		quant = new JTextField(5);
		label.setLabelFor(quant);
		add(quant);
		
		label = new JLabel("Valor");
		add(label);
		valor = new JTextField(8);
		label.setLabelFor(valor);
		add(valor);
		
		label = new JLabel("Autor");
		add(label);
		edicao = new JTextField(30);
		label.setLabelFor(edicao);
		add(edicao);

		JButton button;

		button = new JButton(new CadastrarLivroAction(this));
		button.setToolTipText("Cadastrar Livro");
		button.setMnemonic(KeyEvent.VK_C);
		add(button);

		button = new JButton(new CadastrarLivroCancelarAction(this));
		button.setToolTipText("Cancelar cadastro de livro");
		button.setMnemonic(KeyEvent.VK_N);
		add(button);		
	}
}
