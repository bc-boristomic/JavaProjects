package ba.bitcamp.ludogame;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.net.Socket;

public class Player {
	
	private Color color;
	private String name;
	private Socket socket;
	private BufferedReader reader;
	private BufferedWriter writer;
	
	
	public Player (Socket socket) {
		this.socket = socket;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
