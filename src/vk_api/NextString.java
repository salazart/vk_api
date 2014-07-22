package vk_api;

import java.io.*;
import java.nio.charset.Charset;

//This class return stream on 1 more
public class NextString {
	
	private String abcString="абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
	private String nextString;
	private int lengthString;
	
	private String NextSymbol(String curentSymbol){
		String nextSymbol = null;
		for(int i=0; i<abcString.length(); i++){

			//if curentSymbol equels one symbol begin stream
			if(curentSymbol.equals(abcString.substring(i, i+1))){
				
				//if curentSymbol == end symbol abc
				if(curentSymbol.equals(abcString.substring(abcString.length()-1, abcString.length()))){
					nextSymbol=abcString.substring(0,1);
					//System.out.print(nextSymbol);
					break;
				}
				
				nextSymbol=abcString.substring(i+1, i+2);
				break;
			}
		}
		return nextSymbol;
	}
	
	public NextString(String curentString){
		nextString=curentString;
		lengthString = nextString.length();
		for(int i=lengthString-1; i>=0; i--){
		
			//found next stream
			String nextSymbol = NextSymbol(nextString.substring(i, i+1));
			//create next stream
			if(!nextSymbol.equals(abcString.substring(0,1))){
				nextString = nextString.substring(0,i)+nextSymbol+nextString.substring(i+1,i+2);
				System.out.println(nextString);
				break;
			}else{
				//if stream have without transition
				nextString = nextString.substring(0,i)+nextSymbol;
			}
		}
	}
	
	public String getNextString(){
		return nextString;
	}
}
