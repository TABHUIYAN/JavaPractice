package practice;

public class PositiveNegative {

	public static void main(String[] args) {

		double num=-20.1;
		if(num>0) {
			System.out.println("Number is positive");
		}
		else if(num<0) {
			System.out.println("Number is negative");
		}
		else {
			System.out.println("Number is zero");
		}
		
		double result=Math.signum(num);	
		System.out.println(result);}
}
