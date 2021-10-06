package com.example.kata.businessrules.membership;

import com.example.kata.businessrules.email.sendEmail;
import com.example.kata.businessrules.payment.Payment;
import com.example.kata.businessrules.rule.VoidRule;

public class MembershipActivationRule implements VoidRule {
	private final Membership membership;
	private final Payment payment;
	private String Sub = "Membership Activation Stutus";
	private String body = "your membership has been activated";

	public MembershipActivationRule (final Membership membership, final Payment payment) {
		this.membership = membership;
		this.payment = payment;
	}

	@Override
	public void apply () {
		membership.activate();
	}
}
