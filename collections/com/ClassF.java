package collections.com;

public class ClassF {
	
	int id;
	String name;
	String dept;
	public ClassF(int id,String name,String dept)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	@Override
	public String toString()
	{
		return id+" "+name+" "+dept;
	}
	

}
