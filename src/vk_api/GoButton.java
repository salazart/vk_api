package vk_api;

import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;
//creat goButton for start transition link
class GoButton extends JButton{
	private String s;
	public GoButton(){
		setText("Go");
		
	}
	public String getGoButtonText(){

		return s;

	}
	
}
