package vk_api;

import java.awt.*;
import java.io.File;
import java.io.FilenameFilter;

import javax.swing.*;

//create Save
public class SaveFileDialog {
	private static String FileName;
	private static String WindowTitle="Save file as...";
	private static String FileDirectory;
	
	//Constructor metod
	public SaveFileDialog(){
		
	}
	
	//Show SaveFileDialog window for choise file name
	public void ShowSaveDialog(){
		//JFrame tempFrame = new JFrame();
		FileDialog fileDialog = new FileDialog(new JFrame(), WindowTitle, FileDialog.SAVE);
		fileDialog.addNotify();
		
		fileDialog.setFile("*.xls");
		fileDialog.setVisible(true);
		
		FileName=fileDialog.getFile();
		FileDirectory=fileDialog.getDirectory();
	}
	
	public void setFileName(String fileName){
		FileName=fileName;
	}
	public String getFileName(){
		return FileName;
	}
	public String getFileDirectory(){
		return FileDirectory;
	}
	

}
