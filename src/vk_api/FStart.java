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
			urlText = TFUrlText.getText();
			add(TFUrlText);
			
			//create Listener for intercept KeyCode ENTER
			TFUrlText.addKeyListener(new KeyListener(){
				public void keyPressed(KeyEvent arg0) {
					if(arg0.getKeyCode()==KeyEvent.VK_ENTER){
						EPContent.setUrl(urlText);
					}
				}
				public void keyReleased(KeyEvent arg0) {}
				public void keyTyped(KeyEvent arg0) {}
			});
						
			//add goButton and than ActionListener
			GoButton goButton = new GoButton();
			add(goButton);
			goButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event){
					
					//assign urlText URL
					
					
					//connection on Internet with url link
					
						//create httpsconnection and take content
						//HttpConnection httpConnection = new HttpConnection(urlText);
						
						
						//open SaveFileDialog for save result
						//SaveFileDialog saveFileDialog = new SaveFileDialog();
						//saveFileDialog.ShowSaveDialog();
						
						//write content in file with name saveFileDialog.getFileName()
						/*if(saveFileDialog.getFileName()!=null){
							WriteFile writeFile = new WriteFile();
							writeFile.setFileName(saveFileDialog.getFileDirectory()+saveFileDialog.getFileName());
							writeFile.setFileContent(httpConnection.getContent());
							writeFile.GoWriteFile();
						}	*/				
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
		
		EPContent = new ViewHTMLContent();
		add(EPContent,BorderLayout.CENTER);
	}
}
