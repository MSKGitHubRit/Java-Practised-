package daemonthreadconcept;

public class Daemondemo  extends Thread{
	
	@Override
	public void run()
	{
		int i=0;
		while(true)
		{
			i=i+1;
			System.out.println("Daemon"+i);
		}
	}
	public static void main(String[] args) {
		Daemondemo d=new Daemondemo();
		Thread t=new Thread(d);
		t.setDaemon(true);
		t.start();
		for(int i=0;i<=20;i++)
		{
			System.out.println("main():"+i);
		}
		System.out.println("exist main()");
		
			
	}

}
