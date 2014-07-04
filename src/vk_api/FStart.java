package vk_api;

import javax.swing.*;

class FStart extends JFrame{	
	public FStart(){
		RatedScreenSize ratedScreenSize = new RatedScreenSize();
		setSize(ratedScreenSize.getRatedWidth(),ratedScreenSize.getRatedHeight());
	
	}
}
