package week1.day1.Assignments;

public class FactorialNumber {
	
	/*
	 * Goal: Find the Factorial of a given number
	 * 
	 * input: 5
	 * output: 5*4*3*2*1 = 120
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 *   
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare your input as 5
		
		int input=5;
		
		// Declare an integer variable fact as 1
		
		int factNum = 1;
		
		// Iterate from 1 to your input (tip: using loop concept)
		
		for (int i=1; i<=input;i++)
		{
			
			factNum = factNum*i;
		}
		
		System.out.println("Factorial Number is: "+factNum);

	}

}
