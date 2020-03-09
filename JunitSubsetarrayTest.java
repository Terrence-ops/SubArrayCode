package programmingtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitSubsetarrayTest {

	@Test
	public void test() {
		int[] arr1 = {1,2,4,5,6,7,8};
		int sum = 7;
		SubSetSum test = new SubSetSum();
		
		int output = test.locateSubarr(arr1, sum);
		assertEquals(1,6, output);

		
		
		
		
		
		
		
	}

}
