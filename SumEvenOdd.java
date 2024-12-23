package JavaProgram;

public class SumEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0, n=20;
		int evenSum=0, oddSum=0;
		while(i<=n) {
			if(i%2==0) {
				evenSum+=i;
			}
			else
				oddSum+=i;
			i++;
		}
		System.out.println("the Even Sum is "+evenSum);
		System.out.println("the Odd Sum is "+oddSum);
		
	}

}
