package edu.iis.mto.time;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.iis.mto.faketime.FakeTimeSource;
import edu.iis.mto.faketime.RealTimeSource;
import edu.iis.mto.time.Order.State;

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
	
	@Test
	public void testNewOrderShouldHaveStateCreated() {
		Order order = new Order(new RealTimeSource());
		Assert.assertThat(order.getOrderState(), is(equalTo(State.CREATED)));
	}

}
