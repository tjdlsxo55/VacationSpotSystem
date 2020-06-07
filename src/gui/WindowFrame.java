package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame {

	MenuSelection menuselection ;
	VacationSpotAdder vacationspotadder ;
	VacationSpotViewer vacationspotviewer ;

	
	public WindowFrame() {

		this.menuselection = new MenuSelection(this);
		this.vacationspotadder = new VacationSpotAdder(this);
		this.vacationspotviewer = new VacationSpotViewer(this);	
		
		
		
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
