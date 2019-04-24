package za.co.insuranceapp.Models;

public class MotorCertificate {

    String certNo;
    String insuranceCompany;
    String effectiveDate;
    String expiryDate;
    String client;
    String vehicleRegNo;

    public MotorCertificate() {
    }

    public MotorCertificate(String certNo, String insuranceCompany, String effectiveDate, String expiryDate, String client, String vehicleRegNo) {
        this.certNo = certNo;
        this.insuranceCompany = insuranceCompany;
        this.effectiveDate = effectiveDate;
        this.expiryDate = expiryDate;
        this.client = client;
        this.vehicleRegNo = vehicleRegNo;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
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

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getVehicleRegNo() {
        return vehicleRegNo;
    }

    public void setVehicleRegNo(String vehicleRegNo) {
        this.vehicleRegNo = vehicleRegNo;
    }
}
