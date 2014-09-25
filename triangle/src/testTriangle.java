import static org.junit.Assert.*;

import org.junit.Test;


public class testTriangle {

		@Test
		public void Test1() {
			Triangle t = new Triangle();
			assertEquals(t.check(0, -1, 0),-1);
		}
		@Test
		public void Test2() {
			Triangle t = new Triangle();
			assertEquals(t.check(5,5,5),3);
		}
		
		@Test
		public void Test3() {
			Triangle t = new Triangle();
			assertEquals(t.check(4, 7, 3),1);
		}
		@Test
		public void Test4() {
			Triangle t = new Triangle();
			assertEquals(t.check(3, 2, 3),2);
		}
}
