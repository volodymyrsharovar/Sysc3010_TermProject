package client.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import client.model.NoiseAlarm;
import client.model.ThermometerBarChart;
import client.view.BMS_GUI;

public class MainController implements ActionListener {

	BMS_GUI gui;
	NoiseAlarm na;
	ThermometerBarChart tbc ;

	
	public MainController(BMS_GUI gui) {
		this.gui = gui;
		this.na = new NoiseAlarm(gui);
		this.tbc = new ThermometerBarChart(gui);
	}
	

	// the action handler handls the events generated by the buttons and change
	// the model accordingly
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equalsIgnoreCase("Sound Off")) {

			na.setAlarmPlaying(false);
			gui.getAlarmSoundOff().setText("Sound ON");
		}
		if (e.getActionCommand().equalsIgnoreCase("Sound ON")) {
			na.setAlarmPlaying(true);
			gui.getAlarmSoundOff().setText("Sound OFF");

		}
		if (e.getActionCommand().equalsIgnoreCase("Toggle Units")) {
			tbc.toggleUnits();
		}

	}
	public BMS_GUI getGui() {
		return gui;
		
	}

	public NoiseAlarm getNa() {
		return na;
	}

	public ThermometerBarChart getTbc() {
		return tbc;
	}

}
