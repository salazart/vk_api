package vk_api;

import java.io.*;
import java.net.*;

import javax.net.ssl.*;

//create https connection 
class HttpsConnection {
	private static String outContent = null;
	public HttpsConnection(String urlText) throws IOException{
		try {
			URL url = new URL("https://"+urlText);
			HttpsURLConnection con = (HttpsURLConnection)url.openConnection();
			if(con!=null){
				BufferedReader br = 
						new BufferedReader(
							new InputStreamReader(con.getInputStream()));
				
				//reading stream with BufferedReader
				String tempContent;
				while ((tempContent=br.readLine()) != null){
					//if outContent is first record
					if(outContent==null){
						outContent=tempContent;
						continue;
					}
					outContent=outContent+tempContent+"\r\n";
				   }
				   br.close();
			}
		} catch (MalformedURLException e) {
			System.out.println("Error in connection");
		}
	}
	public String GetContent(){
		return outContent;
	}

}
