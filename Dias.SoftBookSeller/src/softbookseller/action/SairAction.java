package softbookseller.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

/**
 * 
 * @author thiagodiasads@gmail.com
 *
 */
public class SairAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SairAction() {
		super("Sair");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//System.out.println("Sair");
		// TODO: verificar dados antes de sair da aplica��o 
		System.exit(0);
	}

}