package vk_api;

import javax.swing.*;

//create UrlTextField for resize field about screen
class UrlTextField extends JTextField {
	public UrlTextField(){
		RatedScreenSize ratedScreenSize = new RatedScreenSize();
		setColumns(Math.round((ratedScreenSize.getRatedWidth()-140)/11));		
	}
}
