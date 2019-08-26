package test.practice;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class TestCalc extends TestCase{
	
	public TestCalc(String name) {
		super(name);
	}
	
	@Override
	public void setUp() {
		System.out.println("Initialised");
	}
	
	@Override
	public void tearDown() {
		System.out.println("Test Case completed");
	}

	@Test
	public void testIsGreater() {
		int n1 = 12;
		int n2 = 10;
		Calc c = new Calc(n1,n2);
		boolean res = c.isGreater();
		
		assertEquals(true, res);
	}
	
	@Test
	public void testIsLesser() {
		int n1 = 8;
		int n2 = 10;
		Calc c = new Calc(n1,n2);
		boolean res = c.isLesser();
		
		assertEquals(true, res);
	}
	@Test
	public void testIsEquals() {
		int n1 = 10;
		int n2 = 10;
		Calc c = new Calc(n1,n2);
		boolean res = c.isEquals();
		
		assertEquals(true, res);
	}
	
	public static TestSuite createTestSuite() {
		TestSuite ts = new TestSuite("AllTests");
		ts.addTest(new TestCalc("testIsGreater"));
		ts.addTest(new TestCalc("testIsLesser"));
		//ts.addTest(new TestCalc("testIsEquals"));
		return ts;
		
	}
	public static void main(String[] args) {
		System.out.println("TestSuite");
		junit.textui.TestRunner.run(createTestSuite());
		
	}
	
	
	
}
