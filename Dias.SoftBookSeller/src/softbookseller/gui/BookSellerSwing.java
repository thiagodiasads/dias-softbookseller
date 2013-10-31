package softbookseller.gui;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import softbookseller.action.CadastrarAction;
import softbookseller.action.CadastrarClienteAction;
import softbookseller.action.HistoricoVendaAction;
import softbookseller.action.SairAction;
import softbookseller.action.SobreAction;

/**
 * 
 * @author thiagodiasads@gmail.com
 *
 */
public class BookSellerSwing {
	/**
	 * Create the GUI and show it. For thread safety, this method should be
	 * invoked from the event-dispatching thread.
	 */
		private static void createAndShowGUI() {
			// Create and set up the window.
			JFrame frame = new JFrame("SoftBookSeller - Tela Cliente");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setIconImage(Toolkit.getDefaultToolkit().getImage(
					BookSellerSwing.class
							.getResource("/softbookseller/gui/livro.jpg")));

			
			
			CardLayout card = new CardLayout (0,0);
			
			JMenuBar mb = new JMenuBar();
			frame.setJMenuBar(mb);

			JMenu arquivo = new JMenu("Arquivo");
			arquivo.setMnemonic(KeyEvent.VK_A);
			mb.add(arquivo);

			JMenu ajuda = new JMenu("Ajuda");
			ajuda.setMnemonic(KeyEvent.VK_U);
			mb.add(ajuda);
			
			JMenuItem cadastrar = new JMenuItem(new CadastrarAction(frame, card));
			arquivo.add(cadastrar);

			JMenuItem historicoVenda = new JMenuItem(new HistoricoVendaAction(frame, card));
			arquivo.add(historicoVenda);
			
			
			JMenuItem sair = new JMenuItem(new SairAction());
			arquivo.add(sair);
			sair.setMnemonic(KeyEvent.VK_S);
			sair.setAccelerator(KeyStroke.getKeyStroke(
			        KeyEvent.VK_Q, ActionEvent.CTRL_MASK));

			JMenuItem sobre = new JMenuItem(new SobreAction(frame));
			ajuda.add(sobre);
			sobre.setMnemonic(KeyEvent.VK_S);

			JPanel panelCadastrarCliente = new JCadastrarClientePanel(frame, card);
			JPanel panelCadastarLivro = new JCadastrarLivroPanel(frame, card);
			JPanel panelHistoricoVenda = new JHistoricoVendaPanel (frame, card);
			JPanel vazio = new JPanel();

			frame.setLayout(card);
			frame.getContentPane().add(vazio, "Vazio");
			frame.getContentPane().add(panelCadastrarCliente, "TelaCadastroCliente");
			frame.getContentPane().add(panelCadastarLivro, "TelaCadastroLivro");
			frame.getContentPane().add(panelHistoricoVenda, "TelaHistoricoVenda");

			frame.setPreferredSize(new Dimension(800, 200));
			frame.pack();
			frame.setVisible(true);
		}

		public static void main(String[] args) {
			// Schedule a job for the event-dispatching thread:
			// creating and showing this application's GUI.
			javax.swing.SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					createAndShowGUI();
				}
			});
		}
	}

