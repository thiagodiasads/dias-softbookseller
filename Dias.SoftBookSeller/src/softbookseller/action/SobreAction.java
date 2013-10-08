package softbookseller.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * 
 * @author thiagodiasads@gmail.com
 *
 */
public class SobreAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;

	public SobreAction(JFrame frame) {
		super("Sobre");
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Sobre");
		JOptionPane.showMessageDialog(frame, "v. 1.0 (c) DiasSoftBookSeller.",
				"Sobre o SoftBookSeller - Software para gerenciamento de Revistaria", JOptionPane.INFORMATION_MESSAGE);
	}

}