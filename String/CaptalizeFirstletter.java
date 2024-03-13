public class CaptalizeFirstletter{

	public static void main(String[] args){
	
		String str=" welcome to zoho";
		String result="";
		String s=s+" ";
		String ns="";
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch!=' ')
				result+=ch;
				else{
					char f=result.charAt(0);
					f=Character.toUpperCase(f);
					ns=ns+f+result.subString(1)+" ";
					result="";
					
				
				}
		
		}
		System.out.println(ns);
	
	}

}
