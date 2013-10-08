package softbookseller.gui;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import softbookseller.action.CadastrarClienteAction;
import softbookseller.action.CadastrarClienteCancelarAction;
import softbookseller.pojo.Cliente;


/**
 * 
 * @author thiagodiasads@gmail.com
 *
 */
public class CadastrarClientePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField nome;
	private JTextField cpf;
	private JTextField email;

	/**
	 * 
	 * @return
	 */
	public Cliente getAluno() {
		return new Cliente(nome.getText(),cpf.getText(),email.getText());
	}

	public void clear() {
		nome.setText("");
		cpf.setText("");
		email.setText("");
	}


	/**
	 * 
	 */
	public CadastrarClientePanel() {
		JLabel label;

		setLayout(new FlowLayout());

		label = new JLabel("Nome");
		add(label);
		nome = new JTextField(10);
		label.setLabelFor(nome);
		add(nome);

		label = new JLabel("cpf");
		add(label);
		cpf = new JTextField(10);
		label.setLabelFor(cpf);
		add(cpf);

		label = new JLabel("Email");
		add(label);
		email = new JTextField(10);
		label.setLabelFor(email);
		add(email);

		JButton button;

		button = new JButton(new CadastrarClienteAction(this));
		button.setToolTipText("Cadastrar Cliente");
		button.setMnemonic(KeyEvent.VK_C);
		add(button);

		button = new JButton(new CadastrarClienteCancelarAction(this));
		button.setToolTipText("Cancelar cadastro de cliente");
		button.setMnemonic(KeyEvent.VK_N);
		add(button);		
	}
}