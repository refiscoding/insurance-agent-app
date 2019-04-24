package za.co.insuranceapp.Models;

public class Quote {
    String quoteNumber;//
    String effectiveDate;//
    String expiryDate;//
    String client;//
    String product;//
    String status;//
    String insuredObject;//
    String details;//
    String premium;//
    String underwriter;//
    String sumInsured;//

    public Quote() {
    }

    public Quote(String quoteNumber, String effectiveDate, String expiryDate, String client, String product, String status, String insuredObject, String details, String premium, String underwriter, String sumInsured) {
        this.quoteNumber = quoteNumber;
        this.effectiveDate = effectiveDate;
        this.expiryDate = expiryDate;
        this.client = client;
        this.product = product;
        this.status = status;
        this.insuredObject = insuredObject;
        this.details = details;
        this.premium = premium;
        this.underwriter = underwriter;
        this.sumInsured = sumInsured;
    }

    public String getQuoteNumber() {
        return quoteNumber;
    }

    public void setQuoteNumber(String quoteNumber) {
        this.quoteNumber = quoteNumber;
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

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInsuredObject() {
        return insuredObject;
    }

    public void setInsuredObject(String insuredObject) {
        this.insuredObject = insuredObject;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getPremium() {
        return premium;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }

    public String getUnderwriter() {
        return underwriter;
    }

    public void setUnderwriter(String underwriter) {
        this.underwriter = underwriter;
    }

    public String getSumInsured() {
        return sumInsured;
    }

    public void setSumInsured(String sumInsured) {
        this.sumInsured = sumInsured;
    }
}
