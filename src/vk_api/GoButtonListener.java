package vk_api;

import java.awt.event.*;
import java.io.IOException;

class GoButtonListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		String url = "api.vk.com/method/users.get.xml?"
				+ "uids=135717579,215560&offset=1000&count=1000&"
				+ "fields=bdate,city,country,contacts%2Chome_town&"
				+ "access_token=d410a9a014a6f0c4fb8c22e2273e813c1bbfc0719a207917c881cac159bbb8aba74f711922c3d096f4442";
		String url1 = "api.vk.com/method/users.search.xml?"
				+ "q=аа&country=2&offset=1&count=1000&"
				+ "fields=bdate,city,country,contacts%2Chome_town&"
				+ "access_token=d410a9a014a6f0c4fb8c22e2273e813c1bbfc0719a207917c881cac159bbb8aba74f711922c3d096f4442";
		
		//SaveToFileContent saveToFileContent = new SaveToFileContent(url1);
			
		String q = "ааа";
		for(int i=0; i<=1000; i++){
			NextString nextString = new NextString(q);
			q=nextString.getNextString();
			System.out.print(q+" ");

		}
		//System.out.print(nextString.getNextString());
	}			
		
}


