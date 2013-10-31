package softbookseller.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import softbookseller.gui.JCadastrarLivroPanel;

/**
 * 
 * @author Dias
 *
 */
public class CadastrarLivroCancelarAction extends AbstractAction {
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
	public CadastrarLivroCancelarAction(JCadastrarLivroPanel panel) {
		super("Cancelar");
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		panel.clear();
	}

}

