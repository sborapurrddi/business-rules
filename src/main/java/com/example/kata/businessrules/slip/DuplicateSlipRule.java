package com.example.kata.businessrules.slip;

import com.example.kata.businessrules.payment.Payment;
import com.example.kata.businessrules.rule.ResultingRule;

public class DuplicateSlipRule implements ResultingRule<DuplicateSlip> {
	private final Book book;
	private final Payment payment;

	private DuplicateSlip result;

	public DuplicateSlipRule (final Book book, final Payment payment) {
		this.book = book;
		this.payment = payment;

	}

	@Override
	public void apply () {
		result = new DuplicateSlip();

	}

	@Override
	public DuplicateSlip result () {
		return result;
	}
}
