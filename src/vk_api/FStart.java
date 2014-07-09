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
					try {
						HttpsConnection httpsConnection = new HttpsConnection(urlText);
						EPContent.setText(httpsConnection.GetContent());
						
						SaveFileDialog saveFileDialog = new SaveFileDialog();
						saveFileDialog.ShowSaveDialog();
						
						//write content in file with name saveFileDialog.getFileName()
						WriteFile writeFile = new WriteFile();
						writeFile.setFileName(saveFileDialog.getFileDirectory()+saveFileDialog.getFileName());
						writeFile.setFileContent(httpsConnection.GetContent());
						writeFile.GoWriteFile();
						
						
					
					} catch (IOException e) {
						EPContent.setText("Invalid connection");
					}
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
