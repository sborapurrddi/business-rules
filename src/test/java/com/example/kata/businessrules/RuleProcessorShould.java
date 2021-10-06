package com.example.kata.businessrules;

import com.example.kata.businessrules.rule.ResultingRule;
import com.example.kata.businessrules.rule.VoidRule;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class RuleProcessorShould {

	private RuleProcessor ruleProcessor;

	@Before
	public void setUp () {
		ruleProcessor = new RuleProcessor();
	}

	@Test
	public void apply_any_void_rule () {
		final VoidRule voidRule = Mockito.mock(VoidRule.class);

		ruleProcessor.process(voidRule);

		Mockito.verify(voidRule).apply();
	}

	@Test
	public void apply_any_resulting_rule () {
		final ResultingRule voidRule = Mockito.mock(ResultingRule.class);

		ruleProcessor.process(voidRule);

		Mockito.verify(voidRule).apply();
		Mockito.verify(voidRule).result();
	}

}
