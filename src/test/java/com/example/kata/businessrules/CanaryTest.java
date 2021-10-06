package com.example.kata.businessrules;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CanaryTest {

	@Test
	public void canary1 () {

		assertThat(true, is(true));
	}


}
