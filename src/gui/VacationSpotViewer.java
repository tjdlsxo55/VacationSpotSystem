package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Vacationspot.VacationSpotInput;
import manager.VacationSpotManager;

public class VacationSpotViewer extends JPanel{
	
	WindowFrame frame;
	VacationSpotManager vacationSpotManager ;

	public VacationSpotViewer(WindowFrame frame,	VacationSpotManager vacationSpotManager ) {
		this.frame = frame;
		this.vacationSpotManager = vacationSpotManager;
		System.out.println("***"+ vacationSpotManager.size() + "***");
		
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");;
		model.addColumn("Name");;
		model.addColumn("Spot");;
		model.addColumn("Price");;
		model.addColumn("Phone");;
		
		for (int i=0; i< vacationSpotManager.size(); i++) {
			Vector row = new Vector();
			VacationSpotInput vsi = vacationSpotManager.get(i);
			row.add(vsi.getId());
			row.add(vsi.getName());
			row.add(vsi.getSpot());
			row.add(vsi.getPhone());
			model.addRow(row);
		}
		
		
		JTable table = new JTable(model);
		
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
