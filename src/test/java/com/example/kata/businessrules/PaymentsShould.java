package com.example.kata.businessrules;

import com.example.kata.businessrules.email.sendEmail;
import com.example.kata.businessrules.membership.Membership;
import com.example.kata.businessrules.membership.UpgradeMembership;
import com.example.kata.businessrules.payment.PaymentProcessor;
import com.example.kata.businessrules.slip.Book;
import com.example.kata.businessrules.slip.DuplicateSlip;
import com.example.kata.businessrules.slip.PhysicalProduct;
import com.example.kata.businessrules.slip.Slip;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class PaymentsShould {

	PaymentProcessor paymentProcessor;

	@Before
	public void setUp () throws Exception {
		paymentProcessor = new PaymentProcessor(new RuleProcessor());
	}

	@Test
	public void generateSlipOnPhysicalProduct(){
		PhysicalProduct physicalProduct = new PhysicalProduct();

		Slip slip = paymentProcessor.pay(physicalProduct);

		assertThat(slip, is(not(nullValue())));
	}

	@Test
	public void generateDuplicateSlipOnBook(){
		Book book = new Book();

		DuplicateSlip duplicateSlip = paymentProcessor.pay(book);

		assertThat(duplicateSlip, is(not(nullValue())));
	}

	@Test
	public void activateMembership(){
		Membership membership = new Membership();
		sendEmail sendEmail = new sendEmail("tst@gmail.com", "sub", "body");

		membership = paymentProcessor.pay(membership, sendEmail);

		assertThat(membership.isActive(), is(true));
	}

	@Test
	public void upgradeteMembership(){
		UpgradeMembership upgradeMembership = new UpgradeMembership();
		sendEmail sendEmail = new sendEmail("tst@gmail.com", "sub", "body");

		upgradeMembership = paymentProcessor.pay(upgradeMembership, sendEmail);

		assertEquals(upgradeMembership.getMembershipType(), "gold");

		}

}
