package week1.day1.Assignments;

public class PrimeNumber {
	
	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13
	 * output: 13 is a Prime Number
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare an int Input and assign a value 13
		
		int input=13;
		// Declare a boolean variable flag as false
		boolean flagvalue=false;
		
		// Iterate from 2 to half of the input
		
		for (int i=1;i<=input/2;i++)
		{
			// Divide the input with each for loop variable and check the remainder
			int remainder = input%i;
			if (remainder==0)
				flagvalue=true;
			break;
			
		}
		if(flagvalue==true)
			System.out.println("Prime");
		else if (flagvalue ==false)
			System.out.println("Not Prime");

	}

}
