package corepackage;


@FunctionalInterface
interface TestInterface
{
    public void show();
  
}

public class Demo {

	public static void main(String[] args) {
		
		  new TestInterface() { public void show() {
		  System.out.println("hello world"); }
		  
		  } .show();
		  
		  //============================================
		  
			TestInterface f = () -> {
				System.out.println("hello world..............");
			};

		  f.show();
		 
		
		
		
		/*
		 * 
		 * Runnable run = () -> System.out.println("Thread");
		 * 
		 * Thread t = new Thread(run); t.start();
		 */

	}

}
