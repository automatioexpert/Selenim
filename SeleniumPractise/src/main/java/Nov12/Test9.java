package Nov12;

import org.testng.annotations.Test;


public class Test9 {
	
	String str;
	@Test(priority = 0, enabled = true)
	public void m1() {
		System.out.println("m1 test");
		str="test8838838";
		
	}
	

	@Test(priority = 1)
	public void m2() {
		System.out.println("m1 test"+str);
		
		
	}

	
}
