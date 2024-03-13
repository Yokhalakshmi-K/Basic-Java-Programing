public class RemoveWhitespace{

	public static void main(String[] args){
	
		String str="Welcome to zoho";
		String res=" ";
		for(int i=0;i<str.length();i++){
		
			if(str.charAt(i)!=' ')
				res=res+str.charAt(i);
				
		
		}
		System.out.println(res);
	
	}

}
