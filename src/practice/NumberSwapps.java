package practice;

public class NumberSwapps {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		System.out.println("Before swappin: "+"a="+a+" b="+b);

   //1st approach:
//		a=a+b;
//		b=a-b;
//		a=a-b;
//	2nd approach
		//int temp;
//		temp=a;
//		a=b;
//		b=temp;
		
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After swapping: a="+a+ " b="+b);
		
		

	}

}
