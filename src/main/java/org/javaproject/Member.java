package org.javaproject;

public class Member{

    private char memberType;
    private int memberId;
    private String name;
    private double fees;

    public Member(char pMemberType, int pMemberId, String pName, double pFees) {
        this.memberType = pMemberType;
        this.memberId = pMemberId;
        this.name = pName;
        this.fees = pFees;
    }

    public void setMemberType(char pMemberType) {
        this.memberType = pMemberType;
    }

    public void setMemberId(int pMemberId) {
        this.memberId = pMemberId;
    }

    public void setName(String pName) {
        this.name = pName;
    }

    public void setFees(double pFees) {
        this.fees = pFees;
    }

    public char getMemberType() {
        return memberType;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public double getFees() {
        return fees;
    }
    @Override
    public String toString() {
        return memberType + ", " + memberId + ", " + name + ", " + fees;
    }
}
