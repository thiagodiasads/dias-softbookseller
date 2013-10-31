package softbookseller.action;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import softbookseller.dao.BookSellerDAO;
import softbookseller.gui.JCadastrarClientePanel;
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
	private JCadastrarClientePanel panel;

	/**
	 * 
	 * @param panel
	 */
	public CadastrarClienteAction(JCadastrarClientePanel panel) {
		super("Cadastrar");
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			Cliente c = panel.getCliente();
			// System.out.println(c);
			BookSellerDAO dao = new BookSellerDAO();
			dao.insertCliente(c);
		} catch(Exception e) {
			JOptionPane.showMessageDialog(panel.getFrame(), "Erro #425");
		} finally {
			panel.clear();
			CardLayout card = panel.getCard();
			JFrame frame = panel.getFrame();
			card.show(frame.getContentPane(), "Vazio");
		}
	}
}
