package practice2;

public class StringPalindrom {

	public static void main(String[] args) {

		String str="Madam";
		String rev="";
		String orgStr=str;
		
		int len=str.length();
		
		for(int i=len-1;i>=0;i--) 
		{
			rev=rev+str.charAt(i);	
		}
		System.out.println(rev);
		
		if(rev.equalsIgnoreCase(str)) {
			System.out.println("String is palindrom");
		}
		else {
			System.out.println("not Palindrom");
		}
	}

}
