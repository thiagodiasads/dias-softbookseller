package softbookseller.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import softbookseller.dao.BookSellerDAO;
import softbookseller.gui.JCadastrarLivroPanel;
import softbookseller.pojo.Cliente;
import softbookseller.pojo.Livro;

/**
 * 
 * @author Dias
 *
 */
public class CadastrarLivroAction extends AbstractAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private JCadastrarLivroPanel panel;

	/**
	 * 
	 * @param panel
	 */
	public CadastrarLivroAction(JCadastrarLivroPanel panel) {
		super("Cadastrar");
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Livro a = panel.getLivro();
		//System.out.println(c);
		BookSellerDAO dao = new BookSellerDAO();
		dao.insertLivro(a);
	}
}
