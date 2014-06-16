package com.spb;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		HelloWorld hw = new HelloWorld();
		String msg = hw.greeting();
		assertEquals(msg,"Hello World");
	}

}
