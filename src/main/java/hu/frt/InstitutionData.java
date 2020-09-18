package hu.frt;

public class InstitutionData {
    private String type;
    private String name;
    private String omIdentificationNumber;
    private String status;
    private int numberOfTaskLocation;
    private String taxNumber;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOmIdentificationNumber() {
        return omIdentificationNumber;
    }

    public void setOmIdentificationNumber(String omIdentificationNumber) {
        this.omIdentificationNumber = omIdentificationNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumberOfTaskLocation() {
        return numberOfTaskLocation;
    }

    public void setNumberOfTaskLocation(int numberOfTaskLocation) {
        this.numberOfTaskLocation = numberOfTaskLocation;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }


}
