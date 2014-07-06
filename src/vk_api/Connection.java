package vk_api;

import java.io.*;
import java.net.*;

//create Connection with Inet
class Connection {
	private String urlConnection;
	public Connection() throws IOException{
		URL urlText = new URL("https://"+urlConnection);
		BufferedReader outTextConn = new BufferedReader(
				new InputStreamReader(urlText.openStream()));
		
	}
	public void setUrlConnection(String urlText){
		urlConnection=urlText;
	}

}
