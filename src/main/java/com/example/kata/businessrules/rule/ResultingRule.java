package com.example.kata.businessrules.rule;

public interface ResultingRule<ResultType> {
	void apply ();

	ResultType result ();
}
