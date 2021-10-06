package com.example.kata.businessrules.payment;

import com.example.kata.businessrules.RuleProcessor;
import com.example.kata.businessrules.comms.AppConstants;
import com.example.kata.businessrules.membership.Membership;
import com.example.kata.businessrules.membership.MembershipActivationRule;
import com.example.kata.businessrules.membership.MembershipUpgradationRule;
import com.example.kata.businessrules.membership.UpgradeMembership;
import com.example.kata.businessrules.slip.Book;
import com.example.kata.businessrules.slip.DuplicateSlip;
import com.example.kata.businessrules.slip.DuplicateSlipRule;
import com.example.kata.businessrules.slip.GenerateSlipRule;
import com.example.kata.businessrules.slip.PhysicalProduct;
import com.example.kata.businessrules.slip.Slip;
import com.example.kata.businessrules.email.sendEmail;
import com.example.kata.businessrules.commission.AgentCommissionRule;

public class PaymentProcessor {

	private final RuleProcessor ruleProcessor;

	public PaymentProcessor (final RuleProcessor ruleProcessor) {
		this.ruleProcessor = ruleProcessor;
	}


	public DuplicateSlip pay (final Book book) {

		return ruleProcessor.process(new DuplicateSlipRule(book, AgentCommissionRule.calculateCommission(new Payment(), AppConstants.BOOK_COMMISSION) ));

	}

	public Slip pay (final PhysicalProduct physicalProduct) {
		return ruleProcessor.process(new GenerateSlipRule(physicalProduct, AgentCommissionRule.calculateCommission(new Payment(), AppConstants.PRODUCT_COMMISSION) ));
	}

	public Membership pay (final Membership membership, final sendEmail sendEmail) {
		ruleProcessor.process(new MembershipActivationRule(membership, new Payment()));
		sendEmail.sendEmailToUser();
		return membership;
	}
	public UpgradeMembership pay (final UpgradeMembership membership, final sendEmail sendEmail) {
		ruleProcessor.process(new MembershipUpgradationRule(membership, new Payment()));
		sendEmail.sendEmailToUser();
		return membership;
	}
}
