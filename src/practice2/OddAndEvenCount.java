package practice2;

public class OddAndEvenCount {

	public static void main(String[] args) {
		int num=112453862;
		int evnCount=0;
		int oddCount=0;
		
		while(num>0) {
			int rem=num%10;
			
			if(rem%2==0) {
				evnCount++;
			}
			else {
				oddCount++;
			}
			num=num/10;
		}
		System.out.println("Even Count : "+ evnCount);
		System.out.println("Odd Count : "+oddCount);
	}

}
