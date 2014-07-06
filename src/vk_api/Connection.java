package vk_api;

import java.io.*;
import java.net.*;

//create Connection with Inet
class Connection {
	private static String outContent;
	public Connection(String inUrl){
		
		try {
			URL urlText = new URL("https://"+inUrl);
			BufferedReader outTextConn = new BufferedReader(
					new InputStreamReader(urlText.openStream()));
			String inputLine;
			//foor for read strems wish BufferedReader outTextConn
			while((inputLine = outTextConn.readLine())!=null){
				if(outContent == null){
					outContent=inputLine+"\0\n";
					continue;
				}
				outContent=outContent+inputLine+"\0\n";
			}
			outTextConn.close();
		} catch (IOException e) {
			//for Invalid connection or link
			outContent="Invalid connection or link";
		}
		
		
	}
	public String getContent(){
		return outContent;
	}
}
