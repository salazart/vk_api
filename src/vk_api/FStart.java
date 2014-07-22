package vk_api;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

//create frame for main window
class FStart extends JFrame{	
	private static String urlText;
	private static ViewHTMLContent EPContent;
	
	private class UrlPanel extends JPanel{
		public UrlPanel(){
			setBackground(Color.blue);
			
			//add TextField for write text url
			final UrlTextField TFUrlText = new UrlTextField();
			add(TFUrlText);
			
			//create Listener for intercept KeyCode ENTER
			TFUrlText.addKeyListener(new KeyListener(){
				public void keyPressed(KeyEvent arg0) {
					if(arg0.getKeyCode()==KeyEvent.VK_ENTER){
						
						//go to link urlText
						EPContent.setUrl(TFUrlText.getText());
					}
				}
				public void keyReleased(KeyEvent arg0) {}
				public void keyTyped(KeyEvent arg0) {}
			});
						
			//add goButton and than ActionListener
			GoButton goButton = new GoButton();
			add(goButton);
			goButton.addActionListener(new GoButtonListener());

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
		
		EPContent = new ViewHTMLContent();
		add(EPContent,BorderLayout.CENTER);
	}
}
