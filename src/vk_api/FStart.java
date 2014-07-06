package vk_api;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

//create frame for main window
class FStart extends JFrame{	
	private String temp;
	
	private JEditorPane EPContent;
	
	private class UrlPanel extends JPanel{
		public UrlPanel(){
			//add TextField for write text url
			JTextField urlText = new JTextField(20);
			add(urlText);
			
			//add goButton
			GoButton goButton = new GoButton();
			add(goButton);
			goButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event){
					EPContent.setText("name");
					/*try {
						
						//Connection connection = new Connection();
						//connection.setUrlConnection(urlText);
					} catch (IOException e) {
						e.printStackTrace();
					}*/
				}
			});
			
			//add button stop
			JButton stopButton = new JButton("Stop");
			add(stopButton);
			
		}
	}
	public FStart(){
		//change size window FStart
		RatedScreenSize ratedScreenSize = new RatedScreenSize();
		setSize(ratedScreenSize.getRatedWidth(),ratedScreenSize.getRatedHeight());
		//add up panel on window for navigation
		UrlPanel urlPanel = new UrlPanel();
		add(urlPanel,BorderLayout.NORTH);
		
		EPContent = new JEditorPane();
		add(EPContent);
		
	}
}
