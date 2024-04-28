package exceptionhandling;

import java.io.FileReader;

public class ClassC {
	static int availablebalance=500;
	void display(int amount)
	{
		if(availablebalance<amount)
		{
			throw new RuntimeException("Insuffient balance!!");
		}
		else
		{
			System.out.println("transaction succedded");
		}
	}
	void display2() throws Exception
	{
		System.out.println("display called:");
		FileReader fr=new FileReader("C:\\Users\\Shiva.LAPTOP-3GNT2JEM\\Desktop\\html practise");
		System.out.println("exception handling ");
		fr.close();
	}
	public static void main(String[] args) throws Exception {
		ClassC cobj=new ClassC();
//		cobj.display(1000);
		cobj.display2();
		
	}
	

}
