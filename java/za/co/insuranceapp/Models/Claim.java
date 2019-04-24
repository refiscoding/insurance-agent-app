package za.co.insuranceapp.Models;

public class Claim {
    String customer;
    String policy;
    String details;

    String effectiveDate;
    String expiryDate;
    String risk;

    String sumInsured;
    String premium;


    String dateReported;
    String detailsClaim;
    String otherParty;

    String contacts;

    String policeStation;
    String obNumber;
    String towingCar;
    String yard;

    public Claim(String customer, String policy, String details, String effectiveDate, String expiryDate, String risk, String sumInsured, String premium, String dateReported, String detailsClaim, String otherParty, String contacts, String policeStation, String obNumber, String towingCar, String yard) {
        this.customer = customer;
        this.policy = policy;
        this.details = details;
        this.effectiveDate = effectiveDate;
        this.expiryDate = expiryDate;
        this.risk = risk;
        this.sumInsured = sumInsured;
        this.premium = premium;
        this.dateReported = dateReported;
        this.detailsClaim = detailsClaim;
        this.otherParty = otherParty;
        this.contacts = contacts;
        this.policeStation = policeStation;
        this.obNumber = obNumber;
        this.towingCar = towingCar;
        this.yard = yard;
    }


    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
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

    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }

    public String getSumInsured() {
        return sumInsured;
    }

    public void setSumInsured(String sumInsured) {
        this.sumInsured = sumInsured;
    }

    public String getPremium() {
        return premium;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }

    public String getDateReported() {
        return dateReported;
    }

    public void setDateReported(String dateReported) {
        this.dateReported = dateReported;
    }

    public String getDetailsClaim() {
        return detailsClaim;
    }

    public void setDetailsClaim(String detailsClaim) {
        this.detailsClaim = detailsClaim;
    }

    public String getOtherParty() {
        return otherParty;
    }

    public void setOtherParty(String otherParty) {
        this.otherParty = otherParty;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getPoliceStation() {
        return policeStation;
    }

    public void setPoliceStation(String policeStation) {
        this.policeStation = policeStation;
    }

    public String getObNumber() {
        return obNumber;
    }

    public void setObNumber(String obNumber) {
        this.obNumber = obNumber;
    }

    public String getTowingCar() {
        return towingCar;
    }

    public void setTowingCar(String towingCar) {
        this.towingCar = towingCar;
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard;
    }
}
