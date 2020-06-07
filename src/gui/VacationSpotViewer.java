package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VacationSpotViewer extends JPanel{
	
	WindowFrame frame;

	public VacationSpotViewer(WindowFrame frame) {
		this.frame = frame;
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");;
		model.addColumn("Name");;
		model.addColumn("Spot");;
		model.addColumn("Price");;
		model.addColumn("Phone");;
		
		
		JTable table = new JTable(model);
		
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
