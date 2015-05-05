package com.example.aspectj;

import org.joda.time.DateTime;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DateTimeToStringAspectTest {
	@Test
	public void testDateTimeToString() throws Exception {
		assertThat(new DateTime().toString(), is(DateTimeToStringAspect.TO_STRING_RESULT));
	}
}
