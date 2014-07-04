package vk_api;

import java.awt.*;

import javax.swing.*;

//create frame 
class FStart extends JFrame{	
	public FStart(){
		//change size FStart
		RatedScreenSize ratedScreenSize = new RatedScreenSize();
		setSize(ratedScreenSize.getRatedWidth(),ratedScreenSize.getRatedHeight());
		
		UrlPanel urlPanel = new UrlPanel();
		add(urlPanel,BorderLayout.NORTH);
		
		JEditorPane EPContent = new JEditorPane();
		add(EPContent);
	}
}
