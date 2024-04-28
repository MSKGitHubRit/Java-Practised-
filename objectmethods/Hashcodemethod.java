package objectmethods;

public class Hashcodemethod {
	void show()
	{
		System.out.println("hi");
	}

	public static void main(String args[])
	{
		Hashcodemethod aobj1=new Hashcodemethod();
	    Hashcodemethod aobj2=new Hashcodemethod();
	    int x=aobj1.hashCode();
	    int y=aobj2.hashCode();
	    System.out.println("aobj1hashCode:" +x);
	    System.out.println("aobj2hashCode:" +y);
	    
	    
	}
}
/*hashCode() method which not gives the address location 
 * it will give the unique identification number */
