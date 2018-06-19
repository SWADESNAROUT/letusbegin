import java.util.*;
public class additionoftwonos 
{
	//int num1, num2, sum;
	public static void main(String []args)
	{
		
		System.out.print("enter two nos Num1 and Num2 :");
		Scanner input = new Scanner(System.in);
		float num1 = input.nextFloat();
		float num2 = input.nextFloat();
		
		System.out.println("Sum:" + (num1 + num2));
		System.out.println("Diff:" + (num1 - num2));
		System.out.println("Prod:" + (num1 * num2));
		System.out.println("DIVI:" + (num1 / num2));
	}
	
	

}
