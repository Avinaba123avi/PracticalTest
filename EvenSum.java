# PracticalTest
first java test

public class EvenSum {

	public static void main(String[] args) {
		int firstNumber = 25;
		int lastNumber = 51;
		int sum = 0;
		for(int i = firstNumber;i<=lastNumber;i++)
		{
			if(i%2==0)
			{
				sum = sum + i;
			}
		}
		
		System.out.println("Sum of even numbers between 25 and 51 is = ");

	}

}
