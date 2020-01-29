package demo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AgeTest2 {

	/*@Test
	public void test() {
		Age age=new Age();
		assertEquals("eligible to vote",age.election(5));
	}
	@Test
	public void test1() {
		Age age=new Age();
		assertEquals("eligible to vote",age.election(23));
	}*/
	
	Age age;//this dummy object initialiess soem refernce
	@Before
	public void inti() {
		age=new Age();
	}
	@Test
	public void test() {
		assertEquals("eligible to vote",age.election(59));
	}
	@Test
	public void test1() {
		assertEquals("eligible to vote",age.election(32));
	}
}
