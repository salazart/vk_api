package vk_api;

import java.awt.Color;

import javax.swing.*;

//create UrlString for frame 
class UrlPanel extends JPanel{
	public UrlPanel(){
		
		JTextField urlText = new JTextField(20);
		add(urlText);
		
		JButton goButton = new JButton("Go");
		add(goButton);
		
		JButton stopButton = new JButton("Stop");
		add(stopButton);
		
	}
}
