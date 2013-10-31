package softbookseller.gui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;


public class HistoricoVendasFecharAction extends AbstractAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	private JHistoricoVendaPanel panel;

	/**
	 * 
	 * @param jHistoricoVenda
	 */
	public HistoricoVendasFecharAction(JHistoricoVendaPanel jHistoricoVendaPanel) {
		super("Fechar");
		this.panel = jHistoricoVendaPanel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//panel.clear();
		CardLayout card = panel.getCard();
		JFrame frame = panel.getFrame();
		card.show(frame.getContentPane(), "Vazio");		
	}

}
