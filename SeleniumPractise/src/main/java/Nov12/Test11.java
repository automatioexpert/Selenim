package Nov12;

import org.testng.annotations.Test;

public class Test11 {
	String str;

	@Test(alwaysRun = true, priority = 0)
	public void m1() {
		str = "nsdn34934";
		System.out.println(str);
		System.out.println(str.length());
	}

	@Test(priority = 1)
	public void m2() {
		System.out.println(str);
	}
}
