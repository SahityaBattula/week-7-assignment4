package testngpackage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGweek7 {

		@Test
		public void test()
		{
			System.out.println("Hello test1");
		}
		@BeforeTest
		public void test2()
		{
			System.out.println("Hello Before test12");
		}
		
		@AfterTest
		public void test1()
		{
			System.out.println("Hello After test13");
	}

}
