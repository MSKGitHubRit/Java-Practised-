package interfaceconcept;

public interface InterfaceA {
	int x=10;//by default all the variable are public,static,final
	void meth1();//by default public abstract
    default void meth2()
	{
		System.out.println("meth2()");
		this.meth4();
	}
    static void meth3()
    {
    	System.out.println("staticmethod");
//    	meth4(); c.e we can't use this in staic area
    }
    private void meth4()
    {
    	System.out.println("private method");
    }
    public static void main(String[] args) {
		//we can't instanitiated for Inteface same as abstraction
    	System.out.println(x);//static variable
    	InterfaceA.meth3();//we can access static with help of Interface
    	
    	
	}
	
	

}
