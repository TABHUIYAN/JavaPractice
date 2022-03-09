package practice2;

public class Test1 {

	public static void main(String[] args) {

		int num=123456789;
		int evenCount=0;
		int oddCount=0;
		while(num>0) {
		if(num%2==0) {
			evenCount++;
		}
		else {
			oddCount++;
		}
		num=num/10;
	}
		
		System.out.println("Even Count : "+ evenCount);
		System.out.println("Odd Count : "+oddCount);
}
	
}

