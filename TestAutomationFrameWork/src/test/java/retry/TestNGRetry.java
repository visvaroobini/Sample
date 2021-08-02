package retry;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestNGRetry {
	int count = 0;
	@Test
	public void test1() {
		System.out.println("This is test 1");
	}

	@Test(retryAnalyzer = listeners.RetrySetup.class )
	public void test2() {
		count ++;
		System.out.println("This is test 2 **** count = " + count );
		Assert.assertTrue(count>=3);
		
	
	}

	@Test(retryAnalyzer = listeners.RetrySetup.class )
	public void test3() {
		
		count ++;
		System.out.println("This is test 3 **** count = " + count );
		Assert.assertTrue(count>=5);
		
	}
}


