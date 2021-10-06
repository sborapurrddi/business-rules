package com.example.kata.businessrules.membership;

public class UpgradeMembership {

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public String getMembershipType() {
        return membershipType;
    }

    private String membershipType;

    public void upgradeMembership() {
        membershipType = "gold";
    }
}
