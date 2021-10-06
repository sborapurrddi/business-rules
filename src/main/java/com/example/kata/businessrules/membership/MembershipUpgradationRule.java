package com.example.kata.businessrules.membership;

import com.example.kata.businessrules.payment.Payment;
import com.example.kata.businessrules.rule.VoidRule;

public class MembershipUpgradationRule implements VoidRule {

    private final UpgradeMembership membership;
    private final Payment payment;

    public MembershipUpgradationRule(final UpgradeMembership membership, final Payment payment) {
        this.membership = membership;
        this.payment = payment;
    }

    @Override
    public void apply() {
        membership.upgradeMembership();
    }
}
