package edu.iis.mto.time;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.iis.mto.faketime.FakeTimeSource;

public class OrderTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test(expected = OrderExpiredException.class)
	public void testOrderExpiredExceptionThrownAfterExpirationTime() {
		
		Order order = new Order(new FakeTimeSource());
		order.submit();
		order.confirm();
	}

}
