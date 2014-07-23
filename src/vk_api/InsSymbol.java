package vk_api;
//insert symbol in string with index
class InsSymbol {
	private String insString;
	
	public InsSymbol(String string, String symbol, int index){
		if(index==0){
			string=symbol+string.substring(index+1);
		}else if(index==string.length()-1){
			string=string.substring(0,string.length()-1)+symbol;
		}else {
			string=string.substring(0,index)+symbol+string.substring(index,string.length()-1);
		}
		
		insString=string;
	}
	public String GetInsString(){
		return insString;
	}
}
