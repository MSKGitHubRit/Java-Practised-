package exceptionhandling;
import java.util.Scanner;

public class UserdefinedException {
	
	static int amount=400;
	
	void method()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the amount");
		int uentered=sc.nextInt();
		try
		{
			if(amount>uentered)
			{
				throw new ClassE("you not have enough amount");
			}
			else
			{
				System.out.println("transaction succedded");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new UserdefinedException().method();
	}

}
