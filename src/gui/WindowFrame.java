package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.VacationSpotManager;

public class WindowFrame extends JFrame {
	
	VacationSpotManager vacationSpotManager ;
	MenuSelection menuselection ;
	VacationSpotAdder vacationspotadder ;
	VacationSpotViewer vacationspotviewer ;


	
	public WindowFrame(VacationSpotManager vacationSpotManager) {

		
		
		
		this.vacationSpotManager = vacationSpotManager;
		menuselection = new MenuSelection(this);
		vacationspotadder = new VacationSpotAdder(this);
		vacationspotviewer = new VacationSpotViewer(this,this.vacationSpotManager);	
		
		
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setupPanel(menuselection);
		this.setVisible(true);

		
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
		
	}
 

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public VacationSpotAdder getVacationspotadder() {
		return vacationspotadder;
	}

	public void setVacationspotadder(VacationSpotAdder vacationspotadder) {
		this.vacationspotadder = vacationspotadder;
	}

	public VacationSpotViewer getVacationspotviewer() {
		return vacationspotviewer;
	}

	public void setVacationspotviewer(VacationSpotViewer vacationspotviewer) {
		this.vacationspotviewer = vacationspotviewer;
	}

	
}
