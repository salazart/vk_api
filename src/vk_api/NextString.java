package vk_api;

import java.io.*;
import java.nio.charset.Charset;

//This class return stream on 1 more
public class NextString {
	
	private String abcString="абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
	private String nextString;
	private int lengthString;
	
	private String NextSymbol(String curentSymbol){
		for(int j=0; j<abcString.length(); j++){
			
			//if curent symbol equal curent symbol in abc
			if(curentSymbol.equals(abcString.substring(j,j+1))){
				
				//if current symbol == end symbol in abc
				if(curentSymbol.equals(abcString.substring(abcString.length()-1,abcString.length()))){
					curentSymbol=abcString.substring(0,1);
					break;
				}else{
					curentSymbol=abcString.substring(j+1,j+2);
					break;
				}
			}
		}
		return curentSymbol;
	}
		
	public NextString(String curentString){
		lengthString=curentString.length()-1;
		for(int i=lengthString; i>=0; i--){
		
			String curentSymbol=null;
			curentSymbol=curentString.substring(i,i+1);
			//take next symbol
			curentSymbol=NextSymbol(curentSymbol);

			//if curent symbol == first symbol
			if(curentSymbol.equals(abcString.substring(0,1))){
				InsSymbol insSymbol = new InsSymbol(curentString,curentSymbol,i);
				curentString = insSymbol.GetInsString();
				continue;
			}else{
				InsSymbol insSymbol = new InsSymbol(curentString,curentSymbol,i);
				curentString = insSymbol.GetInsString();
				break;
			}
		}
		nextString=curentString;
	}
	
	public String getNextString(){
		return nextString;
	}
}
