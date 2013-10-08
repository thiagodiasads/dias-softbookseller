package softbookseller.gui;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import softbookseller.action.SairAction;
import softbookseller.action.SobreAction;

public class BookSellerSwing {
	


	/**
	 * 
	 * @author thiagodiasads@gmail.com
	 *
	 */

		/**
		 * Create the GUI and show it. For thread safety, this method should be
		 * invoked from the event-dispatching thread.
		 */
		private static void createAndShowGUI() {
			// Create and set up the window.
			JFrame frame = new JFrame("SoftBookSeller - Tela Cliente");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			CardLayout card = new CardLayout (0,0);
			
			JMenuBar mb = new JMenuBar();
			frame.setJMenuBar(mb);

			JMenu arquivo = new JMenu("Arquivo");
			arquivo.setMnemonic(KeyEvent.VK_A);
			mb.add(arquivo);

			JMenu ajuda = new JMenu("Ajuda");
			ajuda.setMnemonic(KeyEvent.VK_U);
			mb.add(ajuda);

			JMenuItem sair = new JMenuItem(new SairAction());
			arquivo.add(sair);
			sair.setMnemonic(KeyEvent.VK_S);
			sair.setAccelerator(KeyStroke.getKeyStroke(
			        KeyEvent.VK_Q, ActionEvent.CTRL_MASK));

			JMenuItem sobre = new JMenuItem(new SobreAction(frame));
			ajuda.add(sobre);
			sobre.setMnemonic(KeyEvent.VK_S);

			JPanel panel = new CadastrarClientePanel();
			JPanel vazio = new JPanel();

			frame.getContentPane().add(panel);

			frame.setPreferredSize(new Dimension(800,600));
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

