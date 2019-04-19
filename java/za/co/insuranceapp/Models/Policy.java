package ke.co.insuranceapp.Models;

public class Policy {

    private String client;
    private String risk;
    private String insured;
    private String insuranceCompany;
    private String effectiveDate;
    private String expiryDate;
    private String premium;
    private String commission;
    private String adminFee;


    public Policy() {
    }

    public Policy(String client, String risk, String insured, String insuranceCompany, String effectiveDate, String expiryDate, String premium, String commission, String adminFee) {
        this.client = client;
        this.risk = risk;
        this.insured = insured;
        this.insuranceCompany = insuranceCompany;
        this.effectiveDate = effectiveDate;
        this.expiryDate = expiryDate;
        this.premium = premium;
        this.commission = commission;
        this.adminFee = adminFee;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }

    public String getInsured() {
        return insured;
    }

    public void setInsured(String insured) {
        this.insured = insured;
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getPremium() {
        return premium;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }

    public String getCommission() {
        return commission;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }

    public String getAdminFee() {
        return adminFee;
    }

    public void setAdminFee(String adminFee) {
        this.adminFee = adminFee;
    }
}
