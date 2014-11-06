import static org.junit.Assert.*;

public class Test {
	
	@org.junit.Test
	public void Test1() {
		PTbac2 g = new PTbac2(0,0,0);
		assertEquals(g.getN(),3);
		assertNull(g.getX1());
		assertNull(g.getX2());
	}
	
	@org.junit.Test
	public void Test2() {
		PTbac2 g = new PTbac2(0,0,1);
		assertEquals(g.getN(),0);
		assertNull(g.getX1());
		assertNull(g.getX2());
	}
	
	@org.junit.Test
	public void Test3() {
		PTbac2 g = new PTbac2(0,1,0);
		assertEquals(g.getN(),1);
		assertEquals(g.getX1(), new Double(0));
		assertNull(g.getX2());
	}
	
	@org.junit.Test
	public void Test4() {
		PTbac2 g = new PTbac2(0,1,-1);
		assertEquals(g.getN(),1);
		assertEquals(g.getX1(), new Double(1));
		assertNull(g.getX2());
	}
	
	@org.junit.Test
	public void Test5() {
		PTbac2 g = new PTbac2(1,2,3);
		assertEquals(g.getN(),0);
		assertNull(g.getX1());
		assertNull(g.getX2());
	}
	
	@org.junit.Test
	public void Test6() {
		PTbac2 g = new PTbac2(1,-2,1);
		assertEquals(g.getN(),1);
		assertEquals(g.getX1(),new Double(1));
		assertEquals(g.getX2(),new Double(1));
	}
	@org.junit.Test
	public void Test7() {
		PTbac2 g = new PTbac2(1,-3,2);
		assertEquals(g.getN(),2);
		assertEquals(g.getX1(),new Double(1));
		assertEquals(g.getX2(),new Double(2));
	}	
}
