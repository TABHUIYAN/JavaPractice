package practice;

public class VowelConsonent {

	public static void main(String[] args) {
		//a, e,i, o,u
		char ch='a';
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			System.out.println(ch+" is vowel");
		}
		else {
			System.out.println(ch+" is consonenet");
		}
		
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch+" is vowel");
			break;

		default:
			System.out.println(ch+" is consonenet");
			break;
		}
	}

}
