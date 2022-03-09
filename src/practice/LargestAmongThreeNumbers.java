package practice;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
		int x=500;
		int y=400;
		int z=300;
		if(x>y && x>z) {
			System.out.println("x is greatest number");
		}
		else if(y>z) {
			System.out.println("y is greatest number ");
		}
		else {
			System.out.println("z is greatest number");
		}

		if(x>=y) {
			if(y>=z) {
				System.out.println();
			}
		}
	}

}
