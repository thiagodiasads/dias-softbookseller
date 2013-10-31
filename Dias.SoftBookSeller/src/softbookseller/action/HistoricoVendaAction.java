package softbookseller.action;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;

public class HistoricoVendaAction extends AbstractAction{

private static final long serialVersionUID = 1L;
	
	private JFrame frame;
	private CardLayout card;

	public HistoricoVendaAction(JFrame frame, CardLayout card) {
		super("Consultar Venda");
		this.frame = frame;
		this.card = card;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {	
		//TODO: criar tela historico venda
		card.show(frame.getContentPane(), "TelaHistoricoVendas" );
	}
}
