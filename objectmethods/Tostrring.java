package objectmethods;

public class Tostrring {
	public void show()
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		Tostrring aobj1=new Tostrring();
		Tostrring aobj2=new Tostrring();
		System.out.println("tostring:"+aobj1.toString());
		System.out.println("tostring:"+aobj2.toString());
	}

}
/*toString() method will return the String classnameandsomehashcode
 * toString() method will converting object to Stringformat 
 * every time object of string will be changes because of hashCode()
 * syntax:
 * public String toString()
 * {
 * 		return getClass().getName()+"@"+Integer.toHexString(hashCode());
 * }
 * */
 