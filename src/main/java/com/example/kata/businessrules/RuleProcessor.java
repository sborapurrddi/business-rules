package com.example.kata.businessrules;

import com.example.kata.businessrules.rule.ResultingRule;
import com.example.kata.businessrules.rule.VoidRule;

public class RuleProcessor {
	public void process (final VoidRule voidRule) {
		voidRule.apply();
	}

	public <T> T process (final ResultingRule<T> rule) {
		rule.apply();
		return rule.result();
	}
}
