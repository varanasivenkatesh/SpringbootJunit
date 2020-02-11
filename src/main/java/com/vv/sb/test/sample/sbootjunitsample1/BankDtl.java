package com.vv.sb.test.sample.sbootjunitsample1;

public class BankDtl {


    private String bankName;

    @Override
    public String toString() {
        return "BankDtl{" +
                "bankName='" + bankName + '\'' +
                ", bankLocation='" + bankLocation + '\'' +
                ", bankIfscCode='" + bankIfscCode + '\'' +
                '}';
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankLocation() {
        return bankLocation;
    }

    public void setBankLocation(String bankLocation) {
        this.bankLocation = bankLocation;
    }

    public String getBankIfscCode() {
        return bankIfscCode;
    }

    public void setBankIfscCode(String bankIfscCode) {
        this.bankIfscCode = bankIfscCode;
    }

    private String bankLocation;
    private String bankIfscCode;


    public BankDtl(String bankName, String bankLocation, String bankIfscCode) {
        this.bankName = bankName;
        this.bankLocation = bankLocation;
        this.bankIfscCode = bankIfscCode;
    }






}
