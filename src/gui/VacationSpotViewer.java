package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VacationSpotViewer extends JFrame{

	public VacationSpotViewer() {
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");;
		model.addColumn("Name");;
		model.addColumn("Spot");;
		model.addColumn("Price");;
		model.addColumn("Phone");;
		
		
		JTable table = new JTable(model);
		
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		this.setVisible(true);
	}
}
