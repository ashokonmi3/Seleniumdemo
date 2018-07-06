package test.NG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class retry {

	@Test
	public void test1() {
		System.out.println("Test 1");
		Assert.assertTrue(false);

	}
}
