package vk_api;

import java.awt.*;

class RatedScreenSize {
	private int screenWidth;
	private int screenHeight;
	RatedScreenSize(){
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		screenWidth = screenSize.width/2;
		screenHeight = screenSize.height/2;
	}
	public int getRatedWidth(){
		return(screenWidth);
	}
	public int getRatedHeight(){
		return(screenHeight);
	}

}
