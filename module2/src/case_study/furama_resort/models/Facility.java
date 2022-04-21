package case_study.furama_resort.models;

public abstract class Facility {
    private String serviceName;
    private Double usingArea;
    private Integer rentingFee;
    private Integer maximumPax;
    private String rentingType;

    public Facility() {
    }

    public Facility(String serviceName, Double usingArea, Integer rentingFee, Integer maximumPax, String rentingType) {
        this.serviceName = serviceName;
        this.usingArea = usingArea;
        this.rentingFee = rentingFee;
        this.maximumPax = maximumPax;
        this.rentingType = rentingType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Double getUsingArea() {
        return usingArea;
    }

    public void setUsingArea(Double usingArea) {
        this.usingArea = usingArea;
    }

    public Integer getRentingFee() {
        return rentingFee;
    }

    public void setRentingFee(Integer rentingFee) {
        this.rentingFee = rentingFee;
    }

    public Integer getMaximumPax() {
        return maximumPax;
    }

    public void setMaximumPax(Integer maximumPax) {
        this.maximumPax = maximumPax;
    }

    public String getRentingType() {
        return rentingType;
    }

    public void setRentingType(String rentingType) {
        this.rentingType = rentingType;
    }
}
