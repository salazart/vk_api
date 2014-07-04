package vk_api;

import java.awt.*;

import javax.swing.JFrame;

public class F_vk_api {
	public static void main(String[] args){
		EventQueue.invokeLater (new Runnable(){
			public void run(){
				JFrame frame = new JFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}
