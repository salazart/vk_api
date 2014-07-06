package vk_api;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

//create frame for main window
class FStart extends JFrame{	
	private static String urlText;
	private static JEditorPane EPContent;
	
	private class UrlPanel extends JPanel{
		public UrlPanel(){
			//add TextField for write text url
			final UrlTextField TFUrlText = new UrlTextField();
			add(TFUrlText);
			
			UrlTextField urlTextField = new UrlTextField();
			
			//add goButton
			GoButton goButton = new GoButton();
			add(goButton);
			goButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event){
					//assign urlText URL
					urlText = TFUrlText.getText();
					//connection on Internet with url link
					Connection connection = new Connection(urlText);
					EPContent.setText(connection.getContent());
				}
			});
			
			//add button stop
			JButton stopButton = new JButton("Stop");
			add(stopButton);
			
		}
	}
	//This is main method
	public FStart(){
		//change size window FStart
		RatedScreenSize ratedScreenSize = new RatedScreenSize();
		setSize(ratedScreenSize.getRatedWidth(),ratedScreenSize.getRatedHeight());
		
		//add up panel on window for navigation
		UrlPanel urlPanel = new UrlPanel();
		add(urlPanel,BorderLayout.NORTH);
		
		//add JEditorPane for print content from server
		EPContent = new JEditorPane();
		add(EPContent);
		
	}
}
