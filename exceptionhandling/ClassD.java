package exceptionhandling;

public class ClassD {
	
		@overridden 
		public String toString()
		{
			return "hi";
		}
	
	
	public static void main(String[] args) {
			ClassD dobj=new ClassD();
//			System.out.println(dobj);
//			System.out.println(dobj.toString());
			String result=dobj.toString();
			System.out.println(result);
	}

}
//System.out.println(dobj);
//System.out.println(dobj.toString());
//the both above lines will gives belong to objectclass
//it will gives the addresslocation of that object of stringclass even u don't call
//compiler will automatically will give he address location of the string.
//if u want override the objectclass use the methodoverriding concept.