package collections.com;

public class ClassA {
	
	int empid;
	String empname;
	String empdept;
	
	public ClassA(int empid,String empname,String empdept)
	{
		this.empid=empid;
		this.empname=empname;
		this.empdept=empdept;
	}
	@Override
	public String toString()
	{
		return empid+" "+empname+" "+empdept;
	}
	
//note:
	/*
	 * here iam overriding the objectclass (parentclass)
	 * instead of parentclass iam printing the child class i.e toString().
	 * */

}
