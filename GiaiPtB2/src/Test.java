import static org.junit.Assert.*;


public class Test {

	@org.junit.Test
	public void Test1() {
		GiaiPtB2 g = new GiaiPtB2();
		assertEquals(g.Giai(1,7,1),"err");
	}
	public void Test3() {
		GiaiPtB2 g = new GiaiPtB2();
		assertEquals(g.Giai(0,1,1),"-1");
	}
	public void Test2() {
		GiaiPtB2 g = new GiaiPtB2();
		assertEquals(g.Giai(1,2,1),"1");
	}

}
