package basic_assignments;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int number = 153, originalnumber, remainder, result;
		result=0;
		originalnumber = number;
		while(number > 0) {
			remainder = number % 10;
			number = number/10;
			result = result + remainder*remainder*remainder;
			
		}
		if(result == originalnumber)
		{
			System.out.println("The number is Armstrong Number");
		}
		else
		{
			System.out.println("The number is not Armstrong number");
		}
		
	}

}
