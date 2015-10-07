package ba.bitcamp.boris.exercises.day3.task5;

import ba.bitcamp.boris.exercises.day3.task1.Speakerphone;
import ba.bitcamp.boris.exercises.day3.task2.Battery;
import ba.bitcamp.boris.exercises.day3.task3.Antenna;
import ba.bitcamp.boris.exercises.day3.task4.Display;

public class CellPhone {
	
	private String name;
	private Antenna antenna;
	private Speakerphone speaker;
	private Display display;
	private Battery battery;
	
	
	public CellPhone(String name, Antenna antenna, Speakerphone speaker, Display display,Battery baterry) {
		this.name = name;
		this.antenna = antenna;
		this.speaker = speaker;
		this.display = display;
		this.battery = baterry;
	}

	public String toString() {
		String s = "";
		s += "Name of phone:\t\t\t " + name + "\n";
		s += "Battery level:\t\t\t " + battery.getBattery() + "\n";
		s += "Antenna battery consumption:\t " + antenna.getBatteryConsumptionPerHour() + "\n";
		s += "Speaker battery consumption:\t " + speaker.getBatteryConsumptionPerHour() + "\n";
		s += "Display battery consumption:\t " + display.getBatteryConsumptionPerHour() + "\n";
		
		return s;
	}
	
	
	public int getHowMuchBatteryLast() {
		if (speaker.getIsItON() == true && battery.getBattery() != 0 && display.isDisplayON() == false && antenna.getSignalStrength() > 2) {
			System.out.print("Display is OFF, signal is high so battery will last ");
			return battery.getBattery() - antenna.getBatteryConsumptionPerHour() - speaker.getBatteryConsumptionPerHour();
		} else if (speaker.getIsItON() == false && battery.getBattery() != 0 && display.isDisplayON() == false && antenna.getSignalStrength() > 2) {
			System.out.print("Display and speaker are OFF, signal is high so battery will last ");
			return battery.getBattery() - antenna.getBatteryConsumptionPerHour();
		} else if (speaker.getIsItON() == true && battery.getBattery() != 0 && display.isDisplayON() == true && antenna.getSignalStrength() > 2) {
			System.out.print("Signal is high and everything is turned ON so battery will last ");
			return battery.getBattery() - antenna.getBatteryConsumptionPerHour() - speaker.getBatteryConsumptionPerHour() - display.getBatteryConsumptionPerHour();
		} else if (speaker.getIsItON() == false && battery.getBattery() != 0 && display.isDisplayON() == true && antenna.getSignalStrength() > 2) {
			System.out.print("Speaker is OFF, Display is ON, signal is high so battery will last ");
			return battery.getBattery() - antenna.getBatteryConsumptionPerHour() - display.getBatteryConsumptionPerHour();
		} else if (speaker.getIsItON() == true && battery.getBattery() != 0 && display.isDisplayON() == false && antenna.getSignalStrength() < 2) {
			System.out.print("Display is OFF, signal is low so battery will last ");
			return battery.getBattery() - (antenna.getBatteryConsumptionPerHour() * 2) - speaker.getBatteryConsumptionPerHour();
		} else if (speaker.getIsItON() == false && battery.getBattery() != 0 && display.isDisplayON() == false && antenna.getSignalStrength() < 2) {
			System.out.print("Display and speaker are OFF, signal is low so battery will last ");
			return battery.getBattery() - (antenna.getBatteryConsumptionPerHour() * 2);
		} else if (speaker.getIsItON() == true && battery.getBattery() != 0 && display.isDisplayON() == true && antenna.getSignalStrength() < 2) {
			System.out.print("Signal is low and everything is turned ON so battery will last ");
			return battery.getBattery() - (antenna.getBatteryConsumptionPerHour() * 2) - speaker.getBatteryConsumptionPerHour() - display.getBatteryConsumptionPerHour();
		} else if (speaker.getIsItON() == false && battery.getBattery() != 0 && display.isDisplayON() == true && antenna.getSignalStrength() < 2) {
			System.out.print("Speaker is OFF, Display is ON, signal is high so battery will last ");
			return battery.getBattery() - (antenna.getBatteryConsumptionPerHour() * 2) - display.getBatteryConsumptionPerHour();
		}
		return 0;
	
		
	}

	
}
