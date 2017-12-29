package test.NG;

import org.testng.annotations.Test;

//public class Dependencies {
//	@Test
//	public void method1() {
//		System.out.println("This is method 1");
//	}
//
//	@Test(dependsOnMethods = { "method1" })
//	public void method2() {
//		System.out.println("This is method 2");
//	}// This test will be failed.
//
//	@Test
//	public void method3() {
//		System.out.println("This is method 3");
//		throw new RuntimeException();
//	}
//
//	@Test(dependsOnMethods = { "method3" })
//	public void method4() {
//		System.out.println("This is method 4");
//	}
//
//}
//
public class Dependencies {
	@Test
	public void method1() {
		System.out.println("This is method 1");
	}

	@Test(dependsOnMethods = { "method1" }, alwaysRun = true)
	public void method2() {
		System.out.println("This is method 2");

	}// This test will be failed.

	@Test
	public void method3() {
		System.out.println("This is method 3");
		throw new RuntimeException();
	}

	@Test(dependsOnMethods = { "method3" }, alwaysRun = true)
	public void method4() {
		System.out.println("This is method 4");
	}
}
//
//
