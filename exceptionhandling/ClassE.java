package exceptionhandling;

public class ClassE extends Exception {
	
	String message;
	public ClassE(String message)
	{
		this.message=message;
	}
	//overriding the string 
	public String toString()
	{
		return message;
	}
	
	public static void main(String[] args) {
		ClassE eobj=new ClassE("hi");
		
	}
	

}
