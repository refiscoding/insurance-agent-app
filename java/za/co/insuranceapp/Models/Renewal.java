package ke.co.insuranceapp.Models;

public class Renewal {
    String clientName;//
    String risk;
    String insured;
    String effectiveDate;
    String expiryDate;
    String premium;
    String insuranceCompany;
    String phoneNumber;

    public Renewal() {
    }

    public Renewal(String clientName, String risk, String insured, String effectiveDate, String expiryDate, String premium, String insuranceCompany, String phoneNumber) {
        this.clientName = clientName;
        this.risk = risk;
        this.insured = insured;
        this.effectiveDate = effectiveDate;
        this.expiryDate = expiryDate;
        this.premium = premium;
        this.insuranceCompany = insuranceCompany;
        this.phoneNumber = phoneNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
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

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
