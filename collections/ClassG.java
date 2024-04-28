package collections;

public class ClassG {
	
	int empid;
	String empname;
	String empdept;
	
	ClassG(int id, String name, String empdept)
	{
		this.empid=id;
		this.empname=name;
		this.empdept=empdept;
	}
	public String toString()
	{
		return " "+empid; 
	}

}
