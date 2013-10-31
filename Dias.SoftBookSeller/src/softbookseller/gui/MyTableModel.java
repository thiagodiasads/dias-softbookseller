package softbookseller.gui;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import softbookseller.dao.BookSellerDAO;
import softbookseller.pojo.Cliente;
import softbookseller.pojo.Venda;

/**
 * 
 * @author Dias
 *
 */

public class MyTableModel extends AbstractTableModel {

	
	private static final long serialVersionUID = 1L;
	
	private List<Venda> vd;

	public MyTableModel(Cliente c) {
		BookSellerDAO dao = new BookSellerDAO();
		vd = dao.buscaVendaPorCliente(c);
	}

	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public int getRowCount() {
		return vd.size();
	}

	@Override
	public Object getValueAt(int lin, int col) {
		Venda m = vd.get(lin);
		switch (col) {
		case 0:
			return m.getData();
		case 1:
			return m.getValor();
		case 2:
			return m.getLivro_id();
		default:
			return "*ERRO*";
		}
	}
}
