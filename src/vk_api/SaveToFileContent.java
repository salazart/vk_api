package vk_api;

import java.io.IOException;

public class SaveToFileContent {
	public SaveToFileContent(String url){
		HttpsConnection httpsConnection = null;
		//try go HttpsConnection
		try {
			httpsConnection = new HttpsConnection(url);
		} catch (IOException e1) {
			System.out.println("Invalid connection");
		}
	
		//open SaveFileDialog for save result
		SaveFileDialog saveFileDialog = new SaveFileDialog();
		saveFileDialog.ShowSaveDialog();
		
		//write content in file with name saveFileDialog.getFileName()
		if(saveFileDialog.getFileName()!=null){
			WriteFile writeFile = new WriteFile();
			writeFile.setFileName(saveFileDialog.getFileDirectory()+saveFileDialog.getFileName());
			writeFile.setFileContent(httpsConnection.getContent());
			writeFile.GoWriteFile();
		}
	}
}
