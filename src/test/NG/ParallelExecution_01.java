package test.NG;

import org.testng.annotations.Test;

public class ParallelExecution_01 {
  @Test
  public void testCase1() throws InterruptedException{
  long id = Thread.currentThread().getId();
  System.out.println("Test Case 1 is Successful - Thread id is: "+ id);
  for (int i=0;i <10; i++)
	  {System.out.println(i);
      Thread.sleep(1000);
	  }}
  @Test
  public void testCase2() throws InterruptedException{
  long id = Thread.currentThread().getId();
  System.out.println("Test Case 2 is Successful - Thread id is: "+ id);   
  for (int i=0;i <10; i++) {
	  System.out.println(i+20);
  Thread.sleep(1000);}
  }
  @Test
  public void testCase3() throws InterruptedException{
  long id = Thread.currentThread().getId();
  System.out.println("Test Case 3 is Successful - Thread id is: "+ id);     
  for (int i=0;i <10; i++) {
	  System.out.println(i+40);
  Thread.sleep(1000);}
  }

}
