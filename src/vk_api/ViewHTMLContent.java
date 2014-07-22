package vk_api;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.*;

//creates JEditorPane for view HTMLContent
class ViewHTMLContent extends JPanel{
	private JEditorPane editorPane;
	public ViewHTMLContent(){		
		
		//This is properties object JPanel
		setBackground(Color.red);			
		setLayout (new GridLayout (1, 1));
		
		editorPane = new JEditorPane();
		JScrollPane scrollPane = new JScrollPane(editorPane);
		add(scrollPane,BorderLayout.CENTER);
	}
	public void setUrl(String url){
		try {
			editorPane.setPage(url);
			
		} catch (IOException e) {
			editorPane.setText("Invalid connection");
		}
	}
	public void setText(String text){
			editorPane.setText(text);
	}
}