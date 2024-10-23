package org.javaproject;

public class MultiClubMember extends Member{
    private int membershipPoints;

    MultiClubMember(char pMemberType,int pMemberId,String pName,double pFees,int pMembershipPoints) {
        super(pMemberType, pMemberId, pName, pFees);
        this.membershipPoints = pMembershipPoints;
    }

    public int getMembershipPoints() {
        return membershipPoints;
    }

    public void setMembershipPoints(int pMembershipPoints) {
        this.membershipPoints = pMembershipPoints;
    }

    @Override
    public String toString() {
        return super.toString()+", "+membershipPoints;
    }
}
