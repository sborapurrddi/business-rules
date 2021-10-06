package com.example.kata.businessrules.video;

import com.example.kata.businessrules.payment.Payment;
import com.example.kata.businessrules.rule.ResultingRule;

public class GenerateSlipWithVideoRule implements ResultingRule<AddFreeVideoToSlip> {
    private final AddFreeVideoToSlip addFreeVideo;
    private final Payment payment;
    private AddFreeVideoToSlip result;

    public GenerateSlipWithVideoRule(AddFreeVideoToSlip addFreeVideo, Payment payment, AddFreeVideoToSlip result) {
        this.addFreeVideo = addFreeVideo;
        this.payment = payment;
        this.result = result;
    }

    @Override
    public void apply() {
        result = new AddFreeVideoToSlip();
    }

    @Override
    public AddFreeVideoToSlip result() {
        return result;
    }
}
