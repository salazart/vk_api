package vk_api;

import java.io.*;

public class WriteFile {
	//The name the filename
	private static String FName;
	//content for write in file
	private static String FContent;
	public WriteFile(){
		
	}
	//method setFileName indicate filename
	public void setFileName(String fileName){
		if(fileName!=null){
			FName=fileName;
		}else{
			System.out.println("The filename did'n indicated");
		}
	}
	public void setFileContent(String fileContent){
		FContent=fileContent;
	}
	public void GoWriteFile(){
		PrintStream out;
		try {
			out = new PrintStream(new FileOutputStream(FName,true));
			out.println(FContent);
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("Cannot create file");
		}		
	}
}
