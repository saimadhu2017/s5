package even;

import static org.junit.Assert.*;

import org.junit.Test;

public class evenTest {

	@Test
	public void test1() {
		even e=new even();
		assertEquals(true,e.even1(3));
	}

}
