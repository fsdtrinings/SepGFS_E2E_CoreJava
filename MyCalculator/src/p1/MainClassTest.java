package p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainClassTest {

	@Test
	@DisplayName("Test doSum() of MainClass, test with positive numbers")
	void testDoSum() {
		MainClass obj = new MainClass();
		
		int sampleInputMin1 = 10;
		int sampleInputMin2 = 20;
		
		int expectedOutput = 30;
		
		int actualOutput = obj.doSum(sampleInputMin1, sampleInputMin2);
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	@DisplayName("Test doSum() of MainClass, test with positive numbers larger number")
	void testDoSum2() {
		MainClass obj = new MainClass();
		
		int sampleInputMax1 = 10000000;
		int sampleInputMax2 = 20000000;
		
		int expectedOutput = 30000000;
		
		int actualOutput = obj.doSum(sampleInputMax1, sampleInputMax2);
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	@DisplayName("Test doSum() of MainClass, for Exception handling")
	void testDoSum3() {
		assertThrows(IllegalArgumentException.class, ()->{
			MainClass obj = new MainClass();
			
			int sampleInputMax1 = 0;
			int sampleInputMax2 = 20000000;
			
			int expectedOutput = 30000000;
			
			int actualOutput = obj.doSum(sampleInputMax1, sampleInputMax2);
		});
		
	}

}//end test class















