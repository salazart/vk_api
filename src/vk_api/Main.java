package vk_api;

import java.awt.*;

import javax.swing.*;

public class Main {
	public static void main(String[] args){
		EventQueue.invokeLater (new Runnable(){
			public void run(){
				FStart frame = new FStart();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}
