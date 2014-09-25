import static org.junit.Assert.*;

import org.junit.Test;


public class TestNextDate {

	@Test
	public void Test() {
		Date n = new Date(3, 5, 2014);
		assertEquals(n.toString(),"4/5/2014");
	}
	
	@Test
	public void Test_1() {
		Date n = new Date(31, 12, 2013);
		assertEquals(n.toString(),"1/1/2014");
	}
	
	@Test
	public void Test_2() {
		Date n = new Date(28, 2, 2013);
		assertEquals(n.toString(),"1/3/2013");
	}
	
	@Test
	public void Test_3() {
		Date n = new Date(28, 2, 2012);
		assertEquals(n.toString(),"29/2/2012");
	}
	
	@Test
	public void Test_4() {
		Date n = new Date(29, 2, 2012);
		assertEquals(n.toString(),"1/3/2012");
	}
}
