package softbookseller.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import softbookseller.dao.BookSellerDAO;
import softbookseller.gui.CadastrarClientePanel;
import softbookseller.pojo.Cliente;

/**
 * 
 * @author thiagodiasads@gmail.com
 *
 */
public class CadastrarClienteAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private CadastrarClientePanel panel;

	/**
	 * 
	 * @param panel
	 */
	public CadastrarClienteAction(CadastrarClientePanel panel) {
		super("Cadastrar");
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Cliente a = panel.getAluno();
		//System.out.println(c);
		BookSellerDAO dao = new BookSellerDAO();
		dao.insertCliente(a);
	}
}
