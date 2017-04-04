package edu.iis.mto.time;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OrderTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test(expected = OrderExpiredException.class)
	public void testOrderExpiredExceptionThrownAfterExpirationTime() {
		fail("Not yet implemented");
	}

}
