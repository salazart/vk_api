package vk_api;

import java.io.*;
import java.net.*;

import javax.net.ssl.*;

//create https connection 
class HttpsConnection {
	private static String outContent = null;
	public HttpsConnection(String urlText) throws IOException{
		try {
			
			//urlText="api.vk.com/method/friends.get.xml?user_id=184221595&v=5.21&fields=bdate,city,country,contacts,home_town&access_token=d410a9a014a6f0c4fb8c22e2273e813c1bbfc0719a207917c881cac159bbb8aba74f711922c3d096f4442";
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
	public String getContent(){
		return outContent;
	}

}
