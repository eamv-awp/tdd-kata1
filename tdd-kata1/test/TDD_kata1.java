import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TDD_kata1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEmptyStringEqualsZero() {
		assertEquals(0, new StringCalculator().add(""));
	}
	
	@Test
	public void testSingleNumberEqualsNumber() {
		assertEquals(1, new StringCalculator().add("1"));
	}

	@Test
	public void testOneAndTwoEqualsThree() {
		assertEquals(3, new StringCalculator().add("1,2"));
	}

}
