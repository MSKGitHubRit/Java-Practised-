package objectmethods;

public class PrgmFinallize {
	
	public void show()
	{
		System.out.println("iam show");
	}
	protected void finalize()
	{
		System.out.println("Garbage has been callected");
	}
	public static void main(String[] args) {
		PrgmFinallize ob1=new PrgmFinallize();
		PrgmFinallize ob2=new PrgmFinallize();
		ob1.show();
		//ob1=null;
		System.gc();//calling garbage collector manually
		
	}

}
/*
 * when the if no connection of an object internally gc will
 * will be destroy the object with the help of finalize()
 * even we not call the finallize() method it will happens*/
