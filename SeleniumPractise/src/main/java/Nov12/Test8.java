package Nov12;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//@Ignore
public class Test8 {
	
	String str;
	@Test(priority = 0,enabled = false)
	public void m1() {
		System.out.println("m1 test");
		str="test1";
		
	}
	

	@Test(priority = 1)
	public void m2() {
		System.out.println("m1 test"+str);
		
		
	}

	
}
