package softbookseller.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import softbookseller.gui.JCadastrarClientePanel;

/**
 * 
 * @author Dias
 *
 */
public class CadastrarClienteCancelarAction extends AbstractAction {
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
	public CadastrarClienteCancelarAction(JCadastrarClientePanel panel) {
		super("Cancelar");
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		panel.clear();
	}

}

